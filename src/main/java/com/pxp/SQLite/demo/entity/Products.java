package com.pxp.SQLite.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@ManyToOne
    @JoinColumn(name = "seller", referencedColumnName = "id")
	private Users seller;
	
	private String title;
	
	private String description;
	
	private String price;
	
	private int stock;
	
	private int id_user;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Products(int id, Users seller, String title, String description, String price, int stock) {
		super();
		this.id = id;
		this.seller = seller;
		this.title = title;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	
	public Products(int id, int id_user, String title, String description, String price, int stock) {
		super();
		this.id = id;
		this.setId_user(id_user);
		this.title = title;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Users getSeller() {
		return seller;
	}



	public void setSeller(Users seller) {
		this.seller = seller;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "Products [id=" + id + ", seller=" + seller + ", title=" + title + ", description=" + description
				+ ", price=" + price + ", stock=" + stock + "]";
	}



	public int getId_user() {
		return id_user;
	}



	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	
}
