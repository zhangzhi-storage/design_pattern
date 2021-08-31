package com.yunxi.builder;

/**
 * 素食汉堡
 */
public class VeBurger extends Burger {
    /**
     * 食物名称
     * @return 食物名称
     */
    @Override
    public String name() {
        return "素食汉堡";
    }

    /**
     * 食物价格
     * @return 食物价格
     */
    @Override
    public float price() {
        return 10;
    }
}
