package com.liuxy.design.liuxydesign.strategy;

/**
 * 比较器（比较策略）
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1,T o2);
}
