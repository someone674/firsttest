package com.sun;

public class newfile {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		new newfile().isHello("Hello");
	}
	public boolean isHello(String str){
		if("Hello".equals(str)){
			System.out.println("true");
			return true;
		}
		return false;
	}
}
