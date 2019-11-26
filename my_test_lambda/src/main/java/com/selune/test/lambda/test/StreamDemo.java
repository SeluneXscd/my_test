package com.selune.test.lambda.test;

import com.selune.test.lambda.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Su
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        Apple a1 = new Apple();
        a1.setWeight(100d);
        Apple a2 = new Apple();
        a2.setWeight(200d);
        appleList.add(a1);
        appleList.add(a2);

        // Lambda 顺序处理
        List<Apple> heavyApple = appleList.stream().filter(apple -> apple.getWeight() > 150).collect(Collectors.toList());
        System.out.println(heavyApple);

        // Lambda 并行处理
        List<Apple> heavyApples = appleList.parallelStream().filter(apple -> apple.getWeight() > 150).collect(Collectors.toList());
        System.out.println(heavyApples);
    }
}
