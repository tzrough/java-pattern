package com.hongfei.focus.pattern.structural.proxy.staticproxy;

public class RealObject implements Interface
{

	@Override
	public void doSomething()
	{

		System.out.println("Do something");
	}

	@Override
	public void doSomethingElse(String thing)
	{

		System.out.println("Do something else " + thing);
	}

}
