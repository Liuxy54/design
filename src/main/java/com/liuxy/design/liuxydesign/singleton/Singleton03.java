package com.liuxy.design.liuxydesign.singleton;

/**
 * lazy loading 懒汉式
 * 虽然达到了按需初始化到目的，但却带来了线程不安全的问题
 **/
public class Singleton03 {
    private static Singleton03 INSTANCE;

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton03.getInstance().hashCode());
            },"多线程创建单例").start();
        }
    }
}
