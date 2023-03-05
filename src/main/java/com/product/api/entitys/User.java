package com.product.api.entitys;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="USER")
public class User{
	
	@Column(name="LOGIN_ID")
	@Id
	private String loginId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="COMPANY_NAME")
	private String Companyname;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userId")
	List<Product2> ptrs;



	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompanyname() {
		return Companyname;
	}

	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	public List<Product2> getPtrs() {
		return ptrs;
	}

	public void setPtrs(List<Product2> ptrs) {
		this.ptrs = ptrs;
	}

	@Override
	public String toString() {
		return "{ \"loginId\":\"" + loginId + "\", \"userName\":\"" + userName + "\", \"Companyname\":\"" + Companyname + "\"}";
	}
	   
}
