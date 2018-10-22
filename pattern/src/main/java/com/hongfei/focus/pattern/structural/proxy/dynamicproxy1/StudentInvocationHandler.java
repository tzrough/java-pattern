package com.hongfei.focus.pattern.structural.proxy.dynamicproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentInvocationHandler<T> implements InvocationHandler
{
	// 被代理对象
	private T target;
	
	
	public StudentInvocationHandler(T target)
	{
		this.target = target;
	}
	
	/**
	 * proxy: 动态代理对象
	 * method: 正在执行的方法
	 * args: 调用目标方法时传入的实参
	 * 
	 **/
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		
		System.out.println("代理执行" + method.getName() + "方法");
		
		Timer.start();
		Object result = method.invoke(target, args);
		Timer.printRunTime(method.getName());
		
		return result;
		
	}

}
