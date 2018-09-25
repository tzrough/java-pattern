package com.hongfei.focus.pattern.creational.builder;

public class MarsAirshipDirector implements AirshipDirector
{

	private AirshipBuilder builder;

	public MarsAirshipDirector(AirshipBuilder marsAirshipBuilder)
	{

		this.builder = marsAirshipBuilder;
	}

	@Override
	public Airship createAirship()
	{

		Airship airship = new Airship();

		Engine engine = builder.buildEngine();
		OrbitalModule orbitalModule = builder.buildOrbitalModule();
		EscapeTower escapeTower = builder.buildEscapeTower();

		airship.setEngine(engine);
		airship.setOrbitalModule(orbitalModule);
		airship.setEscapeTower(escapeTower);

		return airship;
	}

}
