package com.hongfei.focus.pattern.creational.builder;

public class Airship
{

	// 轨道舱
	private OrbitalModule orbitalModule;
	// 逃生塔
	private EscapeTower escapeTower;

	private Engine engine;

	public OrbitalModule getOrbitalModule()
	{
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule)
	{
		this.orbitalModule = orbitalModule;
	}

	public EscapeTower getEscapeTower()
	{
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower)
	{
		this.escapeTower = escapeTower;
	}

	public Engine getEngine()
	{
		return engine;
	}

	public void setEngine(Engine engine)
	{
		this.engine = engine;
	}

}

class OrbitalModule
{

	private String name;

	public OrbitalModule(String name)
	{

		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

class EscapeTower
{

	private String name;

	public EscapeTower(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

class Engine
{

	private String name;

	public Engine(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}