package com.hongfei.focus.pattern.creational.prototype.testeff;

/**
 * 测试new方式创建对象与clone方式创建对象效率对比 如果短时间内需要创建大量对象, 并且创建对象的过程比较耗时 则可以考虑使用原型模式
 * 创建对象越耗时, 两者效率差别越大 经常与工厂模式一起使用
 */
public class TestEfficiency
{

	public static void main(String[] args) throws CloneNotSupportedException
	{

		testNew(1000);

		testClone(1000);

	}

	// 测试利用new的方式创建对象耗时
	public static void testNew(int size)
	{

		long start = System.currentTimeMillis();

		for (int i = 0; i < size; i++)
		{

			Laptop laptop = new Laptop();
		}

		long end = System.currentTimeMillis();

		System.out.println("new的方式创建" + size + "个对象共耗时: " + (end - start) + "ms");

	}

	// 测试利用clone的方式创建对象耗时
	public static void testClone(int size) throws CloneNotSupportedException
	{

		Laptop laptop = new Laptop();

		long start = System.currentTimeMillis();

		for (int i = 0; i < size; i++)
		{

			Laptop l = (Laptop) laptop.clone();
		}

		long end = System.currentTimeMillis();

		System.out.println("clone的方式创建" + size + "个对象共耗时: " + (end - start) + "ms");

	}

}

class Laptop implements Cloneable
{

	public Laptop()
	{

		// 模拟创建对象的耗时过程
		try
		{
			Thread.sleep(10);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{

		// 直接调用Object类的clone方法
		Object obj = super.clone();

		return obj;
	}

}