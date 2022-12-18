package com.product.api.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
	
	@Id
	int STOCK_ID;
	
	@Column(name="SKU")
	String sku;
	@Column(name="USER_ID")
	String userId;
	@Column(name="QUANTITY")
	int quentity;
	public int getSTOCK_ID() {
		return STOCK_ID;
	}
	public void setSTOCK_ID(int sTOCK_ID) {
		STOCK_ID = sTOCK_ID;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	
	
}
