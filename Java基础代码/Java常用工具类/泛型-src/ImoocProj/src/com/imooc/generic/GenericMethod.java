package com.imooc.generic;

public class GenericMethod {
	public <T extends Number> void printValue(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args){
		GenericMethod gm=new GenericMethod();
		gm.printValue("hello");
		gm.printValue(123);
		gm.printValue(5.0f);
	}
}
