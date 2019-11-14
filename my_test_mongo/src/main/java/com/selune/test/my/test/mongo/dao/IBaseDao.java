package com.selune.test.my.test.mongo.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Author xyp
 * @Time 2019/11/12 13:43
 */

public interface IBaseDao<T> {
	
	void save(T t, String collectionName);
	
	void delete(T t, String collectionName);
	
	void update(Map<String, Object> updateContent, String collectionName);
	
	T find(Serializable id, String collectionName);
	
	List<T> findAll(String collectionName);
	
	List<T> findAll(String order, String collectionName);
	
	List<T> findByProp(String propName, Object value, String collectionName);
	
	List<T> findByProp(String propName, Object value, String order, String collectionName);
	
	List<T> findByProps(String[] propName, Object[] values, String collectionName);
	
	List<T> findByProps(String[] propName, Object[] values, String order, String collectionName);
	
	T uniqueByProp(String propName, Object value, String collectionName);
	
	T uniqueByProps(String[] propName, Object[] values, String collectionName);
	
	Long countByCondition(String[] params, Object[] values, String collectionName);
	
	
	
}
