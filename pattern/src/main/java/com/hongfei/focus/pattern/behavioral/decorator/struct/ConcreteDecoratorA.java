package com.hongfei.focus.pattern.behavioral.decorator.struct;

public class ConcreteDecoratorA extends Decorator
{

	private String state;
	
	@Override
	public void operation() 
	{
		super.operation();
		state = "new state";
		System.out.println("具体装饰对象A的操作");
	}
}
