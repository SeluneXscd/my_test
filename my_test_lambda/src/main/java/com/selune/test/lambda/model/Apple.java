package com.selune.test.lambda.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @Author xyp
 * @Time 2019/11/12 15:37
 */

@Data
public class Apple implements Serializable {
	private static final long serialVersionUID = -4864293657519566768L;
	
	private Long id;
	private Integer quantity;
	private Double weight;
}
