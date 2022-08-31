package com.liuxy.design.liuxydesign.factory.abstractFactory;

/**
 * @ClassName AbstractFoctory
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/26 13:42
 **/
public abstract class AbstractFoctory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
