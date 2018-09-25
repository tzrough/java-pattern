package com.hongfei.focus.pattern.creational.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.hongfei.focus.pattern.creational.prototype.shallowclone.Sheep;

/*
 * 测试深克隆(使用序列化, 反序列化的方式实现深克隆)
 *
 */
public class Client3
{

	public static void main(String[] args) throws ClassNotFoundException, IOException
	{

		Date date = new Date(666666L);

		// Sheep类中的Clone方法为浅复制
		Sheep s1 = new Sheep("A", date);

		System.out.println(s1);
		System.out.println(s1.getName());
		System.out.println(s1.getBirthday());

		/** 使用序列化和反序列化实现深复制 开始 **/
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();

		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);

		Sheep s2 = (Sheep) ois.readObject();

		/** 使用序列化和反序列化实现深复制 结束 **/

		date.setTime(999999L);
		s1.setBirthday(date);

		System.out.println(s2);
		System.out.println(s2.getName());
		System.out.println(s2.getBirthday());

		System.out.println(s1.getBirthday());

	}

}
