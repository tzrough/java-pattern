package com.hongfei.focus.pattern.creational.factory.simplefactory.operation;

public class OperationFactory
{

	public static Operation createOperation(String operator)
	{
		Operation operation = null;
		
		switch (operator)
		{
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		default:
			break;
		}
		
		return operation;
	}
}
