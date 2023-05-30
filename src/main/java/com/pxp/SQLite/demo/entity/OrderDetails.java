package com.pxp.SQLite.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "orders", referencedColumnName = "id")
    private Orders order;
	
	@ManyToOne
    @JoinColumn(name = "product", referencedColumnName = "id")
	private Products product;
	
	private int quantity;
	
	private int price;

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderDetails(int id, Orders order, Products product, int quantity, int price) {
		super();
		this.id = id;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Orders getOrder() {
		return order;
	}



	public void setOrder(Orders order) {
		this.order = order;
	}



	public Products getProduct() {
		return product;
	}



	public void setProduct(Products product) {
		this.product = product;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "OrderDetails [order=" + order + ", product=" + product + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
	
}
