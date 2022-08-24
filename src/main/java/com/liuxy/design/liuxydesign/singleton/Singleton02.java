package com.liuxy.design.liuxydesign.singleton;

/**
 * 与01相同
 **/
public class Singleton02 {
    private static final Singleton02 INSTANCE;

    static {
        INSTANCE = new Singleton02();
    }
    
    private Singleton02() {
    }

    public static Singleton02 getInstance(){
        return INSTANCE;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance1 = Singleton02.getInstance();
        System.out.println(instance == instance1);
    }
}
