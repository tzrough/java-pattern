package com.hongfei.focus.pattern.creational.builder;

public interface AirshipBuilder
{

	Engine buildEngine();

	OrbitalModule buildOrbitalModule();

	EscapeTower buildEscapeTower();

}
