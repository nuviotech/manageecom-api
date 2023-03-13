package com.product.api.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="STOCK")
public class Stock {
	@Id
	@Column(name="STOCK_ID")
	private int stockId;
	
	@Column(name="SKU",length=100)
	private String sku;
	

	@OneToOne(mappedBy = "stock")
	@JsonManagedReference
	private Product2 product;
	
	@Column(name="SHELF_CODE",length=20)
	private String  shelfCode;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="ITEM_LENGTH",length=50)
	private String itemLength;
	
	@Column(name="ITEM_HEIGHT",length=50)
	private String itemHeight;
	
	@Column(name="ITEM_WIDTH",length=50)
	private String itemWidth;
	
	@Column(name="ITEM_WEIGHT",length=50)
	private String itemWeight;
	
	@Column(name="INVENTORY_TYPE",length=2)
	private int inventoryType;
	
	@Column(name="USER_ID",length=100)
	private String userId;
	
	@Column(name="CUD",length=1)
	private String cud;
	
	@Column(name="CREATED_DT_TIME")
	private Date createdDtTime;
	
	@Column(name="SELLING_PRICE",length=50)
	private String sellingPrice;
	
	@Column(name="MIN_SELLING_PRICE",length=50)
	private String minSellingprice;
	
	@Column(name="COMBO_DATA",length=4000)
	private String comboData;
	
	@Column(name="WAREHOUSE_ID")
	private int warehouseId;
	
	@Column(name="OPTIMISE_PRICE")
	private String optimisePrice;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}

	public Product2 getProduct() {
		return product;
	}

	public void setProduct(Product2 product) {
		this.product = product;
	}

	public String getShelfCode() {
		return shelfCode;
	}

	public void setShelfCode(String shelfCode) {
		this.shelfCode = shelfCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getItemLength() {
		return itemLength;
	}

	public void setItemLength(String itemLength) {
		this.itemLength = itemLength;
	}

	public String getItemHeight() {
		return itemHeight;
	}

	public void setItemHeight(String itemHeight) {
		this.itemHeight = itemHeight;
	}

	public String getItemWidth() {
		return itemWidth;
	}

	public void setItemWidth(String itemWidth) {
		this.itemWidth = itemWidth;
	}

	public String getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(String itemWeight) {
		this.itemWeight = itemWeight;
	}

	public int getInventoryType() {
		return inventoryType;
	}

	public void setInventoryType(int inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCud() {
		return cud;
	}

	public void setCud(String cud) {
		this.cud = cud;
	}

	public Date getCreatedDtTime() {
		return createdDtTime;
	}

	public void setCreatedDtTime(Date createdDtTime) {
		this.createdDtTime = createdDtTime;
	}

	public String getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getMinSellingprice() {
		return minSellingprice;
	}

	public void setMinSellingprice(String minSellingprice) {
		this.minSellingprice = minSellingprice;
	}

	public String getComboData() {
		return comboData;
	}

	public void setComboData(String comboData) {
		this.comboData = comboData;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getOptimisePrice() {
		return optimisePrice;
	}

	public void setOptimisePrice(String optimisePrice) {
		this.optimisePrice = optimisePrice;
	}

	@Override
	public String toString() {
		return " {\"stockId\" : " + stockId + ", \"sku\":\"" + sku + "\",\"shelfCode\":\"" + shelfCode
				+ "\", \"quantity\":" + quantity + ", \"itemLength\":\"" + itemLength + "\", \"itemHeight\":\"" + itemHeight
				+ "\", \"itemWidth\":\"" + itemWidth + "\", \"itemWeight\":\"" + itemWeight + "\", \"inventoryType\":" + inventoryType
				+ "}";
	}
	
}
