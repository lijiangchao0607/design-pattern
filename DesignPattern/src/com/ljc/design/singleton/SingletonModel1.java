package com.ljc.design.singleton;
/**
 * ����ģʽ-����ʽ
 * @author lijiangchao
 *
 */
public class SingletonModel1 {
	
	SingletonModel1 car = null;
	
	/**
	 * ��ֹ��������
	 */
	private SingletonModel1(){}
	
	
	/**
	 * ��������
	 * @return
	 */
	public SingletonModel1 getInstance(){
		synchronized (this.getClass()) {
			if(car == null){
				car = new SingletonModel1();
			}
			return car;
		}
		
	}
}
