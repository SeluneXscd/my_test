package com.selune.test.api.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * @Author xyp
 * @Time 2019/11/12 11:29
 */

@Data
public class User implements Serializable {
	private static final long serialVersionUID = -996377174718045181L;
	
	@ApiModelProperty(value = "id", name = "id", required = false, dataType = "Long")
	private Long id;
	@ApiModelProperty(value = "name", name = "name", required = false, dataType = "String")
	private String name;
	@ApiModelProperty(value = "age", name = "age", required = false, dataType = "Integer")
	private Integer age;
	@ApiModelProperty(value = "sex", name = "sex", required = false, dataType = "Integer")
	private Integer sex;
}
