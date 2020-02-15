package com.pine.ch01;

/**
 * @author 【享学课堂】 King老师
 * 为什么JVM需要使用栈
 */
public class StackFilo {
    public static void main(String[] args)
    {
        A();  //A()->B()->C()
    }
    public static  void A(){
        System.out.println("A开始");
        //此处省略100行代码
        B();//调用B方法
        System.out.println("A结束");
    }
    public static void B(){
        System.out.println("B开始");
        //此处省略100行代码
        B();//调用B方法
        System.out.println("B结束");
    }
    public static void C(){
        System.out.println("C开始");
        //此处省略100行代码
        System.out.println("C结束");
    }
}
