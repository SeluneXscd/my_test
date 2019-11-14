package com.selune.test.my.test.mongo.exception;

/**
 * @Author xyp
 * @Time 2019/11/12 14:13
 */

public class UserException extends RuntimeException {
	private static final long serialVersionUID = -9042456076003736453L;
	
	public UserException(String message) {
		super(message);
	}
}
