package com.liuxy.design.liuxydesign.singleton;

/**
 *
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，jvm保证线程安全
 * 简单实用、推荐实用！
 *
 * Class.forName("")只放在内存，并不实例化
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 *
 *
 **/
public class Singleton01 {
    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {}

    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance1 = Singleton01.getInstance();
        System.out.println(instance == instance1);
    }
}
