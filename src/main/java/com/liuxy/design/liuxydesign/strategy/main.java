package com.liuxy.design.liuxydesign.strategy;


import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        int[] a = {9,2,3,5,7,1,4};
        Cat[] cat = {new Cat(9,9),new Cat(2,2),new Cat(3,3),new Cat(7,7),};
//        Dog[] dogs = {new Dog(9),new Dog(2),new Dog(3),new Dog(7)};
//        Sorter<Dog> sorter = new Sorter();
        Sorter<Cat> catSorter = new Sorter<>();
        catSorter.sort(cat,new CatWeightComparator());//可以函数式接口
//        catSorter.sort(cat,new CatHeightComparator());
        System.out.println(Arrays.toString(cat));
    }
}
