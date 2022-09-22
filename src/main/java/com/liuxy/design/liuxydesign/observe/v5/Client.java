package com.liuxy.design.liuxydesign.observe.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Client
 * @Description TODO
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
        observers.forEach(observer -> observer.actionOnWakeUp());
    }
}

interface Observer {
    void actionOnWakeUp();
}



class Dad implements Observer{
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }
}
class Mum implements Observer {
    public void hug() {
        System.out.println("Mum hugging...");
    }

    @Override
    public void actionOnWakeUp() {
        hug();
    }
}
class Dog implements Observer{
    public void wang() {
        System.out.println("Dog wang...");
    }

    @Override
    public void actionOnWakeUp() {
        wang();
    }
}
