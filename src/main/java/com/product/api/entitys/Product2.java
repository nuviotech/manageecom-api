package com.product.api.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

public class Product2 {
	
	@Column(name="product_reference_id")
	@Id
	String id;
	
	@Column(name="CUD",length = 1)
	String cud;
	
	
	
	@Column(name="Title")
	String title;
	
	@Transient
	int quantity;
	
	double sale_price;
	
	@Column(name="category_id")
	int categoryId;
	
	int depot;

	boolean is_active=true;

	String slug;//this is sub category
	
	@Column(name="CREATED_DT_TIME")
	Date createdDtTime;
	
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product2")
	@Transient
	List<Images> images=new ArrayList<>();
	
	//for images of product
	@Column(name="image_main")
	String imgMain;
	@Column(name="image_url1")
	String imgUrl1;
	@Column(name="image_url2")
	String imgUrl2;
	@Column(name="image_url3")
	String imgUrl3;
	@Column(name="image_url4")
	String imgUrl4;
	@Column(name="image_url5")
	String imgUrl5;
	@Column(name="image_url6")
	String imgUrl6;
	@Column(name="image_url7")
	String imgUrl7;
	@Column(name="image_url8")
	String imgUrl8;
	
	//add the user here
	@ManyToOne
	@JoinColumn(name="USR_ID")
	@JsonManagedReference
	User userId;
	
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
	
	
	
	@OneToOne
	@JsonBackReference
	@JoinColumn(name="STOCK_ID")
	Stock stock;
	
	
	public String getProductRefId() {
		return id;
	}

	public void setProductRefId(String productRefId) {
		this.id = productRefId;
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

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSale_price() {
		return sale_price;
	}

	public void setSale_price(double sale_price) {
		this.sale_price = sale_price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public String getImgMain() {
		return imgMain;
	}

	public void setImgMain(String imgMain) {
		this.imgMain = imgMain;
	}

	public String getImgUrl1() {
		return imgUrl1;
	}

	public void setImgUrl1(String imgUrl1) {
		this.imgUrl1 = imgUrl1;
	}

	public String getImgUrl2() {
		return imgUrl2;
	}

	public void setImgUrl2(String imgUrl2) {
		this.imgUrl2 = imgUrl2;
	}

	public String getImgUrl3() {
		return imgUrl3;
	}

	public void setImgUrl3(String imgUrl3) {
		this.imgUrl3 = imgUrl3;
	}

	public String getImgUrl4() {
		return imgUrl4;
	}

	public void setImgUrl4(String imgUrl4) {
		this.imgUrl4 = imgUrl4;
	}

	public String getImgUrl5() {
		return imgUrl5;
	}

	public void setImgUrl5(String imgUrl5) {
		this.imgUrl5 = imgUrl5;
	}

	public String getImgUrl6() {
		return imgUrl6;
	}

	public void setImgUrl6(String imgUrl6) {
		this.imgUrl6 = imgUrl6;
	}

	public String getImgUrl7() {
		return imgUrl7;
	}

	public void setImgUrl7(String imgUrl7) {
		this.imgUrl7 = imgUrl7;
	}

	public String getImgUrl8() {
		return imgUrl8;
	}

	public void setImgUrl8(String imgUrl8) {
		this.imgUrl8 = imgUrl8;
	}

	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "{\"id\":" + id + ", \"sku\":\""  + "\", \"title\":\"" + title + "\", \"quantity\":" + 12 + ", \"is_featured\":\"f\""
				+ ", \"is_hot\":\"hot\""  + ", \"sale_price\":" + sale_price + ", \"vendor\":\""  + "\", \"depot\":" + depot + ", \"is_active\":" + is_active + ", \"slug\":\"" + slug + "\", \"images\":" + images + ", \"user\":[" +userId+ "], \"price\":" + price
				+ ", \"material\":\"" + material + "\", \"brand\":\"" + brand + "\", \"color\":\"" + color + "\", \"description\":\"" + description
				+ "\"}";
	} 
}
