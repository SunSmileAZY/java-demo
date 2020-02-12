package com.pine.ch05.oom;

import java.util.LinkedList;
import java.util.List;


/**
 * @author pine
 * VM Args：-Xms30m -Xmx30m -XX:+PrintGCDetails    堆的大小30M
 * 堆内存溢出
 */
public class HeapOom {
   public static void main(String[] args)
   {
       //String[] strings = new String[100000000];  //100m的数组（堆）
       List<Object> list = new LinkedList<>(); //在方法执行的过程中，它是GCRoots
       int i =0;
       while(true){
           i++;
           if(i%10000==0) System.out.println("i="+i);
           list.add(new Object());
       }
   }
}
