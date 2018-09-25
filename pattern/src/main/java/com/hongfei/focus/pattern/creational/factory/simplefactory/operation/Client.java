package com.hongfei.focus.pattern.creational.factory.simplefactory.operation;

public class Client
{

	public static void main(String[] args)
	{
		Operation add = OperationFactory.createOperation("-");
		
		add.setNumberA(1);
		add.setNumberB(3);
		
		System.out.println(add.getResult());
	}
}
