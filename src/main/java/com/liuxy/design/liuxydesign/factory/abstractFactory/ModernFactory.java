package com.liuxy.design.liuxydesign.factory.abstractFactory;

/**
 * @ClassName ModernFactory
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/26 14:04
 **/
public class ModernFactory extends AbstractFoctory{
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new Ak47();
    }
}
