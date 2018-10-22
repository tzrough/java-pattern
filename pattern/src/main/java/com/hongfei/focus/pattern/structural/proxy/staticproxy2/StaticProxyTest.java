package com.hongfei.focus.pattern.structural.proxy.staticproxy2;

/**
 * 代理模式由三部分组成
 * 1. 被代理的类(具体的类)
 * 2. 公共接口, 定义被代理的方法, 被代理的类与代理的类都实现此接口
 * 3. 代理的类, 代理类持有被代理的类的实例, 通过调用被代理类的方法来完成基本方法调用
 **/
public class StaticProxyTest
{
	public static void main(String[] args)
	{
		
		Person a = new Student("A");
		
		Person moneyGiver = new StudentProxy(a);
		
		moneyGiver.giveMoney();
		
	}
	
	
}
