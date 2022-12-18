package com.product.api.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Product2 {
	
	@Column(name="Product_Reference_id")
	@Id
	String productRefId;
	
	@Column(name="SKU")
	String sku;
	
	@Column(name="Title")
	String title;
	
	@Transient
	int quantity;
	
	@Column(name="MRP")
	double mrp;
	
	@Column(name="Material")
	String material;
	
	@Column(name="IMAGE_URL1")
	String imageUrl1;
	
	@Column(name="IMAGE_URL2")
	String imageUrl2;
	
	@Column(name="IMAGE_URL3")
	String imageUrl3;
	
	@Column(name="IMAGE_URL4")
	String imageUrl4;
	
	@Column(name="IMAGE_URL5")
	String imageUrl5;
	
	@Column(name="Brand")
	String brand;
	
	@Column(name="Color")
	String color;
	
	@Column(name="Description")
	String description;
	
	@Column(name="USER_ID")
	String userId;
	
	
	
	public String getProductRefId() {
		return productRefId;
	}

	public void setProductRefId(String productRefId) {
		this.productRefId = productRefId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getImageUrl1() {
		return imageUrl1;
	}

	public void setImageUrl1(String imageUrl1) {
		this.imageUrl1 = imageUrl1;
	}

	public String getImageUrl2() {
		return imageUrl2;
	}

	public void setImageUrl2(String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}

	public String getImageUrl3() {
		return imageUrl3;
	}

	public void setImageUrl3(String imageUrl3) {
		this.imageUrl3 = imageUrl3;
	}

	public String getImageUrl4() {
		return imageUrl4;
	}

	public void setImageUrl4(String imageUrl4) {
		this.imageUrl4 = imageUrl4;
	}

	public String getImageUrl5() {
		return imageUrl5;
	}

	public void setImageUrl5(String imageUrl5) {
		this.imageUrl5 = imageUrl5;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
	
	
	
}
