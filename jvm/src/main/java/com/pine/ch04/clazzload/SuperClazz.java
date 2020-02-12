package com.pine.ch04.clazzload;

/**
 * @author pine
 * 类加载--父类
 */
public class SuperClazz {
	/**
	* 被动使用类字段演示一：
	* 通过子类引用父类的静态字段，不会导致子类初始化
	**/
	static 	{
		System.out.println("SuperClass init！");
	}
	public static int value=123;
	public static final String HELLOWORLD="hello world  king";
	public static final int WHAT = value;
}
