package com.hongfei.focus.pattern.creational.prototype.deepclone;

import java.util.Date;

public class Sheep2 implements Cloneable
{

	private String name;

	private Date birthday;

	public Sheep2(String name, Date birthday)
	{
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{

		// 直接调用Object类的clone方法
		Object obj = super.clone();

		// 添加如下代码实现深克隆
		Sheep2 sheep2 = (Sheep2) obj;

		// 把属性也进行克隆
		sheep2.birthday = (Date) this.birthday.clone();

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
