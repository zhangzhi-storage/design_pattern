package com.yunxi.builder;

/**
 * 食物接口
 */
public interface Food {
    /**
     * 食物名称
     * @return
     */
    String name();

    /**
     * 食物包装盒
     * @return  食物包装盒
     */
    Packing packing();
    /**
     * 食物价格
     * @return 食物价格
     */
    float price();
}
