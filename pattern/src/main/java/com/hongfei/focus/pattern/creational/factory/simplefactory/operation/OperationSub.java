package com.hongfei.focus.pattern.creational.factory.simplefactory.operation;

public class OperationSub extends Operation
{

	@Override
	double getResult()
	{
		return getNumberA() - getNumberB();
	}

}
