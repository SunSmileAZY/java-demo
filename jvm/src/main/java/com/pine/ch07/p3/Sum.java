package com.pine.ch07.p3;
/*
 *不要创建不必要的对象
 */
public class Sum {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Long sum = 0L;//new出对象了(21亿个)
		for (long i = 0; i < Integer.MAX_VALUE; i++) {//21亿次
			sum += i;
		}
		System.out.println(sum);
		System.out.println("spend time:"+(System.currentTimeMillis()-start)+"ms");
	}
}
