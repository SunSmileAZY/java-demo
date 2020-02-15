package com.pine.ch05;

/**
 * @author pine
 * VM Args：-Xms20m -Xmx20m -Xmn2m -XX:+PrintGC
 * jinfo演示
 */
public class JinfoTest {
    //填充数据，造成GC
    public static void main(String[] args) {
        while (true){
            byte[]b=null;
            for(int i=0;i<10;i++){
                b=new byte[1*1024*1024];
            }
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
