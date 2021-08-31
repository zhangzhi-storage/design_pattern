package com.yunxi.single.lazy;

/**
 * 线程安全的单例模式
 * 是线程池安全的
 * 实现难度：容易
 * 优点：具备懒加载的模式,第一次调用才初始化，避免内存浪费，能够在多线程保证线程安全
 * 缺点：必须加synchronised锁才能保证单例，但加锁会影响效率
 */
public class ThreadSafeSingleton {
    /**
     * 单例对象-延迟实例话
     */
    private static ThreadSafeSingleton threadSafeSingleton;

    /**
     * 构造函数私有化
     */
    private ThreadSafeSingleton(){

    }

    /**
     * 线程安全的单例模式
     * @return
     */
    public static synchronized ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton==null){
            threadSafeSingleton=new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
}
