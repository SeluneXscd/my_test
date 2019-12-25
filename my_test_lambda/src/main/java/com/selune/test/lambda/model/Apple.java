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
	private String color;
	
	public Apple(Double weight, String color) {
		this.weight = weight;
		this.color = color;
	}
	
	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}
	
	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}
}
