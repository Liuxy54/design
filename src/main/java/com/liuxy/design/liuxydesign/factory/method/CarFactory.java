package com.liuxy.design.liuxydesign.factory.method;

/**
 * @ClassName CarFactory
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/24 21:04
 **/
public class CarFactory {

    public Moveable createCar() {
        System.out.println("a car created!");
        return new Car();
    }
}
