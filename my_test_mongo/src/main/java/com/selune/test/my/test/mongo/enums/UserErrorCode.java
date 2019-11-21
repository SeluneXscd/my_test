package com.selune.test.my.test.mongo.enums;

/**
 * @Author xyp
 * @Time 2019/11/12 14:15
 */

public enum UserErrorCode {
	
	/**
	 * 更新用户失败 ==> 需要id/ids
	 */
	UPDATE_NEED_ID_OR_IDS("update.need.id.or.ids")
	;
	
	private String code;
	
	UserErrorCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return this.code;
	}
}
