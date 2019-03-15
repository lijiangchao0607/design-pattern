package com.ljc.design.singleton;
/**
 * 单例模式-懒汉式
 * @author lijiangchao
 *
 */
public class SingletonModel1 {
	
	SingletonModel1 car = null;
	
	/**
	 * 禁止创建对象
	 */
	private SingletonModel1(){}
	
	
	/**
	 * 单例方法
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
