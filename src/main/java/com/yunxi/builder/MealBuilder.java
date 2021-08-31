package com.yunxi.builder;

/**
 * 创建套餐对象
 */
public class MealBuilder {
    /**
     * 创建素食套餐
     * @return 套餐
     */
    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addFood(new VeBurger());
        meal.addFood(new Coke());
        return meal;
    }

    /**
     * 创建鸡肉套餐
     * @return
     */
    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addFood(new ChickenBurger());
        meal.addFood(new Pepsi());
        return meal;
    }
}
