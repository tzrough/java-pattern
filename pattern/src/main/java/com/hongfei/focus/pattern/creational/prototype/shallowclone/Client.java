package com.hongfei.focus.pattern.creational.prototype.shallowclone;

import java.util.Date;

/*
 * 测试原型模式(Shallow Clone浅克隆)
 * 浅克隆: 克隆体对象属性引用与本体对象属性引用相同
 * 		     即克隆体对象属性与本体对象属性为同一个对象
 * 		     更改本体对象属性值, 克隆体对象属性值随之变化
 */
public class Client
{

	public static void main(String[] args) throws CloneNotSupportedException
	{

		Sheep s1 = new Sheep("A", new Date());

		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());

		Sheep s2 = (Sheep) s1.clone();

		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());

		s2.setName("B");

		System.out.println(s2.getName());

	}

}
