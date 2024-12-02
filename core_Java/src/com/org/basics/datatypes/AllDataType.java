package com.org.basics.datatypes;
//This class is all about the data types present in java
public class AllDataType {
	
	static byte b1;
	static short s1;
	static int i1;
	static long l1;
	static char c1;
	static float f1;
	static double d1;
	static boolean bo1;
	static String name1;
	static AllDataType adt1;
	
	
	
	public static void main(String[] args) {
		
//		a. Primitive DataType
		   
//		    1.byte type
		byte b=1;
		System.out.println(b);//1
		
//		    2.short type
		short s=10;
		System.out.println(s);//10
		
//		    3.int type
		int i=100;
		System.out.println(i);//100
		
//		     4.long type
		long l=789478278992l;
		System.out.println(l);//789478278992l
		
		
//		     5.char type
		char c='k';
		System.out.println(c);//k
		
//		     6.float type
		float f=10.7f;
		System.out.println(f);//10.7
		
		
//		     7.double type
		double d=10.3456789;
		System.out.println(d);//10.3456789
		
//		     8.boolean type
		boolean bo=true;
		System.out.println(bo);//true
		
		
		
//		b.Non-primitive DataType
//		   Ex-1:-String type
		String name="kamaljit";
		System.out.println(name);//kamaljit
		
//		   Ex-2:-AllDataType class type
		AllDataType adt=new AllDataType();
		System.out.println(adt);//com.org.basics.datatypes.AllDataType@4517d9a3(address)
		
		
		//Each data type has its default value
		System.out.println(b1);//0
		System.out.println(s1);//0
		System.out.println(i1);//0
		System.out.println(l1);//0
		System.out.println(c1);//    (blank)
		System.out.println(f1);//0.0
		System.out.println(d1);//0.0
		System.out.println(bo1);//false
		System.out.println(name1);//null
		System.out.println(adt1);//null
		
		
		
		
		
            /*     Literals    */
		int number=0x1a;//integer type literals
		System.out.println(number);//26
		
		byte bt=10;//byte type literals
		System.out.println(bt);//10
		
		short srt=500;//short type literals
		System.out.println(srt);//500
		
		long lg=789567456793l;//long type literals
		System.out.println(lg);//789567456793l
		
		
		char chr='k';//char type literals
		System.out.println(chr);//k
		
		float flt=10.67f;//float type literals
		System.out.println(flt);//10.67
		
		double dl=10.677890;//double type literals
		System.out.println(dl);//10.677890
		
		boolean bl=true;//boolean type literals
		System.out.println(bl);//true
		
		
		String str="hello";//string type literals
		System.out.println(str);//hello
		
		
          /*   class literals   */	
		Class<AllDataType> adt3=AllDataType.class;
		System.out.println(adt3);//class com.org.basics.datatypes.AllDataType
	
	}
}
