package com.example.springbootwebtest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootwebtest.model.Hotel;
import com.example.springbootwebtest.service.TestMybatisService;

@RestController
public class TestMybatisController {
	private final Logger logger = LoggerFactory.getLogger(TestMybatisController.class);
	@Autowired
	private TestMybatisService testMybatisService;
	
	@RequestMapping(value="/getHotelByCountry")
	public List<Hotel> getHotelByCountryF(String country){
		return testMybatisService.findByCountry(country);
	}
}
