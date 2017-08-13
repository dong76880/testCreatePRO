package com.example.springbootwebtest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	 protected static Logger logger=LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/")  
    public String helloworld(){  
		logger.debug("è®¿é—®hello");
        return "Hello world!";  
    }  
      
	/**
	 * ²âÊÔhello/{name}
	 */
    @RequestMapping("/hello/{name}")  
    public String hellName(@PathVariable String name){  
    	logger.debug("è®¿é—®helloName,Name={}",name);
        return "Hello "+name;  
    }
}
