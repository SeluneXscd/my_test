package com.selune.test.lambda.behaviorparameterization;

import com.selune.test.lambda.model.Apple;

/**
 * @author Su
 * @date 2019/12/25
 */

public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public Boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
