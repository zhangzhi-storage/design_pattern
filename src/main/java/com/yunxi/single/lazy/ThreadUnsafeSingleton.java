package com.yunxi.single.lazy;

/**
 * 懒汉式非线程安全实现
 * 不是多线程安全的
 * 实现程度容易
 * 问题：不支持多线程
 */
public class ThreadUnsafeSingleton {
    /**
     * 单例对象-延迟实例化
     */
    private static ThreadUnsafeSingleton threadUnsafeSingleton;

    /**
     * 构造函数私有化
     */
    private ThreadUnsafeSingleton(){

    }

    /**
     * 在使用到Singleton对象的时候进行实例化-延迟实例化
     * @return 单例对象
     */
    public static ThreadUnsafeSingleton getInstance(){
        if(threadUnsafeSingleton==null){
            threadUnsafeSingleton=new ThreadUnsafeSingleton();
        }
        return threadUnsafeSingleton;
    }
}
