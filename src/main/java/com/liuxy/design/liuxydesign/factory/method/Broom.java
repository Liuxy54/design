package com.liuxy.design.liuxydesign.factory.method;

/**
 * @ClassName Broom
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/24 20:58
 **/
public class Broom implements Moveable{
    @Override
    public void go() {
        System.out.println("Broom flying chua chua chua ");
    }
}
