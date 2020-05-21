package com.singleton;

/**
 *  懒汉式：
 *  类加载的时候就创建对象
 *  缺点：有时候会造成内存浪费
 *  优点：没任何锁  性能好 效率高
 */
public class LazySingleton {
    //私有化构造方法
    private LazySingleton(){}
    private static LazySingleton lazySingleton=new LazySingleton();
    //提供外部访问的方法
    public static LazySingleton getInstance(){
        return lazySingleton;
    }
}
