package com.hongfei.focus.pattern.simple.messenger;

class Space
{

	public static Point translate(Point p, Vector v)
	{

		p = new Point(p);

		p.x = p.x + 1;
		p.y = p.y + 1;
		p.z = p.z + 1;

		return p;
	}

}
