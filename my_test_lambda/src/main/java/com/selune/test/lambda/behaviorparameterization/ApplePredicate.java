package com.selune.test.lambda.behaviorparameterization;

import com.selune.test.lambda.model.Apple;

/**
 * @author Su
 * @date 2019/12/25
 */

public interface ApplePredicate {
  /**
   * test
   *
   * @param apple
   * @return
   */
  Boolean test(Apple apple);
}
