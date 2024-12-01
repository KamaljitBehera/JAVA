package com.org.basics.variables;
//How the non-static variable share the different copy to different object
public class NonStaticVar {
//	Declaring non-static variable
	
	int number=20;
	public static void main(String[] args) {
//		Creating multiple object of current class
		NonStaticVar obj1 = new NonStaticVar();
		NonStaticVar obj2 = new NonStaticVar();
		NonStaticVar obj3 = new NonStaticVar();
		
//		print the value
		System.out.println(obj1.number);//20
		System.out.println(obj2.number);//20
		System.out.println(obj3.number);//20
		
//		change the value of the non static variable by using obj1 object reference
		obj1.number=30;
		
		
//		now print all the object reference value
		System.out.println(obj1.number);//30
		System.out.println(obj2.number);//20
		System.out.println(obj3.number);//20
		
	}

}
