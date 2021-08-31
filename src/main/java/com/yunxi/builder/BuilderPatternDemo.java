package com.yunxi.builder;

/**
 * 建造者模式demo
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
    MealBuilder mealBuilder=new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showFood();
        System.out.println("Total Cost:"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\nNon-Veg Meal");
        nonVegMeal.showFood();
        System.out.println("Total Cost: "+nonVegMeal.getCost());
    }

}
