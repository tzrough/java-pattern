package com.hongfei.focus.pattern.creational.factory.abstractfactory;

public interface Wheel
{

	void capacity();
}

class EconomicsWheel implements Wheel
{

	@Override
	public void capacity()
	{

		System.out.println("capacity low");

	}

}

class LuxuryWheel implements Wheel
{

	@Override
	public void capacity()
	{

		System.out.println("capacity high");
	}

}