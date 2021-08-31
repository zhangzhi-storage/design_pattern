package com.yunxi.single.common;

public class SingDemo {
    public static void main(String[] args) {
    //    Single single=new Single();
        //获取单例对象
        Single instance = Single.getInstance();
        instance.sayHello();
    }
}
