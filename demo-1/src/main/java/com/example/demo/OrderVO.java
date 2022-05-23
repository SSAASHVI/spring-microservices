package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class OrderVO {

	Integer id;
	@NotBlank
	String item;
	@Min(value = 1)
	float price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
