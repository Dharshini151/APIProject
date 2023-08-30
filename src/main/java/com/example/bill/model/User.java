package com.example.bill.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String email;
	private String password; 
	private String accountNum;
	private String phoneNum;
	private String address;
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "bankTransfer_id", referencedColumnName = "id")
	private List<BankTransfer> bankTransfer;
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "payBill_id", referencedColumnName = "id")
	private List<Electricity> paybill;
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "recharge_id", referencedColumnName = "id")
	private List<MobileRecharge>recharge;
	
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(Long id, String userName, String email, String password, String accountNum, String phoneNum,
			String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.accountNum = accountNum;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	public List<BankTransfer> getBankTransfer() {
		return bankTransfer;
	}
	public void setBankTransfer(List<BankTransfer> bankTransfer) {
		this.bankTransfer = bankTransfer;
	}
	public List<Electricity> getPaybill() {
		return paybill;
	}
	public void setPaybill(List<Electricity> paybill) {
		this.paybill = paybill;
	}
	public List<MobileRecharge> getRecharge() {
		return recharge;
	}
	public void setRecharge(List<MobileRecharge> recharge) {
		this.recharge = recharge;
	}
	
}