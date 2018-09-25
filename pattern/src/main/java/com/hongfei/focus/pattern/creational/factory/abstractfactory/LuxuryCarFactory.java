package com.hongfei.focus.pattern.creational.factory.abstractfactory;

public class LuxuryCarFactory implements CarFactory
{

	@Override
	public Engine createEngine()
	{

		return new LuxuryEngine();
	}

	@Override
	public Wheel createWheel()
	{

		return new LuxuryWheel();
	}

}
