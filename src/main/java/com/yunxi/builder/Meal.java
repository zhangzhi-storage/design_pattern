package com.yunxi.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐接口
 */
public class Meal {
    private List<Food> foodList=new ArrayList<>();
    public void addFood(Food food){
        foodList.add(food);
    }
    public float getCost(){
        float cost=0f;
        for (Food food : foodList) {
            cost+=food.price();
        }
        return cost;
    }
    public void showFood(){
        for (Food food : foodList) {
            System.out.println("Food: "+food.name());
            System.out.println("Packing: "+food.packing().pack());
            System.out.println("Price:"+food.price());
        }
    }

}
