package com.finotek.batch.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class testController {
	
	@Autowired
	private MongoTemplate mongo;
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/test1")
	public void test1() {
		
		List<HashMap> list = mongo.find(new Query(), HashMap.class, "CHAT_MENU");
		
		for (HashMap map : list) {
			System.out.println(">>" + map.get("type").toString());
		}
	}
}
