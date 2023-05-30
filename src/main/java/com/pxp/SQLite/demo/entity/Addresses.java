package com.pxp.SQLite.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Addresses {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "id")
	private Users users;
	
	private int id_user;
	
	private String type;
	private String line1;
	private String line2;
	private String city;
	private String province;
	private String postalcode;
		
	public Addresses() {
		
	}
	
	public Addresses(int id, int id_user, String type, String line1, String line2, String city, String province,
			String postalcode) {
		super();
		this.id_user = id_user;
		this.id = id;
		this.type = type;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.province = province;
		this.postalcode = postalcode;
	}

	public Addresses(int id, Users users, String type, String line1, String line2, String city, String province,
			String postalcode) {
		super();
		this.id = id;
		this.users = users;
		this.type = type;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.province = province;
		this.postalcode = postalcode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	
	
}
