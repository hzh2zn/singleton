package com.singleton;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonTest {

    @Test
    public void test1(){
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance2==instance1);
    }

    @Test
    public void test(){
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance2==instance1);
    }

    @Test
    public void test2(){
        new Thread(()-> System.out.println(HungrySingleton.getInstance())).start();
        new Thread(()-> System.out.println(HungrySingleton.getInstance())).start();
    }
    @Test
    public void test3(){
        new Thread(()-> System.out.println(HungrySingleton2.getInstance())).start();
        new Thread(()-> System.out.println(HungrySingleton2.getInstance())).start();
    }

    @Test
    public void test4(){
        StaticSingleton instance1 = StaticSingleton.getInstance();
        StaticSingleton instance2 = StaticSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance2==instance1);
    }

    @Test
    public void test5() throws Exception {
        StaticSingleton instance1 = StaticSingleton.getInstance();
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("obj.txt"));
        outputStream.writeObject(instance1);
        ObjectInputStream input=new ObjectInputStream(new FileInputStream("obj.txt"));
        Object o = input.readObject();
        System.out.println(instance1);
        System.out.println(o);
        System.out.println(o==instance1);
    }

    @Test
    public void test6() throws Exception {
        Class c=StaticSingleton.class;
        Constructor constructor = c.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o1 = constructor.newInstance();
        Object o2 = constructor.newInstance();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
    }


    @Test
    public void test7(){
        EnumSingleton instance1 = EnumSingleton.getInstance();
        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance1.setName("aaaaaaaaaaa");
        String name = instance2.getName();
        System.out.println(name);
    }

    @Test
    public void test8(){
        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1==instance2);

        new Thread(()-> System.out.println(ThreadLocalSingleton.getInstance())).start();


    }

}
