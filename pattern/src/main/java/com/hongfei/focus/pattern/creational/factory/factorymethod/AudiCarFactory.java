package com.hongfei.focus.pattern.creational.factory.factorymethod;

public class AudiCarFactory implements CarFactory
{

	@Override
	public Car createCar()
	{

		return new Audi();
	}

}
