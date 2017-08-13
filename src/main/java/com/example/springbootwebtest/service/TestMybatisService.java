package com.example.springbootwebtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootwebtest.model.Hotel;
import com.example.springbootwebtest.mybatis.mapper.dao.HotelMapper;

@Service
public class TestMybatisService {

	@Autowired
	private HotelMapper hotelMapper;
	public List<Hotel> findByCountry(String country){
        return hotelMapper.findByCountry(country);
    }
}
