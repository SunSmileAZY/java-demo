package com.pine.ch06;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 *类说明：选择更优的算法
 */
public class BetterAlg {
    //如何判断一个数是否为2的多少次方
    public static void main(String[] args) throws  Exception{
        int n =2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入需要计算的数:");
        while(scanner.hasNext()){//控制台输入
            int input =scanner.nextInt();
//            while (true){ //循环 求余数
//                if(input ==n){
//                    System.out.println("是("+n+")的次方");
//                    break;
//                }
//                if(input%n !=0){
//                    System.out.println("不是("+n+")的次方");
//                    break;
//                }else{
//                    input = input/2;
//                }
//            }

            if((input&(input-1)) ==0){
                System.out.println("是("+n+")的次方");
            }else{
                System.out.println("不是("+n+")的次方");
            }
        }
    }

}
