package com.liuxy.design.liuxydesign.factory.method;

/**
 * @ClassName 方法工厂
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy  方法工厂 precession 前置操作做权限控制，
 * @Date 2022/8/24 21:01
 **/
public class VehicleFactory {

    public Car createCar() {
        //before processing
        return new Car();
    }

    public Broom createBroom() {
        //before processing
        return new Broom();
    }


}
