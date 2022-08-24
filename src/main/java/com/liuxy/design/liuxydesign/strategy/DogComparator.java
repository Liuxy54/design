package com.liuxy.design.liuxydesign.strategy;

/**
 * @ClassName DogComparator
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/24 19:30
 **/
public class DogComparator implements Comparator<Dog>{
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food < o2.food) {
            return -1;
        }
        else if (o1.food > o2.food) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
