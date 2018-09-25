package com.hongfei.focus.pattern.creational.factory.abstractfactory;

public class EconomicsCarFactory implements CarFactory
{

	@Override
	public Engine createEngine()
	{

		return new EconomicEngine();
	}

	@Override
	public Wheel createWheel()
	{

		return new EconomicsWheel();
	}

}
