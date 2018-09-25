package com.hongfei.focus.pattern.creational.factory.simplefactory.operation;

public class OperationAdd extends Operation
{
	@Override
	double getResult()
	{
		return getNumberA() + getNumberB();
	}

}
