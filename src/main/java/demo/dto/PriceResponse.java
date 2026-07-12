package demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


public class PriceResponse {

	private String cycleName;

	private double totalPrice;

	public PriceResponse(String cycleName2, double price2) {
		
		cycleName = cycleName2;
		totalPrice = price2;
	}

	public String getCycleName() {
		return cycleName;
	}

	public void setCycleName(String cycleName) {
		this.cycleName = cycleName;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
