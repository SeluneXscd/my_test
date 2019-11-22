package com.selune.test.api.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * @Author xyp
 * @Time 2019/11/12 15:37
 */

@Data
public class Apple implements Serializable {
	private static final long serialVersionUID = -4864293657519566768L;
	
	@ApiModelProperty(value = "id", name = "id", required = true, dataType = "Long")
	private Long id;
	@ApiModelProperty(value = "quantity", name = "quantity", required = false, dataType = "Integer")
	private Integer quantity;
	@ApiModelProperty(value = "weight", name = "weight", required = false, dataType = "Double")
	private Double weight;
}
