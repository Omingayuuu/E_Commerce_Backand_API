package com.pxp.SQLite.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reviews {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne
    @JoinColumn(name = "orders", referencedColumnName = "id")
    private Orders order;
	
	private int id_users;
	
	private int star;
	
	private String description;

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Reviews(int id, Orders order, int star, String description) {
		super();
		this.id = id;
		this.order = order;
		this.star = star;
		this.description = description;
	}
	
	public Reviews(int id, int id_users, int star, String description) {
		super();
		this.id = id;
		this.id_users = id_users;
		this.star = star;
		this.description = description;
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



	public int getStar() {
		return star;
	}



	public void setStar(int star) {
		this.star = star;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	public int getId_users() {
		return id_users;
	}


	public void setId_users(int id_users) {
		this.id_users = id_users;
	}
	
	
}
