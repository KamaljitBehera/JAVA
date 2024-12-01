package com.org.basics;
//This class is all about the basic syntax of Java
public class BasicSyntaxPractice {
	public static void main(String[] args) {
		
		
		//Single Line Comments in java
		
		/*
		 * Multiline comment in java
		 * */
		
		System.out.println("Kamaljit is diffrent then kamaljit in java");
		
		
		System.out.println("java is case sensitive ");
		
		System.out.println("Basic.java is not equals as basic.java");
		
//		Class Name Syntax
		System.out.println("class MyJavaProgram : valid syntax");   
		System.out.println("class 1Program : invalid syntax");    
		System.out.println("class My1Program : valid syntax");   
		System.out.println("class $Program : valid syntax, but discouraged");    
		System.out.println("class My$Program : valid syntax, but discouraged (inner class Program inside the class My)");     
		System.out.println("class myJavaProgram : valid syntax, but discouraged");   
		
//		Method Syntax
		System.out.println("public void employeeRecords() : valid syntax"); 
		System.out.println("public void EmployeeRecords() : valid syntax, but discouraged");
		
//		Legal identifiers
		System.out.println("Legal identifiers: MinNumber, total, ak74, hello_world, $amount, _under_value");
		System.out.println("Illegal identifiers: 74ak, -amount");
		
		
		
	}
}
