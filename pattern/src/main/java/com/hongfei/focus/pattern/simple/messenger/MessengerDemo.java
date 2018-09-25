package com.hongfei.focus.pattern.simple.messenger;

import org.junit.Test;

import junit.framework.TestCase;

public class MessengerDemo extends TestCase
{

	@Test
	public void testName()
	{

		Point p1 = new Point(1, 2, 3);

		Point p2 = Space.translate(p1, new Vector(6, 66));

		String result = "p1: " + p1 + " p2: " + p2;

		System.out.println(result);

		assertEquals(result, "p1: x: 1 y: 2 z: 3 p2: x: 2 y: 3 z: 4");

	}

}
