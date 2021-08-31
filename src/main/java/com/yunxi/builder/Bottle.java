package com.yunxi.builder;

/**
 * 纸杯
 */
public  class Bottle implements Packing {
    /**
     * 包装食物
     * @return 包装盒
     */
    @Override
    public String pack() {
        return "纸杯";
    }
}
