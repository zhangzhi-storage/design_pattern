package com.yunxi.builder;

/**
 * 冷饮
 */
public abstract class ColdDrink implements Food {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
