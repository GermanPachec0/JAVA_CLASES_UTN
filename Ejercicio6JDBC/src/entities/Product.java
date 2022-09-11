package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Product {
	private String name;
	private String description;
	private float price; 
	private boolean shippingIncluded;
	private int id;
	private int stock; 
	private LocalDateTime disabledOn;
	private LocalDate disabledDate;
	private LocalTime disabledTime;
	
	private String dateFormat="dd/MM/yyyy";
	private String timeFormat="HH:mm:ss";
	private String dateTimeFormat = dateFormat+" "+timeFormat;
	
	
	public LocalDateTime getDisabledOn() {
		return disabledOn;
	}
	public void setDisabledOn(LocalDateTime disabledOn) {
		this.disabledOn = disabledOn;
	}
	public LocalDate getDisabledDate() {
		return disabledDate;
	}
	public void setDisabledDate(LocalDate disabledDate) {
		this.disabledDate = disabledDate;
	}
	public LocalTime getDisabledTime() {
		return disabledTime;
	}
	public void setDisabledTime(LocalTime disabledTime) {
		this.disabledTime = disabledTime;
	}


	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isShippingIncluded() {
		return shippingIncluded;
	}
	public void setShippingIncluded(boolean shippingIncluded) {
		this.shippingIncluded = shippingIncluded;
	}
	DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern(dateTimeFormat);
	DateTimeFormatter dFormat = DateTimeFormatter.ofPattern(dateFormat);
	DateTimeFormatter tFormat = DateTimeFormatter.ofPattern(timeFormat);
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", shippingIncluded="
				+ shippingIncluded + ", id=" + id + ", stock=" + stock + ", disableOn=" + (disabledOn==null?null:disabledOn.format(dtFormat)) + ", disabledDate="
				+ (disabledDate==null?null:disabledOn.format(dFormat)) + ", disabledTime=" + (disabledTime==null?null:disabledOn.format(tFormat)) + "]\n";
	}
	


	

}
