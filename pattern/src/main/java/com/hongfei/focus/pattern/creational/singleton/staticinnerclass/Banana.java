package com.hongfei.focus.pattern.creational.singleton.staticinnerclass;

/**
 * 静态内部类实现单例模式 优点: 1. 线程安全, 调用效率高 2. 延迟加载, 节省内存资源 缺点: 1.
 * 利用反射和反序列化依旧可以创建对象(即使构造器为private)
 **/
public class Banana
{

	private static class SingletonClassInstance
	{

		private static final Banana instance = new Banana();

	}

	// 私有化构造器
	private Banana()
	{

		System.out.println("banana has been created");
	}

	public static Banana getInstance()
	{

		return SingletonClassInstance.instance;
	}

	public static void main(String[] args)
	{

		Banana b1 = Banana.getInstance();
		Banana b2 = Banana.getInstance();

		System.out.println(b1);
		System.out.println(b2);

		System.out.println(b1 == b2);
	}
}
