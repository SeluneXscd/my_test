package com.selune.test.my.test.mongo.dao;

import com.selune.test.my.test.mongo.enums.UserErrorCode;
import com.selune.test.my.test.mongo.exception.UserException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @Author xyp
 * @Time 2019/11/12 14:00
 */

@Slf4j
public abstract class IBaseDaoImpl<T> implements IBaseDao<T> {
	
	/**
	 * getEntityClass
	 * @return Class<T>
	 */
	protected abstract Class<T> getEntityClass();
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	@Override
	public void save(T t, String collectionName) {
		mongoTemplate.save(t, collectionName);
	}
	
	@Override
	public void delete(T t, String collectionName) {
		if (Objects.nonNull(t)) {
			mongoTemplate.remove(t, collectionName);
		}
	}
	
	@Override
	public void update(Map<String, Object> updateContent, String collectionName) {
		if (updateContent.isEmpty()) {
			return;
		}
		if (updateContent.containsKey(UserField.ID)) {
			throw new UserException(UserErrorCode.UPDATE_NEED_ID_OR_IDS.toString());
		}
		
		
	}
	
	@Override
	public T find(Serializable id, String collectionName) {
		return null;
	}
	
	@Override
	public List<T> findAll(String collectionName) {
		return null;
	}
	
	@Override
	public List<T> findAll(String order, String collectionName) {
		return null;
	}
	
	@Override
	public List<T> findByProp(String propName, Object value, String collectionName) {
		return null;
	}
	
	@Override
	public List<T> findByProp(String propName, Object value, String order, String collectionName) {
		return null;
	}
	
	@Override
	public List<T> findByProps(String[] propName, Object[] values, String collectionName) {
		return null;
	}
	
	@Override
	public List<T> findByProps(String[] propName, Object[] values, String order, String collectionName) {
		return null;
	}
	
	@Override
	public T uniqueByProp(String propName, Object value, String collectionName) {
		return null;
	}
	
	@Override
	public T uniqueByProps(String[] propName, Object[] values, String collectionName) {
		return null;
	}
	
	@Override
	public Long countByCondition(String[] params, Object[] values, String collectionName) {
		return null;
	}
}
