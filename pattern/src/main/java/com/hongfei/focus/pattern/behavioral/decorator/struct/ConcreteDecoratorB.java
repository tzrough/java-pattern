package com.hongfei.focus.pattern.behavioral.decorator.struct;

public class ConcreteDecoratorB extends Decorator
{

	@Override
	public void operation() 
	{
		super.operation();
		decorate();
		System.out.println("具体装饰对象B的操作");
	}
	
	public void decorate()
	{
		
	}
}
