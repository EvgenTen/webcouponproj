package com.evgen.coupons.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Coupon {
	private long id;
	private int amount;
	private String title;
	public long getId() {
		return id;
	}
	
	public Coupon() {
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Coupon(long id, int amount, String title) {
		super();
		this.id = id;
		this.amount = amount;
		this.title = title;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", amount=" + amount + ", title=" + title + "]";
	}
	
	

}
