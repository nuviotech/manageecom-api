package com.product.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class ChannelController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PostMapping("/marketplace")
	public String marketplace(@PathVariable String marketplace_id, @PathVariable String cud) {
		return "";
	}
}
