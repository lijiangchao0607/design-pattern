package com.ljc.design.factory;
/**
 * ��������ֻ���������ĳ� 
 * @author lijiangchao
 *
 */
public class TrumpchiCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new TrumpchiCar();
	}

}
