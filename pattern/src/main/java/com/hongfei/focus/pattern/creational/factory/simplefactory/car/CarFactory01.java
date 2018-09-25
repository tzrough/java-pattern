package com.hongfei.focus.pattern.creational.factory.simplefactory.car;

/**
 * 简单工厂模式也叫静态工厂模式 因为工厂类一般使用静态方法 通过接受的参数的不同来返回不同的对象实例
 * 
 * 但是对于增加新产品无能为力 不修改代码的话, 是无法扩展的 不满足开闭原则(对扩展开放, 对修改关闭)
 */
public class CarFactory01
{

	public static Car createCar(String type)
	{

		if (type.equals("Audi"))
		{
			return new Audi();
		} else if (type.equals("Benz"))
		{
			return new Benz();
		} else
		{
			return null;
		}

	}

}
