package com.java.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/17
 */
public class Test {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException, IOException, ClassNotFoundException {
        System.out.println("main thread:  "+ThreadLocalInstance.getInstance());
        System.out.println("main thread:  "+ThreadLocalInstance.getInstance());
        System.out.println("main thread:  "+ThreadLocalInstance.getInstance());

        threadTest();
        //reflectMethodTest();
        //serializeTest();
        // reflectFlagTest();


//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();



    }

    /**
     * 1.懒汉式的多线程测试
     */
    static void threadTest() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
    }

    /**
     * 2.序列化和反序列化测试
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    static void serializeTest() throws IOException, ClassNotFoundException {
        //HungrySingleton instance = HungrySingleton.getInstance();
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        //如果把instance序列化到一个文件中，再从文件取出来，那这两个对象还是同一个对象吗
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }

    /**
     * 3.对于在类加载时创建对象的单例，如何进行反射攻击以及解决方案
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    static void initialMethodTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = StaticInnerClassSingleton.class;
        //也可以通过这种方式创建反射对象
//        Class.forName(HungrySingleton.class.getName());
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        //v2 静态内部类
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

        //v1 饿汉式
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }


    /**
     * 4.对于不是延迟创建对象的单例，如何进行反射攻击
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    static void reflectMethodTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Class ObjectClass = LazySingleton.class;
        Class ObjectClass = EnumInstance.class;
        Constructor constructor = ObjectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    /**
     * 测试flag方式避免反射攻击
     *
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    static void reflectFlagTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class ObjectClass = LazySingleton.class;
        Constructor constructor = ObjectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1, true);

        LazySingleton o2 = (LazySingleton) constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }

}
