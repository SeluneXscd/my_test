package com.selune.test.lambda.test;

import com.selune.test.lambda.model.Apple;
import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;

/**
 * 给库存排序，比较苹果的大小
 * @Author xyp
 * @Time 2019/11/12 15:39
 */

public class FilteringApples {
	
	public static void main(String[] args) {
		List<Apple> appleList = new ArrayList<>();
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		appleList.add(a1);
		appleList.add(a2);
		
		// Java 7
		appleList.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}
		});
		
		// Java 8 Lambda
		appleList.sort(comparing(Apple::getWeight));
	}
}
