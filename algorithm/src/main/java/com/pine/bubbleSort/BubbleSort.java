package com.pine.bubbleSort;

import com.pine.util.Utils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 冒泡排序
 *
 * （1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
 * （2）这样对数组的第 0 个数据到 N-1 个数据进行一次遍历后，最大的一个数据就“沉”到数组第N-1 个位置。
 * （3）N=N-1，如果 N 不为 0 就重复前面二步，否则排序完成。
 * @author anzy
 * @version 1.0
 * @date 2020/4/19 19:20
 **/
public class BubbleSort {

    public static int[] sort1(int array[]){
        int length = array.length;
        // 第一次循环
        for (int a = 0; a < length; a++){
            // 第二次循环 拿到前后值进行比较大数下沉，利用中间变量
            for (int b = 1; b < length - a; b++){
                if (array[b] < array[b-1]){
                    int temp = array[b-1];
                    array[b-1] = array[b];
                    array[b] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int array[] = {23,3423,567,43,2,4,9,0,1223};
        System.out.println(Utils.arrayTransformString(sort1(array)));
    }




}
