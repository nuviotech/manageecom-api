package com.product.api.entitys;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockHistory {
	@Id 
	@Column(name="STOCK_HISTORY_ID")
	private int stockHistoryId;
	
	@Column(name="SKU",length=100)
	private String sku;
	
	@Column(name="CHANGED_QUANTITY",length=50)
	private String changedQuantity;
	
	@Column(name="DESCRIPTION",length=1000)
	private String description;
	
	@Column(name="USER_ID",length=100)
	private String userId;
	
	@Column(name="CREATED_DT_TIME")
	private Date createdTdTime;
	
	@Column(name="CUD",length=1)
	private String cud;
	
	@Column(name="WAREHOUSE_ID")
	private int warehouseId;

	public int getStockHistoryId() {
		return stockHistoryId;
	}

	public void setStockHistoryId(int stockHistoryId) {
		this.stockHistoryId = stockHistoryId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getChangedQuantity() {
		return changedQuantity;
	}

	public void setChangedQuantity(String changedQuantity) {
		this.changedQuantity = changedQuantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreatedTdTime() {
		return createdTdTime;
	}

	public void setCreatedTdTime(Date createdTdTime) {
		this.createdTdTime = createdTdTime;
	}

	public String getCud() {
		return cud;
	}

	public void setCud(String cud) {
		this.cud = cud;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	
}
