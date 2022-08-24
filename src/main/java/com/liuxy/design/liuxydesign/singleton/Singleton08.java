package com.liuxy.design.liuxydesign.singleton;

/**
 * 静态内部类方式
 * JVM 保证单例
 * 加载外部类时不会加载内部类，这样可以实线懒加载，单例可以被反序列化，枚举单例不会被反序列化的原因是没有构造方法
 **/
public enum Singleton08 {
    INSTANCE;

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton08.INSTANCE.hashCode());
            }, "多线程创建单例").start();
        }
    }
}
