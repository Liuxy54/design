package com.liuxy.design.liuxydesign.singleton;

/**
 * 静态内部类方式
 * JVM 保证单例
 * 加载外部类时不会加载内部类，这样可以实线懒加载
 **/
public class Singleton07 {

    private Singleton07() {
    }

    private static class Singleton07Holder {
        private final static Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return Singleton07Holder.INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton07.getInstance().hashCode());
            }, "多线程创建单例").start();
        }
    }
}
