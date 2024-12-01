package com.org.basics.variables;

//This class is all about variable in java
public class Variable {

//	declaring static variable
	static int staticNum = 30;

//	declaring instance variable
	int instancenum = 10;

//	declaring the local variable in method
	public void localVar() {

//		3. Local Variable

		int localVar = 10;

//		Access the local variable
		System.out.println(localVar);
	}

	public static void main(String[] args) {
//		Declaration
		int count;

//		Initialization
		count = 1;
//		Using the variable
		System.out.println(count);// 1

//		declaration and initialization in one line
		int count2 = 2;
		System.out.println(count2);// 2

//		declaring multiple variable in one line
		int num1 = 10, num2 = 10;

//		Types Of variable

//		1.Non-Static variable or Instance variable(outside the main method)
//		Access the non-satatuc variable by using Object reference

		Variable objVar = new Variable();
		System.out.println(objVar.instancenum);// 10

//		2.Static variable

//		Access the static variable by object reference
		System.out.println(objVar.staticNum);// 30

//		Access static variable by class name
		
		System.out.println(Variable.staticNum);// 30

//		Access static variable by directly
		System.out.println(staticNum);// 30

//	Trying to access the localVar variable of localVar Method
		objVar.localVar();

//		Access directly the local variable from main method

//		System.out.println(localVar);//localVar cannot be resolved to a variable

	}
}
