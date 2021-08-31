package com.yunxi.builder;

/**
 * 纸盒
 */
public class Wrapper implements Packing{
    /**
     * 包装食物
     * @return 包装盒
     */
    @Override
    public String pack(){
      return "纸盒";
    }
}
