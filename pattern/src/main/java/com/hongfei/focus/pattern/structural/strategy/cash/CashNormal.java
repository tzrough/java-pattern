package com.hongfei.focus.pattern.structural.strategy.cash;

public class CashNormal extends CashSuper
{

	@Override
	public double acceptCash(double money)
	{
		return money;
	}

}
