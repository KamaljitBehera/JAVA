package com.org.basics.variables;
//How the static variable share the same copy to different object
public class StaticVar {
//	declaring the static variable
	
	static int number =10;
	
	public static void main(String[] args) {
//		Creating different object reference
		StaticVar obj1 = new StaticVar();
		StaticVar obj2 = new StaticVar();
		StaticVar obj3 = new StaticVar();
		
//		print the value 
		System.out.println(obj1.number);//10
		System.out.println(obj2.number);//10
		System.out.println(obj3.number);//10
		
//		change the static variable by using one object reference
		obj2.number=20;
	
//		Again print the value
		System.out.println(obj1.number);//20
		System.out.println(obj2.number);//20
		System.out.println(obj3.number);//20
	}
	
}
