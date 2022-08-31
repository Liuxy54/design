package com.liuxy.design.liuxydesign.factory.abstractFactory;

/**
 * @ClassName MagicFactory
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/26 14:05
 **/
public class MagicFactory extends AbstractFoctory{

    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
