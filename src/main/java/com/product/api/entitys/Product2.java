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
import javax.persistence.Transient;

@Entity
public class Product2 {
	
	@Column(name="Product_Reference_id")
	@Id
	String id;
	
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
	int review;
	boolean is_out_of_stock;
	int depot;
	int inventory;
	boolean is_active;
	boolean is_sale;
	String slug;//this is sub category
	Date created_at;
	Date updated_at;
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

	public int getReview() {
		return review;
	}

	public void setReview(int review) {
		this.review = review;
	}

	public boolean isIs_out_of_stock() {
		return is_out_of_stock;
	}

	public void setIs_out_of_stock(boolean is_out_of_stock) {
		this.is_out_of_stock = is_out_of_stock;
	}

	public int getDepot() {
		return depot;
	}

	public void setDepot(int depot) {
		this.depot = depot;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public boolean isIs_sale() {
		return is_sale;
	}

	public void setIs_sale(boolean is_sale) {
		this.is_sale = is_sale;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
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

	@Override
	public String toString() {
		return "{\"id\":" + id + ", \"sku\":\"" + sku + "\", \"title\":\"" + title + "\", \"quantity\":" + 12 + ", \"is_featured\":"
				+ is_featured + ", \"is_hot\":" + is_hot + ", \"sale_price\":" + sale_price + ", \"vendor\":\"" + vendor + "\", \"review\":"
				+ review + ", \"is_out_of_stock\":" + is_out_of_stock + ", \"depot\":" + depot + ", \"inventory\":" + inventory
				+ ", \"is_active\":" + is_active + ", \"is_sale\":" + is_sale + ", \"slug\":\"" + slug + "\", \"created_at\":" + created_at
				+ ", \"updated_at\":" + updated_at + ", \"images\":" + images + ", \"store\":[" + store + "], \"price\":" + price
				+ ", \"material\":\"" + material + "\", \"brand\":\"" + brand + "\", \"color\":\"" + color + "\", \"description\":\"" + description
				+ "\"}";
	}
	
	
	
}
