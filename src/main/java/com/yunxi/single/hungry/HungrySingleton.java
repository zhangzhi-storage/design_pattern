package com.yunxi.single.hungry;

/**
 * 饿汉式单例模式
 */
public class HungrySingleton {
    /**
     * 类装载时就实例化
     */
    private static HungrySingleton hungrySingleton=new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
