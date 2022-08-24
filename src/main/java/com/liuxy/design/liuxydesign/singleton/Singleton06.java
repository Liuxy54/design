package com.liuxy.design.liuxydesign.singleton;

/**
 * lazy loading 懒汉式
 * 虽然达到了按需初始化到目的，但却带来了线程不安全的问题
 * 可以通过synchronized j解决，同时带来销量下降
 * 双重判断,完美但没必要
 **/
public class Singleton06 {
    //如果优化JIT（把代码优化成本地代码）  指令重排，如果不加volatile，没有初始化就会返回INSTANCE，双重校验需要加volatile
    private static volatile Singleton06 INSTANCE;

    private Singleton06() {
    }

    public static Singleton06 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton06.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                        System.out.println(Thread.currentThread().getName());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    INSTANCE = new Singleton06();
                }
            }
        }
        return INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton06.getInstance().hashCode());
            }, "多线程创建单例").start();
        }
    }
}
