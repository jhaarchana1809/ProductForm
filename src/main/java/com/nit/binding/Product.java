package com.nit.binding;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;

@Component
public class Product {
	@NotNull(message = "Id is required")
	private Integer id;
	@NotNull (message = "Name is required")
	private String name;
	@NotNull (message = "Price is required")
	private double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
