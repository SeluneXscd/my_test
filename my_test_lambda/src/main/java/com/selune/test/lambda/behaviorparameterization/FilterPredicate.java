package com.selune.test.lambda.behaviorparameterization;

/**
 * @author Su
 * @date 2019/12/26
 */

public interface FilterPredicate<T> {
	/**
	 * @param t
	 * @return
	 */
	boolean test(T t);
}
