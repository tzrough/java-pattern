package com.hongfei.focus.pattern.creational.singleton.enums;

/**
 * 利用枚举方式实现单例模式 优点: 1. 线程安全, 调用效率高 2. 避免了利用反射和反序列化依旧可以创建对象(即使构造器为private)的漏洞 缺点:
 * 1. 没有延迟加载, 消耗内存资源
 */
public enum Lemon
{

	// 这个枚举元素，本身就是单例对象
	INSTANCE;

	// 添加需要的操作
	public void singletonOperation()
	{

	}

	// 调用
	public static void main(String[] args)
	{

		Lemon.INSTANCE.singletonOperation();
	}

}
