package com.ljc.design.factory;
/**
 * 传祺工厂只生产传祺的车 
 * @author lijiangchao
 *
 */
public class TrumpchiCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new TrumpchiCar();
	}

}
