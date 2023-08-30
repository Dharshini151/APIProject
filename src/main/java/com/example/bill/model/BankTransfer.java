package com.example.bill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="_bankTransfer")
public class BankTransfer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String recipientName;
	private String recipientBankName;
	private String recipentAccountNum;
	private String amount;
	
	public BankTransfer() {
		super();
	}
	public BankTransfer(Long id, String recipientName, String recipientBankName, String recipentAccountNum,
			String amount) {
		super();
		this.id = id;
		this.recipientName = recipientName;
		this.recipientBankName = recipientBankName;
		this.recipentAccountNum = recipentAccountNum;
		this.amount = amount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getRecipientBankName() {
		return recipientBankName;
	}
	public void setRecipientBankName(String recipientBankName) {
		this.recipientBankName = recipientBankName;
	}
	public String getRecipentAccountNum() {
		return recipentAccountNum;
	}
	public void setRecipentAccountNum(String recipentAccountNum) {
		this.recipentAccountNum = recipentAccountNum;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}