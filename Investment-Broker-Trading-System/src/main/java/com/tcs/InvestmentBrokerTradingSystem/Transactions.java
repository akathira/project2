package com.tcs.InvestmentBrokerTradingSystem;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions {
	
	@Id 
	private int transactionId;
	private String transactionDate;
	private double transactionAmount;
	private int investerId;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public int getInvesterId() {
		return investerId;
	}
	public void setInvesterId(int investerId) {
		this.investerId = investerId;
	}
	public Transactions(int transactionId, String transactionDate, double transactionAmount, int investerId) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.investerId = investerId;
	}
	@Override
	public String toString() {
		return "Transactions [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", transactionAmount=" + transactionAmount + ", investerId=" + investerId + "]";
	}
	
	

}