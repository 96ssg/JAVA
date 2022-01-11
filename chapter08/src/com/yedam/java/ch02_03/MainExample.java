package com.yedam.java.ch02_03;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsC impl = new ImplementsC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
