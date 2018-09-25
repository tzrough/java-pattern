package com.hongfei.focus.pattern.creational.singleton.hungreymode;

import com.hongfei.focus.pattern.creational.singleton.lazymode.Apple;

/**
 * 单例模式: 饿汉式 优点: 1. 线程安全, 调用效率高 缺点: 1. 没有延迟加载, 消耗内存资源 2.
 * 利用反射和反序列化依旧可以创建对象(即使构造器为private)
 */
public class RecycleBin
{

	// 类初始化时, 立即创建对象(没有延时加载), 天然线程安全
	private static RecycleBin instance = new RecycleBin();

	private static int mark = loadme();

	private static Apple apple;

	public static int binSize = 1024;

	// 私有化构造器
	private RecycleBin()
	{

		System.out.println("recycleBin constructor loaded");

		System.out.println("get apple height from recyclebin is " + Apple.height + " cm");

		System.out.println("binSize is " + binSize + "MB");

	}

	// 用于验证加载顺序
	private static int loadme()
	{

		System.out.println("recycleBin.binSzie is " + binSize + "MB");

		return 66;

	}

	// 方法没有同步, 调用效率高
	public static RecycleBin getInstance()
	{

		System.out.println("recycleBin static getInstance method called");

		return instance;
	}

	public static void main(String[] args)
	{

		RecycleBin.getInstance();

	}

}
