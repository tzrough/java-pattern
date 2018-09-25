package com.hongfei.focus.pattern.creational.factory.factorymethod;

public class BenzCarFactory implements CarFactory
{

	@Override
	public Car createCar()
	{

		return new Benz();
	}

}
