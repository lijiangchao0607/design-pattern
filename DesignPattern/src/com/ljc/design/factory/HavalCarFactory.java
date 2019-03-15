package com.ljc.design.factory;
/**
 * 哈佛的工厂只生产哈佛的车
 * @author lijiangchao
 *
 */
public class HavalCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new HavalCar();
	}

}
