package com.hongfei.focus.pattern.creational.prototype.deepclone;

import java.util.Date;

/*
 * 测试原型模式(Deep Clone 深克隆)
 *
 */
public class Client2
{

	public static void main(String[] args) throws CloneNotSupportedException
	{

		Date date = new Date(666666L);

		Sheep2 s1 = new Sheep2("A", date);

		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());

		Sheep2 s2 = (Sheep2) s1.clone();

		date.setTime(999999L);
		s1.setBirthday(date);

		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());

		System.out.println(s1.getBirthday());

	}

}
