package com.liuxy.design.liuxydesign.strategy;

/**
 * @ClassName DogComparator
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/8/24 19:30
 **/
public class CatHeightComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height > o2.height) {
            return -1;
        }
        else if (o1.height < o2.height) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
