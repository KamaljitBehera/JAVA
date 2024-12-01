package com.org.features.Java_8;

import java.util.Optional;


//This program is all about Java 8 feature Optional class
public class OptionalDemo {
	public static void main(String[] args) {
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);//Optional.empty
		
//		Optional<Object> empty2 = Optional.empty();
//		System.out.println(empty2);
//		
//		System.out.println(empty==empty2);
//		
//		System.out.println(empty.equals(empty2));
		
		String name="kamal";
		
		Optional<String> of = Optional.of(name);
		System.out.println(of);//Optional[kamal]
		
//		Optional<Object> of2 = Optional.of(null);
//		System.out.println(of2);//Throws NullPointerException
		
		
		Optional<String> ofNullable = Optional.ofNullable("kamal");
		System.out.println(ofNullable);//Optional[kamal]
		Optional<String> ofNullable2 = Optional.ofNullable(null);
		System.out.println(ofNullable2);//Optional.empty
		
		
//		System.out.println(of.equals(ofNullable));
//		System.out.println(empty.equals(ofNullable2));
		
		
		System.out.println(of.get());//kamal
		System.out.println(ofNullable.get());//kamal
//		System.out.println(ofNullable2.get());//Throw NoSuchElementException
		
		
		
		System.out.println(ofNullable.isPresent());//true
		System.out.println(ofNullable2.isPresent());//false
		
		
	    ofNullable.ifPresent(n->System.out.println("Hello "+n));//Execute the Consumer
	    ofNullable2.ifPresent(n->System.out.println("Hello "+n));//Do Nothing
	    empty.ifPresent(n->System.out.println("Hello "+n));//Do Nothing
	    
	    
//	    ofNullable.ifPresent(null);//throw NullpointerException
	    
	    
	    System.out.println(ofNullable.orElse("hello"));//kamal
	    System.out.println(ofNullable2.orElse("hello"));//hello
	    System.out.println(empty.orElse("hello"));//hello
	    System.out.println(ofNullable2.orElse(null));//null
	    System.out.println(ofNullable2.orElse(name));//kamal
	    
	    
	    System.out.println(empty.orElseGet(()->"Suplier get executed"));//Suplier get executed
	    System.out.println(of.orElseGet(()->"Suplier get executed"));//kamal
	    System.out.println(ofNullable.orElseGet(()->"Suplier get executed"));//kamal
	    System.out.println(ofNullable2.orElseGet(()->"Suplier get executed"));//Suplier get executed
//	    System.out.println(ofNullable2.orElseGet(null));//throw NullpointerException
	    
//	    System.out.println(empty.orElseThrow(()->new ArithmeticException()));//throw ArithmeticException
//	    System.out.println(of.orElseThrow(()->new ArithmeticException()));//throw ArithmeticException
//	    System.out.println(ofNullable.orElseThrow(()->new ArithmeticException()));//throw ArithmeticException
//	    System.out.println(ofNullable2.orElseThrow(()->new ArithmeticException()));//throw ArithmeticException
//	    System.out.println(ofNullable2.orElseThrow(null));//throw NullpointerException
	    
	    
		
		
		
		
		
	}
	
}
