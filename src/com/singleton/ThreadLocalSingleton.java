package com.singleton;

public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}
    //创建实例交给thredlocal
    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL=new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    //提供一个外部访问的方法
    public static ThreadLocalSingleton getInstance(){
        return THREAD_LOCAL.get();
    }
}
