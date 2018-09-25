package com.hongfei.focus.pattern.creational.singleton.doublecheck;

/**
 * 双重检查锁实现单例模式(由于编译器优化原因, 偶尔会出问题, 不建议使用) 优点: 1. 线程安全, 调用效率高(只在实例未被创建时进入同步) 2.
 * 延迟加载, 节省内存资源 缺点: 1. 由于编译器优化原因, 偶尔会出问题, 不建议使用 若添加violate关键字,
 * 虽然可以消除由于编译器优化产生的问题, 但是会导致效率降低 所以不建议使用 2. 利用反射和反序列化依旧可以创建对象(即使构造器为private)
 **/
public class Pear
{

	private static Pear instance;

	// 私有化构造器
	private Pear()
	{

	}

	public static Pear getInstance()
	{

		// 先检查实例是否存在，如果不存在才进入下面的同步块
		if (instance == null)
		{
			// 同步块，线程安全
			synchronized (Pear.class)
			{
				if (instance == null)
					instance = new Pear();
			}

		}

		return instance;

	}

}
