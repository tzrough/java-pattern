package com.hongfei.focus.pattern.creational.factory.simplefactory.car;

/**
 * 在没有工厂模式的情况下 创建对象
 */
public class Client01
{

	public static void main(String[] args)
	{

		Car c1 = new Audi();
		Car c2 = new Benz();

		c1.run();
		c2.run();

	}

}
