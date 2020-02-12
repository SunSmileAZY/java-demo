package com.pine.ch05.oom;
/**
 * 栈溢出
 * 1、死递归，下面代码演示的是第一种情况
 * 2、1M *5000线程同时在跑 =5G 内存小于5G
 * @author pine
 */
public class StackOverFlow {

    public void pine(){
        pine();//死递归
     }
    public static void main(String[] args)throws Throwable {
        StackOverFlow javaStack = new StackOverFlow();
        javaStack.pine();
    }
}
