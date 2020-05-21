package com.singleton;

/**
 * 饿汉式：
 *  只有在外部调用时候才创建对象
 *  优点：节省内存浪费
 *  缺点：线程安全  效率也高了
 */
public class HungrySingleton3 {
    private HungrySingleton3(){}

    private static volatile HungrySingleton3 hungrySingleton;

    public static HungrySingleton3 getInstance() {
        if (hungrySingleton == null) {
            synchronized (HungrySingleton3.class) {
                if (hungrySingleton == null) {
                    hungrySingleton = new HungrySingleton3();
                }
            }
        }
        return hungrySingleton;
    }

}
