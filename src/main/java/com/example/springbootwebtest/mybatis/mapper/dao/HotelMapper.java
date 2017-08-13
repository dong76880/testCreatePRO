package com.example.springbootwebtest.mybatis.mapper.dao;

import java.util.List;

import com.example.springbootwebtest.model.Hotel;

public interface HotelMapper {  
    
    public List<Hotel> findByCountry(String country);  
} 
