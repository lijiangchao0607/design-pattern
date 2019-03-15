package com.ljc.design.singleton;
/**
 * ����ģʽ-����ʽ
 * @author lijiangchao
 *
 */
public class SingletonModel2 {
	
	private static SingletonModel2 car = new SingletonModel2();
	
	/**
	 * ��ֹ��������
	 */
	private SingletonModel2(){}
	
	
	/**
	 * ��������
	 * @return
	 */
	public SingletonModel2 getInstance(){
		return car;
	}
}
