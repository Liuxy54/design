package com.liuxy.design.liuxydesign.observe.v4;

/**
 * @ClassName Client
 * @Description 加入多个观察者
 * @Author liuxy
 * @Date 2022/9/5 14:09
 **/
public class Client {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
class Child {
    private boolean cry = false;
    private Dad d = new Dad();
    private Mum m = new Mum();
    private Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        this.cry = true;
        d.feed();
        m.hug();
        dog.wang();
    }
}
class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}
class Mum {
    public void hug() {
        System.out.println("Mum hugging...");
    }
}
class Dog {
    public void wang() {
        System.out.println("Dog wang...");
    }
}
