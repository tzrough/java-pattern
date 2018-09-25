package com.hongfei.focus.pattern.structural.proxy.staticproxy;

public class SimpleProxyDemo
{

	public static void consumer(Interface iface)
	{

		iface.doSomething();

		iface.doSomethingElse("create");
	}

	public static void main(String[] args)
	{

		consumer(new RealObject());

		consumer(new SimpleProxy(new RealObject()));

	}

}
