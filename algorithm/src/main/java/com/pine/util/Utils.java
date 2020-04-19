package com.pine.util;

/**
 * @author anzy
 * @version 1.0
 * @date 2020/4/19 19:45
 **/
public class Utils {

    /**
     * 采用字符串拼接形式转换，";"分号隔开
     * @param SafetyMeasure
     * @return
     */
    public static String arrayTransformString(int[] SafetyMeasure) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<SafetyMeasure.length;i++){
            sb.append(SafetyMeasure[i]+";");
        }
        return sb.toString();
    }
}
