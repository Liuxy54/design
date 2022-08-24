package com.liuxy.design.liuxydesign.strategy;

/**
 * @ClassName Dog
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/24 19:08
 **/
public class Dog implements Comparable<Dog>{

    int food;

    @Override
    public int compareTo(Dog d) {
        if (this.food < d.food) {
            return -1;
        }
        else if (this.food > d.food) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
