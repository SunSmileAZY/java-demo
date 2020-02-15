package com.pine.ch06;
/**
 *  逃逸分析
 *  栈上分配
 *  -XX:+PrintGCDetails -XX:-DoEscapeAnalysis 关闭逃逸分析，默认是开启逃逸分析
 * @author pine
 */
public class StackAlloc {

	public static class User{
		public int id = 0;
		public String name = "";
	}


	public static void alloc() {
		User u = new User();  //Object  在堆上分配的() ,有逃逸分析的技术 ，在栈中分配的
		u.id = 5;
		u.name = "King";
	}

	public static void main(String[] args) {

		long b = System.currentTimeMillis(); //开始时间
		for(int i=0;i<100000000;i++) {//一个方法运行1亿次（）
			alloc();
		}
		long e = System.currentTimeMillis(); //结束时间
		System.out.println(e-b);//打印运行时间：毫秒
	}



}
