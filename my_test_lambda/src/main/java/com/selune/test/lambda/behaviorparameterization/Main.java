package com.selune.test.lambda.behaviorparameterization;

import com.selune.test.lambda.model.Apple;
import java.util.ArrayList;
import java.util.Arrays;
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
    
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple(150d, "red"),
                new Apple(100d, "green"),
                new Apple(120d, "red"));
        List<Apple> redApples = filterApple(apples, (Apple apple) -> "red".equals(apple.getColor()));
        List<Apple> weightApples = filterApple(apples, (Apple apple) -> apple.getWeight() > 100d);
        
        List<Integer> nums = filter(Arrays.asList(1, 2, 3), (Integer i) -> i > 0);
    }
    
    public static <T> List<T> filter(List<T> list, FilterPredicate<T> filterPredicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (filterPredicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
    
}
