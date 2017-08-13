//package com.example.springbootwebtest.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.springbootwebtest.model.Person;
//import com.example.springbootwebtest.redis.dao.PersonDao;
//
//@RestController
//public class ObjectRedisController {
//	private static Logger logger=LoggerFactory.getLogger(ObjectRedisController.class);
//	
//	@Autowired
//	private PersonDao personDao;
//	
//	@RequestMapping("/setPerson")  
//    public boolean set(String id,String name,Integer age){
//        logger.debug("访问setPerson:id={},name={},age={}",id,name,age);  
//        Person person=new Person(id,name,age);
//        personDao.save(person);  
//        return true;
//    }  
//      
//    @RequestMapping("/getPerson")  
//    public Person getPerson(String id){  
//        return personDao.getPerson(id);  
//    }
//}
