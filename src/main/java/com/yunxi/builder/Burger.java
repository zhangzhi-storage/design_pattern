package com.yunxi.builder;


/**
 * 汉堡
 */
public abstract class Burger implements Food{
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
