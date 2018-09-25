package com.hongfei.focus.pattern.creational.builder;

public class MarsAirshipBuilder implements AirshipBuilder
{

	@Override
	public Engine buildEngine()
	{

		System.out.println("build Mars Airship Engine");
		return new Engine("Mars Airship Engine");
	}

	@Override
	public OrbitalModule buildOrbitalModule()
	{

		System.out.println("build Mars Airship OrbitalModule");
		return new OrbitalModule("Mars Airship OrbitalModule");

	}

	@Override
	public EscapeTower buildEscapeTower()
	{

		System.out.println("build Mars Airship EscapeTower");
		return new EscapeTower("Mars Airship EscapeTower");

	}

}
