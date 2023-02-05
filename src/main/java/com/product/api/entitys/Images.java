package com.product.api.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Images {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int id;
	String name;
	String alternativeText;
	String url;
	@ManyToOne
	Product2 product2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlternativeText() {
		return alternativeText;
	}
	public void setAlternativeText(String alternativeText) {
		this.alternativeText = alternativeText;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Product2 getProduct() {
		return product2;
	}
	public void setProduct(Product2 product2) {
		this.product2 = product2;
	}
	@Override
	public String toString() {
		return "{\"id\":" + id + ", \"name\":\"" + name + "\", \"alternativeText\":" + alternativeText + ", \"url\":\"" + url
				+ "\" }";
	}
	
	
	
}
