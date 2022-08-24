package com.liuxy.design.liuxydesign.singleton;

/**
 * lazy loading 懒汉式
 * 虽然达到了按需初始化到目的，但却带来了线程不安全的问题
 * 可以通过synchronized j解决，同时带来销量下降
 **/
public class Singleton04 {
    private static Singleton04 INSTANCE;

    private Singleton04() {
    }

    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(100000);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton04.getInstance().hashCode());
            },"多线程创建单例").start();
        }
    }
}
