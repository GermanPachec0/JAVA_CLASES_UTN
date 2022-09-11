package data;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.*;
import java.util.LinkedList;

import entities.Product;

public class DbHandler {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String host = "localhost";
	private String port = "3306";
	private String user = "java";
	private String password ="himitsu";
	private String db = "ejercicio_07";
	private Connection conn= null;
	Statement stmt=null;
	ResultSet rs=null;
	
	public DbHandler() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	private Connection getConnection() {
		try {
			if(this.conn == null || this.conn.isClosed()) {
			this.conn= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db,user,password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	  
		
		return this.conn;
	}
	
	private void releaseConnection() {
		try {
		if(this.conn != null && this.conn.isClosed() ) {
			this.conn.close();
		}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	  
		
	}
	
	public LinkedList <Product> list(){
		
		LinkedList <Product> prods = new LinkedList <Product>();
		
		
		
	
	  
		try {
			
			conn= this.getConnection();
		    stmt =  conn.createStatement();
		    rs=stmt.executeQuery("Select * from product");
			while(rs != null && rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getFloat("price"));
				p.setStock(rs.getInt("stock"));
				p.setShippingIncluded(rs.getBoolean("shippingIncluded"));
				p.setDisabledOn(rs.getObject("disabledOn", LocalDateTime.class));
				p.setDisabledDate(rs.getObject("disabledDate", LocalDate.class));
				p.setDisabledTime(rs.getObject("disabledTime", LocalTime.class));
				
				prods.add(p);
			
			}
			
			return prods;
		
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	
		}
		
	
	   
		public Product search(Product p) {// Recibe un product
			
			PreparedStatement stmt = null;
			ResultSet rs  = null;
			conn= this.getConnection();
			
			try {
				
				Product prod= null;
				stmt=conn.prepareStatement("SELECT * From Product where id = ?");
				stmt.setInt(1,p.getId());
				rs=stmt.executeQuery();
			
			if(rs!= null && rs.next()) {
				prod= new Product();
				prod.setId(rs.getInt("id"));
				prod.setName(rs.getString("name"));
				prod.setDescription(rs.getString("description"));
				prod.setStock(rs.getInt("stock"));
				prod.setShippingIncluded(rs.getBoolean("shippingIncluded"));
				
				prod.setDisabledOn(rs.getObject("disabledOn", LocalDateTime.class));
				prod.setDisabledDate(rs.getObject("disabledDate", LocalDate.class));
				prod.setDisabledTime(rs.getObject("disabledTime", LocalTime.class));
			}
			return prod;
			
				} catch (SQLException e) {
				
				e.printStackTrace();
				return null;
			}finally {
				try {
					if(rs != null)rs.close();
					if(stmt != null)stmt.close();
					this.releaseConnection();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
				
			
	
	}

		
		
		public void newProduct(Product newprd) {
			PreparedStatement stmt = null;
			ResultSet keyRs  = null;
			conn = this.getConnection();
		
				
			
				
				try {
					
					stmt=conn.prepareStatement("insert into Product (name,description,price,stock,shippingIncluded,disabledOn,disabledDate,disabledTime) "+"values(?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			
				stmt.setString(1, newprd.getName());
				stmt.setString(2, newprd.getDescription());
				stmt.setDouble(3, newprd.getPrice());
				stmt.setInt(4, newprd.getStock());
				stmt.setBoolean(5, newprd.isShippingIncluded());
				stmt.setObject(6,newprd.getDisabledOn());
				stmt.setObject(7,newprd.getDisabledDate());
				stmt.setObject(8,newprd.getDisabledTime());
				
				stmt.executeUpdate();
				keyRs= stmt.getGeneratedKeys();	
				if(keyRs != null && keyRs.next()) {
					newprd.setId(keyRs.getInt(1));
			
			
				}
					} catch (SQLException e) {
				
				}
}

		public void delete(Product delprd) {
			PreparedStatement stmt = null;
		    Connection conn = null;
			conn= this.getConnection();
		
			
				
				try {
					
					stmt=conn.prepareStatement("Delete from product where id= ?");
					
				stmt.setInt(1, delprd.getId());
			
				stmt.executeUpdate();
		}
		catch (SQLException e) {
				e.printStackTrace();
				}finally {	
					try {
					if(rs != null)rs.close();
					if(stmt != null)stmt.close();
					this.releaseConnection();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
			
		}

		public void update(Product updprd) {
			PreparedStatement stmt = null;
		    Connection conn = null;
			conn = this.getConnection();
		
				
			
				
				try {
					
					stmt=conn.prepareStatement("Update product "+"set name=?, description=?,price=?,stock=?,shippingIncluded=? "+", disabledOn=?, disabledDate=?, disabledTime=? "+"where id = ?");
					
				stmt.setString(1,updprd.getName());
				stmt.setString(2,updprd.getDescription());
				stmt.setDouble(3,updprd.getPrice());
				stmt.setInt(4, updprd.getStock());
			  stmt.setBoolean(5, updprd.isShippingIncluded());
			  stmt.setObject(6, updprd.getDisabledOn());
			  stmt.setObject(7, updprd.getDisabledDate());
			  stmt.setObject(8, updprd.getDisabledTime());
			  stmt.setInt(9, updprd.getId());
			  stmt.executeUpdate();
		}
		catch (SQLException e) {
				e.printStackTrace();
				}finally {	
					try {
					if(rs != null)rs.close();
					if(stmt != null)stmt.close();
					this.releaseConnection();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
			
			
			
		}
		
		
				
				
				
			
			
}
	
	
	
	


