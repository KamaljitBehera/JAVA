package com.org.basics.datatypes;

public class UseCaseOfDataType {

	public static void main(String[] args) {
	
//		We can use underscore in between integer type literals
		
		long creditCardNumber = 1234_5678_9012_3456L;
		System.out.println(creditCardNumber);//1234567890123456
		
		float pi =  3.14_15F;
		System.out.println(pi);//3.1415
		
		
		long bytes = 0b11010010_01101001_10010100_10010010;
		System.out.println(bytes);//-764832622
		
		int x6 = 0x5_2; 
		System.out.println(x6);//82
		
		int x7=0x52;
		System.out.println(x6==x7);//true
		
		
		int nmb=56__________________7;//we can use multiple '_' continuously in between number
		System.out.println(nmb);//567
		
		
		
		
//		where we cannot use the underscore in literals
		
//		float pi1 = 3_.1415F;//Underscores have to be located within digits
//		float pi2 = 3._1415F;//Underscores have to be located within digits
		
//		long digit1=_567894567678l;//Cannot used at start
//		long digit2=567894567678l_;//Cannot used at end
		
		
//		long lng=567_8956789_5678_l;//Underscores have to be located within digits
//		float flt=8.9_87_f;//Underscores have to be located within digit
		
//		int x4 = 0_x52;//We can't use underscore before and after radix prefix
		
		/*but we can write like this*/
		
		long hexBytes = 0xFF_EC_DE_5E;
		System.out.println(hexBytes);//-1253794
/*		Note:- We can use the underscore in between the radix prefix but we can't use them in between the digit
	           and radix prefix  */	
		
		
		
//		before write a hexadecimal number first we have to write '0x' which represent hexadecimal number
		int hex=0xb56;
		System.out.println(hex);//2902
		
//		int tryHex=87xbf34;//Syntax error on token "xbf34", delete this token
		
//		to denote a number is octal the first digit is must be '0' other wise it is a normal number
		int octal=0100;//64
		System.out.println(octal);
		
		int tryoctal=0_100;//64
		System.out.println(tryoctal);
		
		String stg="hello there everyone \n";
		System.out.println(stg);
		
		String mstr="hello"+
		            " there"+
				    " everyone";
		System.out.println(mstr);
		
/*		Null literals use to assign to non-premitive type which represent the absence. And it doesn't belongs to
	    any type     */
		
		String str = null;
		System.out.println(str instanceof String);  // false

		Object obj = null;
		System.out.println(obj instanceof Object);  // false
	
		char chrt='"'+'"'+'"';//here all the ASCII value of character add and converted to corresponding character
		System.out.println(chrt);
		
		
		char ch='\n';
		System.out.println(ch);
		
		
		
		/*************************      ESCAPE SEQUENCE       *****************************/
		
		System.out.println("\" Kamaljit behera is my name \" ");
		System.out.println("\\");
		System.out.println("\'");
		
		/**********************************************************************************/
		
		
		 int high = Integer.MAX_VALUE;//2147483647    
		 int low = Integer.MIN_VALUE;//-2147483648     
		 System.out.println(high);
		 System.out.println(low);
//		int tooBig = 2147483648;  // The literal 2147483648 of type int is out of range 
		
		
		
		
		
		 float f1 = 0f;
		 float f2 = -0f;
		 System.out.println(f1 == f2); // true
		 System.out.println(1f / f1); // Infinity
		 System.out.println(1f / f2); // -Infinity
		 System.out.println(Float.POSITIVE_INFINITY / Float.POSITIVE_INFINITY); // NaN
		 
		 
		 /******  widening conversion   *****/ 
		 int a = 1;    
		 double d = a;// valid conversion to double, no cast needed (widening)
		 
		 
		 
		 /******  narrowing conversion   *****/ 
		 double d2 = 18.96;
//		 int b4 = d2; // invalid conversion to int, will throw a compile-time error
		 int b5 = (int) d; // valid conversion to int, but result is truncated (gets rounded down)
				 // This is type-casting
				 // Now, b = 18
		 
		 
		 double d1 = 0d;
		 double d21 = -0d;
		 System.out.println(d1 == d21); // true
		 System.out.println(1d / d1); // Infinity
		 System.out.println(1d / d21); // -Infinity
		 System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY); // NaN
		 
		 
		 
		 
		 
		 long high1 = Long.MAX_VALUE;    // high == 9223372036854775807L
		 long low1 = Long.MIN_VALUE;     // low == -9223372036854775808L
		 
		 
		 
		 
		 Long val1 = 127L;
		 Long val2 = 127L;
		 System.out.println(val1 == val2); // true
		 Long val3 = 128L;
		 Long val4 = 128L;
		 System.out.println(val3 == val4); // false
	}

}
