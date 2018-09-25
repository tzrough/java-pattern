package com.hongfei.focus.pattern.creational.factory.abstractfactory;

/**
 * 与工厂方法模式结构相同 有一个工厂的接口和多个工厂实现
 */
public class Client
{

	public static void main(String[] args)
	{

		CarFactory factory = new LuxuryCarFactory();

		Engine engine = factory.createEngine();

		engine.start();

	}

}
