package com.ljc.design.factory;
/**
 * ����Ĺ���ֻ��������ĳ�
 * @author lijiangchao
 *
 */
public class HavalCarFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new HavalCar();
	}

}
