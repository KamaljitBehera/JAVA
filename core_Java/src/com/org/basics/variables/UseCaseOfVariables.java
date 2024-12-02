package com.org.basics.variables;

//This class is all about the test case related to the variables
public class UseCaseOfVariables {
	
	
	/*  can we declare the static variable name same as the non-static variable name */
//	Ans:-No we can not declare the static variable name same as the non-static variable name.
//	int number2;
	static int number2;
	static int number = 10;
	int num = 10;
	int num2;

	public void staticUsecase() {
/*		is it necessary to initialize the non-static variable before using it?  */
//		Ans:-No it not required but it print the default value
		System.out.println(number2);// 0
		
		
		
/*	How many ways we can access the static variable  */
		
//		1.Directly
		System.out.println(number);//10
		
//		2.By class name
		System.out.println(UseCaseOfVariables.number);//10
		
//		3.By using Object reference
		UseCaseOfVariables object2 = new UseCaseOfVariables();
		
		System.out.println(object2.number);//10
		
		
		
		
		

		
		
		
	}

	public static void instanceUsecase2() {
/*		Can we access the non-static variable without creating the object in static area?  */
//		ANs:-(Yes)
//		System.out.println(num);//Cannot make a static reference to the non-static field num
	}

	public void instanceUsecase() {
/*		Can we access the non-static variable without creating the object in non-static area?  */
//		ANs:-(Yes)
		System.out.println(num);// 10

/*		is it necessary to initialize the non-static variable before using it?    */
//		Ans:-No it not required but it print the default value
		System.out.println(num2);// 0
	}

	public  void localUsecase() {
		
		
/*      can we use local variable without initialize it?  */
//		Ans:-No we can't use the local variable without initialize it.
		int num2;
//		System.out.println(num2);//The local variable num2 may not have been initialized
		
		
/*      can we use the local variable out side the block */		
//		Ans:-no we can't use the local variable outside any scope
		
		if(number2==0) {
			
			int number3=90;
			System.out.println(number3);//90
		}
//		System.out.println(number3);//The local variable number3 may not have been initialized
		
		
		
		
/*      can we give the local variable name same as the static variable name */
//		Ans:-Yes But priority goes to the local variable
		
		int number=30;
		System.out.println(number);//30
		
		
/*      can we give the local variable name same as the non-static variable name */
//		Ans:-Yes But priority goes to the local variable
		
		int num=30;
		System.out.println(num);//30
		
		UseCaseOfVariables object = new UseCaseOfVariables();
		System.out.println(object.num);//10

	}

	public static void main(String[] args) {

		UseCaseOfVariables object = new UseCaseOfVariables();
		object.instanceUsecase();
		instanceUsecase2();
		object.staticUsecase();
		object.localUsecase();
	}

}
