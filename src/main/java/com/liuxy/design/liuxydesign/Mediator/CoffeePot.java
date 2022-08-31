package com.liuxy.design.liuxydesign.Mediator;

/**
 * @ClassName CoffeePot
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/30 15:54
 **/
public class CoffeePot extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }
}
