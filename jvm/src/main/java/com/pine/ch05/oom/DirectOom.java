package com.pine.ch05.oom;

import java.nio.ByteBuffer;

/**
 * @author pine
 * VM Args：-XX:MaxDirectMemorySize=100m -XX:+PrintGCDetails
 * 限制最大直接内存大小100m
 * 直接内存溢出
 */
public class DirectOom {
    public static void main(String[] args) {
        //直接分配128M的直接内存(100M)
        ByteBuffer bb = ByteBuffer.allocateDirect(128*1024*1204);
    }
}
