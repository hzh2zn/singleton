package com.singleton;

import java.io.Serializable;
import java.util.Calendar;

/**
 * 静态内部类的方式
 * 性能比较高 静态内部类是懒加载 避免了内存浪费
 * 懒加载 就是静态内部类被用到的时候才加载
 */
public class StaticSingleton implements Serializable {
    private StaticSingleton (){}

    private static class InnerClass{
        //创建实例
        private static StaticSingleton staticSingleton=new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return InnerClass.staticSingleton;
    }

    private Object readResolve(){
        return InnerClass.staticSingleton;
    }
}
