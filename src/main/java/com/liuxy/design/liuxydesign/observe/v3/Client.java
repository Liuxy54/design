package com.liuxy.design.liuxydesign.observe.v3;

/**
 * @ClassName Client
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/9/5 14:01
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
    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        this.cry = true;
        d.feed();
    }
}
class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}
