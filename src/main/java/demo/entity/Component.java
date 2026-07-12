package demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Component {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String name;
	private String category;
	private Double price;

	private Long model;
	private String pricechangedmonth;
	private Long quantity;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getModel() {
		return model;
	}

	public void setModel(Long model) {
		this.model = model;
	}

	public String getPricechangedmonth() {
		return pricechangedmonth;
	}

	public void setPricechangedmonth(String pricechangedmonth) {
		this.pricechangedmonth = pricechangedmonth;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	

}
