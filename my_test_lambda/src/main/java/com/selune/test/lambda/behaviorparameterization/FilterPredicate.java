package com.selune.test.lambda.behaviorparameterization;

/**
 * @author Su
 * @date 2019/12/26
 */

public interface FilterPredicate<T> {
	/**
	 * xx
	 *
	 * @param t t
	 * @return boolean
	 */
	boolean test(T t);
}
