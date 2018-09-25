package com.hongfei.focus.pattern.creational.prototype.shallowclone;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable, Serializable
{

	private String name;

	private Date birthday;

	public Sheep(String name, Date birthday)
	{
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{

		// 直接调用Object类的clone方法
		Object obj = super.clone();

		return obj;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getBirthday()
	{
		return birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

}
