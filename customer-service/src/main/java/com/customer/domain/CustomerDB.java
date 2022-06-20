package com.customer.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class CustomerDB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@Column(length = 25, nullable =false)
	String name ;
	@Column(length = 6, nullable =false)
	String gender;
	@Column(length = 50, nullable =false)
	String address;	
	@Column(length = 25, nullable =false)
	String city;
	@Column(length = 7, nullable =false)
	Integer pin;
	@Column(length = 15, nullable =false)
	Long telephone;
	@Column(length = 50, nullable =false)
	String email ;
	@Column(length = 10, nullable =false)
	Date DOB;
	
	Date createdon;
	public Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
