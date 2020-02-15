package com.pine.ch01;


import java.io.InputStream;
import java.nio.ByteBuffer;

/**
 * 享学课堂——虚拟机栈
 */
public class JavaStack {
    //常量
    final String Fs ="常在河边走，哪有不湿鞋!";
    //静态变量
    static String Ss="以静制动";
    //King老师出差
    int count =0;//调用king方法次数的变量(实例变量)
    public void king(int money){
        count++;
        Object o;
        System.out.println(Ss);//静态变量的打印
        money = money -100; //花费100
        System.out.println(Fs);//常量
     }
    public static void main(String[] args)throws Throwable {
        JavaStack javaStack = new JavaStack();
        javaStack.king(10000);
        Object object = new Object();
        object.hashCode();
        //直接分配128M的本地内存(100M)
        ByteBuffer bb = ByteBuffer.allocateDirect(128*1024*1204);
        InputStream
                OutputStrram;
    }
}
