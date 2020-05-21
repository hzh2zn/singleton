package com.singleton;

/**
 * 饿汉式：
 *  只有在外部调用时候才创建对象
 *  优点：节省内存浪费
 *  缺点：线程安全  加锁之后变成串行  执行效率就变低
 */
public class HungrySingleton2 {
    private HungrySingleton2(){}

    private static HungrySingleton2 hungrySingleton;

    public static HungrySingleton2 getInstance(){
        synchronized (HungrySingleton2.class){
            if(hungrySingleton==null){
                hungrySingleton=new HungrySingleton2();
            }
            return hungrySingleton;
        }
    }

}
