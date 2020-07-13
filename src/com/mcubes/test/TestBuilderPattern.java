package com.mcubes.test;

import com.mcubes.beans.Laptop;

/**
 * Created by A.A.MAMUN on 7/13/2020.
 */

/**
 * Builder pattern builds a complex object using simple
 * objects and using a step by step approach.
 * This type of design pattern comes under creational
 * pattern as this pattern provides one of the best ways to create an object.
 * A Builder class builds the final object step by step.
 * This builder is independent of other objects.
 */
public class TestBuilderPattern {

    public static void main(String[] args) {

        /**
         * Create 'laptop1' object with required parameter only.
         * Here we don't set any optional parameter. In this case
         * the value of optional parameter return default value.
         */
        Laptop laptop1 = new Laptop.LaptopBuilder("8GB","1TB","Intel core i7").build();
        System.out.println(laptop1.toString());

        /**
         * Create 'laptop2' object providing the required parameter
         * and only one optional parameter.
         */
        Laptop laptop2 = new Laptop.LaptopBuilder("4GB", "1TB", "Intel core i5")
                .setScreenSize(15f)
                .build();
        System.out.println(laptop2.toString());

        /**
         * Create 'laptop3' object by providing all parameter.
         * Pass required parameter by constructor and optional
         * parameter by setter method.
         */
        Laptop laptop3 = new Laptop.LaptopBuilder("4GB", "500TB", "Intel core i5")
                .setScreenSize(13.5f)
                .setOs("Windows 10")
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(laptop3.toString());

    }
}
