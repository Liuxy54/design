package com.liuxy.design.liuxydesign.observe.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Client
 * @Description 有很多时候，观察者需要根据事件的具体情况来处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/9/5 14:15
 **/
public class Client {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }


    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {

        this.cry = true;
        observers.forEach(observer -> observer.actionOnWakeUp(new WakeUpEvent(System.currentTimeMillis(),"bed",this)));
    }
}

interface Observer {
    void actionOnWakeUp(WakeUpEvent event);
}



class Dad implements Observer{
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }
}
class Mum implements Observer {
    public void hug() {
        System.out.println("Mum hugging...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        hug();
    }
}
class Dog implements Observer{
    public void wang() {
        System.out.println("Dog wang...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        wang();
    }
}

class WakeUpEvent extends Event<Child>{
    long timestamp;
    String loc;
    Child source;

    public WakeUpEvent(long timestamp, String loc,Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Child getSource() {
        return source;
    }
}

abstract class Event<T> {
    abstract T getSource();
}
