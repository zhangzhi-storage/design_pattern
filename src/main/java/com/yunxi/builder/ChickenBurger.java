package com.yunxi.builder;

/**
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {
    /**
     * 食物名称
     * @return 食物名称
     */
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    /**
     * 食物价格
     * @return 食物价格
     */
    @Override
    public float price() {
        return 20;
    }
}
