package com.springcore2;

public class CarConfigByMultipleXMLS {
	private String carName;
	private EngineConfigByMultipleXMLS engine;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public EngineConfigByMultipleXMLS getEngine() {
		return engine;
	}
	public void setEngine(EngineConfigByMultipleXMLS engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "CarConfigByMultipleXMLS [carName=" + carName + ", engine=" + engine + "]";
	}
}
