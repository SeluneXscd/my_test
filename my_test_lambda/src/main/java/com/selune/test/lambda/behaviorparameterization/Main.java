package com.selune.test.lambda.behaviorparameterization;

import com.selune.test.lambda.model.Apple;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Su
 * @date 2019/12/25
 */

public class Main {
    
    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
    
}
