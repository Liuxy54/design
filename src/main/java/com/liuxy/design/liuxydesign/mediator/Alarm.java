package com.liuxy.design.liuxydesign.mediator;

/**
 * @ClassName Alarm
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/30 15:51
 **/
public class Alarm extends Colleague{
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm(){
        System.out.println("doAlarm");
    }
}
