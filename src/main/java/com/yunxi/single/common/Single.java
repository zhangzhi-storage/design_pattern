package com.yunxi.single.common;

public class Single {
    /**
     * 创建一个Single对象
     */
    private static Single singleInstance=new Single();

    /**
     * 让构造函数为private,这样该类就不会被实例化
     */
    private Single(){}

    /**
     * 获取单例对象
     * @return  返回单例对象
     */
    public static Single getInstance(){
        return singleInstance;
    }
    public void sayHello(){
        System.out.println("hello design pattern");
    }
}
