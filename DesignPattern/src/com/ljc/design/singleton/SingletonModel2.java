package com.ljc.design.singleton;
/**
 * 单例模式-饿汉式
 * @author lijiangchao
 *
 */
public class SingletonModel2 {
	
	private static SingletonModel2 car = new SingletonModel2();
	
	/**
	 * 禁止创建对象
	 */
	private SingletonModel2(){}
	
	
	/**
	 * 单例方法
	 * @return
	 */
	public SingletonModel2 getInstance(){
		return car;
	}
}
