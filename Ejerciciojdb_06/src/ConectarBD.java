import java.sql.*;

public class ConectarBD {
	Connection conn=null;
	ResultSet rs;
	Statement stmt;
	
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	public void coneccion() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	}catch(ClassNotFoundException e)
	{e.printStackTrace();}

	}
	public void crearConeccion (String url , String user, String pass,String accion) {
		
		try {
			
			 conn=DriverManager.getConnection(url,user,pass);
			Statement stmt = conn.createStatement();
		    rs = stmt.executeQuery(accion);
			
		}catch(SQLException ex){
			
			ex.getMessage();
			ex.getSQLState();
			ex.getErrorCode();
		}
	}
		public void crearConeccion2 (String url , String user, String pass,String accion,int id) {
			
			try {
				
				conn=DriverManager.getConnection(url,user,pass);
				PreparedStatement stmt = conn.prepareStatement(accion);
			    stmt.setInt(1,id);
				rs = stmt.executeQuery();
				
			}catch(SQLException ex){
				
				ex.getMessage();
				ex.getSQLState();
				ex.getErrorCode();
			}
		
	
		
		}
		
		public void cerrarConeccion() {
			try {
			if(rs!=null) {rs.close();}
			if(stmt!=null) {stmt.close();}
			conn.close();
			
		    }catch(SQLException ex){
				ex.getMessage();
				ex.getSQLState();
				ex.getErrorCode();
			}
			
		}
		
}
	

