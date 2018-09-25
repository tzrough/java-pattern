package com.hongfei.focus.pattern.creational.builder;

public class Client
{

	public static void main(String[] args)
	{

		AirshipDirector director = new MarsAirshipDirector(new MarsAirshipBuilder());

		Airship airship = director.createAirship();

		System.out.println(airship.getEngine());

	}

}
