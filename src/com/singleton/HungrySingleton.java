package com.singleton;

/**
 * 饿汉式：
 *  只有在外部调用时候才创建对象
 *  优点：节省内存浪费
 *  缺点：线程不安全
 */
public class HungrySingleton {
    private HungrySingleton(){}

    private static HungrySingleton hungrySingleton;

    public static HungrySingleton getInstance(){
        if(hungrySingleton==null){
            hungrySingleton=new HungrySingleton();
        }
        return hungrySingleton;
    }

}
