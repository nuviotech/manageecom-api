package com.product.api.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sales_Order_Item")
public class SalesOrderItem {
	
	@Id
	@Column(name="SALES_ORDER_ITEM_ID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int salesOrderItemId;
	
	@Column(name="SKU")
	String sku;
	
	@Column(name="QUANTITY")
	int quantity;
	
	@Column(name="SALES_ORDER_ID")
	int SalesOrderId;
	
	@Column(name="ORDER_ITEM_STATUS")
	String orderItemStatus;
	
	@Column(name="SOLD_PRICE")
	double soldPrice;
	
	@Column(name="TAX_RATE")
	double taxRate;
	
	@Column(name="TAX_TYPE",length=10)
	String taxType;
	
	@Column(name="TAX_AMOUNT")
	double taxAmount;
	
	@Column(name="ITEM_PRICE")
	String itemPrice;
	
	@Column(name="ITEM_TAX")
	String itemTax;
	
	@Column(name="SHIPPING_PRICE")
	String shippingPrice;
	
	@Column(name="ITEM_NAME",length=1000)
	String itemName;

	public int getSalesOrderItemId() {
		return salesOrderItemId;
	}

	public void setSalesOrderItemId(int salesOrderItemId) {
		this.salesOrderItemId = salesOrderItemId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSalesOrderId() {
		return SalesOrderId;
	}

	public void setSalesOrderId(int salesOrderId) {
		SalesOrderId = salesOrderId;
	}

	public String getOrderItemStatus() {
		return orderItemStatus;
	}

	public void setOrderItemStatus(String orderItemStatus) {
		this.orderItemStatus = orderItemStatus;
	}

	public double getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(double soldPrice) {
		this.soldPrice = soldPrice;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemTax() {
		return itemTax;
	}

	public void setItemTax(String itemTax) {
		this.itemTax = itemTax;
	}

	public String getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(String shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	
	
}
