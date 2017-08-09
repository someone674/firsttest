package com.sun;

public class newfile {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		new newfile().disPlay();
		new newfile().isHello("Hello");
	}
	public void disPlay(){
		System.out.println("this is function disPlay();");
	}
	public boolean isHello(String str){
		if("Hello".equals(str)){
			System.out.println("true");
			return true;
		}
		return false;
	}
}
