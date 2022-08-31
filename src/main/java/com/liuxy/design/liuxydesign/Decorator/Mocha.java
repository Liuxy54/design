package com.liuxy.design.liuxydesign.Decorator;

/**
 * @ClassName Mocha
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/30 16:09
 **/
public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
