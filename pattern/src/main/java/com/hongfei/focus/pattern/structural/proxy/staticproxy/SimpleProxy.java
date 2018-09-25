package com.hongfei.focus.pattern.structural.proxy.staticproxy;

public class SimpleProxy implements Interface
{

	private Interface proxied;

	public SimpleProxy(Interface proxied)
	{
		this.proxied = proxied;
	}

	@Override
	public void doSomething()
	{

		System.out.println("SimpleProxy doSomething");

		proxied.doSomething();

	}

	@Override
	public void doSomethingElse(String thing)
	{

		System.out.println("SimpleProxy do something else " + thing);

		proxied.doSomethingElse(thing);
	}

}
