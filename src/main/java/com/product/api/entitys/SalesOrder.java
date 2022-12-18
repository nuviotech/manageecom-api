package com.product.api.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sales_Order")
public class SalesOrder {
	
	@Id
	@Column(name="CHANNEL_ORDER_ID")
	String channelOrderId;
	
	@Column(name="CHANNEL_ID")
	int channelId;
	
	@Column(name="STATUS")
	String status;
	
	@Column(name="USER_ID")
	String userId;
	
	@Column(name="SOLD_PRICE")
	String soldPrice;
	
	@Column(name="REMARKS")
	String remarks;
	
	@Column(name="CUSTOMER_ID")
	int coustomerId;
	
	@Column(name="BUYER_NAME")
	String buyerName;
	
	@Column(name="BUYER_PHONE_NUMBER")
	String buyerPhonenumber;
	
	@Column(name="RECIPIENT_NAME")
	String recepientName;
	
	@Column(name="SHIPPING_ADDRESS1")
	String shippingAddr1;
	
	@Column(name="SHIPPING_ADDRESS2")
	String shippingAddr2;
	
	@Column(name="SHIPPING_ADDRESS3")
	String shippingAddr3;
	
	@Column(name="SHIP_CITY")
	String city;
	
	@Column(name="SHIP_STATE")
	String state;
	
	@Column(name="SHIP_COUNTRY")
	String country;
	
	@Column(name="SHIP_POSTAL_CODE")
	String postalCode;
	
	
	@Column(name="SHIP_PHONE_NUMBER")
	String shipPhoneNumber;
	
	@Column(name="PAYMENT_METHOD")
	String paymentMethod;
	
	@Column(name="COD_COLLECTIBLE_AMOUNT")
	String codCollectibleAmount;
	
	@Column(name="FULFILLED_BY")
	String fulfilledBy;
	
	@Column(name="INVOICE_NUMBER")
	String invoiceNumber;
	
	@Column(name="CATEGORY")
	String category;
	
	@Column(name="WAREHOUSE_ID")
	String warehouseId;
	
	@Column(name="SHIP_DATE")
	Date date;

	public String getChannelOrderId() {
		return channelOrderId;
	}

	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSoldPrice() {
		return soldPrice;
	}

	public void setSoldPrice(String soldPrice) {
		this.soldPrice = soldPrice;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getCoustomerId() {
		return coustomerId;
	}

	public void setCoustomerId(int coustomerId) {
		this.coustomerId = coustomerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerPhonenumber() {
		return buyerPhonenumber;
	}

	public void setBuyerPhonenumber(String buyerPhonenumber) {
		this.buyerPhonenumber = buyerPhonenumber;
	}

	public String getRecepientName() {
		return recepientName;
	}

	public void setRecepientName(String recepientName) {
		this.recepientName = recepientName;
	}

	public String getShippingAddr1() {
		return shippingAddr1;
	}

	public void setShippingAddr1(String shippingAddr1) {
		this.shippingAddr1 = shippingAddr1;
	}

	public String getShippingAddr2() {
		return shippingAddr2;
	}

	public void setShippingAddr2(String shippingAddr2) {
		this.shippingAddr2 = shippingAddr2;
	}

	public String getShippingAddr3() {
		return shippingAddr3;
	}

	public void setShippingAddr3(String shippingAddr3) {
		this.shippingAddr3 = shippingAddr3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getShipPhoneNumber() {
		return shipPhoneNumber;
	}

	public void setShipPhoneNumber(String shipPhoneNumber) {
		this.shipPhoneNumber = shipPhoneNumber;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getCodCollectibleAmount() {
		return codCollectibleAmount;
	}

	public void setCodCollectibleAmount(String codCollectibleAmount) {
		this.codCollectibleAmount = codCollectibleAmount;
	}

	public String getFulfilledBy() {
		return fulfilledBy;
	}

	public void setFulfilledBy(String fulfilledBy) {
		this.fulfilledBy = fulfilledBy;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
