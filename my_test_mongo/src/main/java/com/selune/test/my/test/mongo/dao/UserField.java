package com.selune.test.my.test.mongo.dao;

import lombok.Data;

/**
 * @Author xyp
 * @Time 2019/11/12 14:09
 */

@Data
public class UserField {

	private UserField() {}
	
	/**
	 * id
	 */
	public static final String ID = "id";
	/**
	 * name
	 */
	public static final String NAME = "name";
	/**
	 * age
	 */
	public static final String AGE = "age";
	/**
	 * sex
	 */
	public static final String SEX = "sex";
}