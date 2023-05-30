package com.pxp.SQLite.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@ManyToOne
    @JoinColumn(name = "buyer", referencedColumnName = "id")
    private Users buyer;
	
	private int id_user;
	
    private String note;
    private String total;
    private String discount;
    private boolean is_paid;
    
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Orders(int id, Users buyer, String note, String total, String discount, boolean is_paid) {
		super();
		this.id = id;
		this.buyer = buyer;
		this.note = note;
		this.total = total;
		this.discount = discount;
		this.is_paid = is_paid;
	}
	
	public Orders(int id, int id_user, String note, String total, String discount, boolean is_paid) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.note = note;
		this.total = total;
		this.discount = discount;
		this.is_paid = is_paid;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Users getBuyer() {
		return buyer;
	}


	public void setBuyer(Users buyer) {
		this.buyer = buyer;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public String getTotal() {
		return total;
	}


	public void setTotal(String total) {
		this.total = total;
	}


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
	}


	public boolean isIs_paid() {
		return is_paid;
	}


	public void setIs_paid(boolean is_paid) {
		this.is_paid = is_paid;
	}


	@Override
	public String toString() {
		return "Orders [id=" + id + ", buyer=" + buyer + ", note=" + note + ", total=" + total + ", discount="
				+ discount + ", is_paid=" + is_paid + "]";
	}


	public int getId_user() {
		return id_user;
	}


	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
}
