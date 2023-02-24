package com.product.api.entitys;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Product2 {
	
	@Column(name="Product_Reference_id")
	@Id
	String id;
	
	@Column(name="CUD",length = 1)
	String cud;
	
	@Column(name="SKU")
	String sku;
	
	@Column(name="Title")
	String title;
	
	@Transient
	int quantity;
	
	@Column(name="is_featured")
	boolean is_featured;
	
	@Column(name="is_hot")
	boolean is_hot;
	
	double sale_price;
	String vendor;
	
	int categoryId;
	
	int depot;

	boolean is_active=true;

	String slug;//this is sub category
	
	@Column(name="CREATED_DT_TIME")
	Date createdDtTime;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product2")
	List<Images> images;
	
	@ManyToOne
	Stores store;
	
	@Column(name="MRP")
	double price;
	
	@Column(name="Material")
	String material;
	
	@Column(name="Brand")
	String brand;
	
	@Column(name="Color")
	String color;
	
	@Column(name="Description")
	String description;
	
	@Column(name="USER_ID")
	String userId;
	
	
	@OneToOne(mappedBy = "product")
	@JsonBackReference
	Stock stock;
	
	
	public String getProductRefId() {
		return id;
	}

	public void setProductRefId(String productRefId) {
		this.id = productRefId;
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
		return price;
	}

	public void setMrp(double mrp) {
		this.price = mrp;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isIs_featured() {
		return is_featured;
	}

	public void setIs_featured(boolean is_featured) {
		this.is_featured = is_featured;
	}

	public boolean isIs_hot() {
		return is_hot;
	}

	public void setIs_hot(boolean is_hot) {
		this.is_hot = is_hot;
	}

	public double getSale_price() {
		return sale_price;
	}

	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getDepot() {
		return depot;
	}

	public void setDepot(int depot) {
		this.depot = depot;
	}

	

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	

	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Stores getStore() {
		return store;
	}

	public void setStore(Stores store) {
		this.store = store;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "{\"id\":" + id + ", \"sku\":\"" + sku + "\", \"title\":\"" + title + "\", \"quantity\":" + 12 + ", \"is_featured\":"
				+ is_featured + ", \"is_hot\":" + is_hot + ", \"sale_price\":" + sale_price + ", \"vendor\":\"" + vendor + "\", \"depot\":" + depot + ", \"is_active\":" + is_active + ", \"slug\":\"" + slug + "\", \"images\":" + images + ", \"store\":[" + store + "], \"price\":" + price
				+ ", \"material\":\"" + material + "\", \"brand\":\"" + brand + "\", \"color\":\"" + color + "\", \"description\":\"" + description
				+ "\"}";
	}
	
	
	
}
