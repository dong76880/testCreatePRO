//package com.example.springbootwebtest.redis.dao;
//
//import javax.annotation.Resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.stereotype.Repository;
//import org.springframework.util.ObjectUtils;
//import org.springframework.util.StringUtils;
//
//import com.example.springbootwebtest.model.Person;
//
//@Repository
//public class PersonDao {
//	
//	@Autowired
//	private RedisTemplate<Object, Object> redisTemplate;
//	@Resource(name="redisTemplate")
//	private ValueOperations<Object, Object> valueOperations;
//
//	public boolean save(Person person){
//		if(ObjectUtils.isEmpty(person)||StringUtils.isEmpty(person.getId())){
//			return false;
//		}
//		valueOperations.set(person.getId(),person );
//		return true;
//	}
//	
//	public Person getPerson(String id){
//		Object obj = valueOperations.get(id);
//		if(!ObjectUtils.isEmpty(obj)){
//			return (Person)obj;
//		}else{
//			return null;
//		}
//	}
//}
