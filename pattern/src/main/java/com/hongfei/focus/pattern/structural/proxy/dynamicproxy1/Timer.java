package com.hongfei.focus.pattern.structural.proxy.dynamicproxy1;

public class Timer
{
	private static ThreadLocal<Long> timer = new ThreadLocal<>();
	
	public static void start()
	{
		timer.set(System.currentTimeMillis());
	}
	
	public static void printRunTime(String methodName)
	{
		long endTime = System.currentTimeMillis();
		
		System.out.println(methodName + "方法耗时" + (endTime - timer.get()) + "ms");
	}
	
}
