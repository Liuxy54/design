package com.liuxy.design.liuxydesign.factory.method;

/**
 * @ClassName main
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/24 20:54
 **/
public class main {
    public static void main(String[] args) {
        Moveable m  = new CarFactory().createCar();
        m.go();
    }
}
