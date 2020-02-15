package com.pine.ch01;

/**
 * @author 【享学课堂】 King老师
 * 需要往期视频的同学加QQ：2238709299（芊芊老师）
 * 需要咨询VIP课程的同学加QQ：1011843464 （依娜老师）
 * 常量池的变化
 */
public class ConstantPool {
    public static void main(String[] args) {
        String b = "享学";
        String a = b+"课堂";

        System.out.println(a.intern()==a);

    }
}
