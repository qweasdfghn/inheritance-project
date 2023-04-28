package Test;

import java.util.Date;

public class CarChooseDTO  extends CarList {
	
	private String buyerName;
	private String carType;
	private int price;
	private int orderDate;
	
	public CarChooseDTO() {	}
	
	public CarChooseDTO(String buyerName, String carType, int price, int date) {
		super();
		this.buyerName = buyerName;
		this.carType = carType;
		this.price = price;
		this.orderDate = date;
		
		
	}
	
	
	
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(int orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return "CarChooseDTO [buyerName=" + buyerName + ", carType=" + carType + ", price=" + price + ", orderDate="
				+ orderDate + "]";
	}
	
}