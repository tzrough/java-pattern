package com.hongfei.focus.pattern.structural.strategy.cash;

public class CashContext
{
	private String type = null;
	private CashSuper cs = null;
	
	public CashContext(String type)
	{
		this.type = type;
	}
	
	public double getResult(double money) 
	{
		cs = CashFactory.createCashAccept(type);
		
		return cs.acceptCash(money);
	}
}
