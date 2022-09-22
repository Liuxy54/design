package com.liuxy.design.liuxydesign.observe.v2;

/**
 * @ClassName Client
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/9/5 13:57
 **/
public class Client {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("observe");
        }
    }
}
class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Waked Up! Crying wu wu wu wu ");
        this.cry = true;
    }
}
