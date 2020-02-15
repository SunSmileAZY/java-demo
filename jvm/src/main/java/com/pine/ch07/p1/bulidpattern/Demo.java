package com.pine.ch07.p1.bulidpattern;

/**
 *类说明：Builder模式
 */
public class Demo {

    public static void main(String[] args) {
        DyBox dwBox = new DyBox();
        System.out.println("我需要一个端午礼盒");
        dwBox.buildDWBox(new DwBuilder());
    }
}
