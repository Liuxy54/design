package com.liuxy.design.liuxydesign.facade;

/**
 * @ClassName Facade
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/30 15:42
 **/
public class Facade {
    private SubStytem subStytem = new SubStytem();

    public void watchMovie() {
        subStytem.turnOnTV();
        subStytem.setCD("ddd");
        subStytem.startWatching();
    }
}
