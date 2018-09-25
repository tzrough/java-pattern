package com.hongfei.focus.pattern.simple.messenger;

class Point
{

	public int x, y, z;

	public Point(int x, int y, int z)
	{

		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Point(Point p)
	{

		this.x = p.x;
		this.y = p.y;
		this.z = p.z;
	}

	@Override
	public String toString()
	{

		return "x: " + x + " y: " + y + " z: " + z;
	}

}
