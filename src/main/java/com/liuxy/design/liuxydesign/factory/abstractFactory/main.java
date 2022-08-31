package com.liuxy.design.liuxydesign.factory.abstractFactory;

import com.liuxy.design.liuxydesign.factory.method.CarFactory;
import com.liuxy.design.liuxydesign.factory.method.Moveable;

/**
 * @ClassName main
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/24 20:54
 **/
public class main {
    public static void main(String[] args) {
        AbstractFoctory foctory = new ModernFactory();
        foctory.createFood().printName();
        foctory.createVehicle().go();
        foctory.createWeapon().shoot();
        AbstractFoctory magicFactory = new MagicFactory();
        magicFactory.createFood().printName();
        magicFactory.createWeapon().shoot();
        magicFactory.createVehicle().go();
    }
}
