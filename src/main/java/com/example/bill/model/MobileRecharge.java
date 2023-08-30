package com.example.bill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="_recharge")
public class MobileRecharge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long rechargeAmount;
	private String phoneNum;
	private String paymentMethod;
	private String validity;
	private String data;
	
	
	public MobileRecharge() {
		super();
	}
	public MobileRecharge(Long id, Long rechargeAmount, String phoneNum, String paymentMethod, String validity, String data) {
		super();
		this.id = id;
		this.rechargeAmount = rechargeAmount;
		this.phoneNum = phoneNum;
		this.paymentMethod = paymentMethod;
		this.validity = validity;
		this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRechargeAmount() {
		return rechargeAmount;
	}
	public void setRechargeAmount(Long rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	

}