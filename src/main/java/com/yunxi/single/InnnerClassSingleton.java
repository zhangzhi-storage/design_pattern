package com.yunxi.single;

/**
 * 内部类模式单例
 */
public class InnnerClassSingleton {
    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final InnnerClassSingleton INSTANCE=new InnnerClassSingleton();
    }
    private InnnerClassSingleton(){

    }
    public static final InnnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
