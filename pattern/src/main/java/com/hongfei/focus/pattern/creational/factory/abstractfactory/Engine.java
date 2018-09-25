package com.hongfei.focus.pattern.creational.factory.abstractfactory;

public interface Engine
{

	void start();

	void stop();

}

class EconomicEngine implements Engine
{

	@Override
	public void start()
	{

		System.out.println("start slow");

	}

	@Override
	public void stop()
	{

		System.out.println("stop slow");

	}

}

class LuxuryEngine implements Engine
{

	@Override
	public void start()
	{

		System.out.println("start fast");

	}

	@Override
	public void stop()
	{

		System.out.println("stop fast");
	}

}
