package com.hongfei.focus.pattern.creational.singleton.lazymode;

import com.hongfei.focus.pattern.creational.singleton.hungreymode.RecycleBin;

/**
 * 单例模式: 懒汉式 优点: 1. 延迟加载, 节省内存资源 缺点: 1. 调用效率低 2.
 * 利用反射和反序列化依旧可以创建对象(即使构造器为private)
 */
public class Apple
{

	// 类初始化时, 不创建对象(延时加载, 使用时才创建)
	private static Apple instance;

	public static int height = 10;

	public static int mark = loadme();

	// 私有化构造器
	private Apple()
	{

		System.out.println("apple constructor loaded");

		System.out.println("apple height is " + height + " cm");

		System.out.println("get recycleBin size from Apple is " + RecycleBin.binSize + "MB");
	}

	// 用于验证加载顺序
	private static int loadme()
	{

		System.out.println("I have been loaded");

		return 66;

	}

	// 方法同步, 调用效率低
	public static synchronized Apple getInstance()
	{

		if (instance == null)
		{

			instance = new Apple();
		}

		return instance;
	}

}
