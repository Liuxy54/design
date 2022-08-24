package com.liuxy.design.liuxydesign.singleton;

/**
 * lazy loading 懒汉式
 * 虽然达到了按需初始化到目的，但却带来了线程不安全的问题
 * 可以通过synchronized j解决，同时带来销量下降
 **/
public class Singleton05 {
    private static Singleton05 INSTANCE;

    private Singleton05() {
    }

    public static  Singleton05 getInstance() {
        if (INSTANCE == null) {
            //妄图通过减少同步代码块的方式提高效率，不可行
            synchronized (Singleton05.class) {
                try {
                    Thread.sleep(1);
                    System.out.println(Thread.currentThread().getName());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                INSTANCE = new Singleton05();
            }
        }
        return INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton05.getInstance().hashCode());
            },"多线程创建单例").start();
        }
    }
}
