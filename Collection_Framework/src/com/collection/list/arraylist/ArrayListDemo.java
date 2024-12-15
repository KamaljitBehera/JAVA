package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

//		Creating arraylist object
//		We can create like this 

//	List<Integer> arrayList = new ArrayList<Integer>();

//		or

		ArrayList<Integer> list = new ArrayList<Integer>();

		/**********************
		 * Adding element in to the list or ArrayList
		 *************************/

//		add() method (Collection interface method)

		boolean b = list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(b);// true
		System.out.println(list);// [10, 20, 30, 40, 50]

		ArrayList<Integer> scList = new ArrayList<Integer>();
		scList.add(20);
		scList.add(30);
		scList.add(40);

		list.addAll(scList);

//		addAll() method(Collection interface)
		System.out.println(list);// [10, 20, 30, 40, 50, 20, 30, 40]

		ArrayList<String> thList = new ArrayList<String>();

		thList.add("Apple");
		thList.add("Banana");
		thList.add("Cherry");

		ArrayList<String> ftList = new ArrayList<String>();

		ftList.add("pinapple");
		ftList.add("Guava");
		ftList.add("Cherry");

		System.out.println(thList);

//	    add(int index,Element e)(List interface)

		thList.add(1, "Mango");// [Apple, Banana, Cherry]

		System.out.println("After add Mango to index 1 the new list is " + thList);// [Apple, Mango, Banana, Cherry]

//	   addAll(int index,Collection c)(List interface)

		thList.addAll(2, ftList);
		System.out.println("after adding a collection to index 2" + thList);// [Apple, Mango, pinapple, Guava, Cherry,
																			// Banana, Cherry]

		/***************** Checking the Elements from the list ******************/

//		size() method(Collection interface)
		System.out.println(list.size());// 8

//		contain(Object o) method(Collection interface)
		System.out.println(list.contains(8));// false
		System.out.println(list.contains(10));// true

//		containAll(Collection c)(Collection interface)

		System.out.println(list.containsAll(scList));// true
		System.out.println(list.containsAll(ftList));// false

//		isEmpty() method(Collection framework)
		System.out.println(list.isEmpty());// false
		ArrayList<Integer> empty = new ArrayList<Integer>();
		System.out.println(empty.isEmpty());// true

		/***************** Accessing the Element from the list ******************/

//	    get() method(List Interface)

		String string = ftList.get(0);
		System.out.println(string);// pinapple

		// or

		System.out.println(ftList.get(1));// Guava

//	    set method(List interface)

		String set = ftList.set(1, "dargonfruit");
		System.out.println(set);// Guava //set method repalce the formal data with current data and return the
								// formal data
		System.out.println(ftList.get(1));// dargonfruit

//	    indexof method(List interface)

		int indexOf = thList.indexOf("Cherry");
		System.out.println(indexOf);// 4 It return the first occurrence of element index

//	    lastIndexOf method(List interface)
		int lastIndexOf = thList.lastIndexOf("Cherry");
		System.out.println(lastIndexOf);// 6 It return the last occurrence of element index

//	    subList method(List interface)

		List<String> subList = thList.subList(1, 4);
		System.out.println(subList);// [Mango, pinapple, Guava]

		/***************** Removing the Element from the list ******************/

//		remove(Object o) method(Collection interface)
		System.out.println(thList);// [Apple, Mango, pinapple, Guava, Cherry, Banana, Cherry]
		System.out.println(thList.remove("Guava"));// true
		System.out.println(thList);// [Apple, Mango, pinapple, Cherry, Banana, Cherry]

//		removeAll(Collection c) method(Collection interface)

		System.out.println(thList.removeAll(ftList));// true
		System.out.println(thList);// [Apple, Mango, Banana]

//		removeIf(Predicate filter)(Collection interface)
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		System.out.println(list2);// [1, 2, 3, 4, 5]

		System.out.println(list2.removeIf(n -> n < 3));// true(return true if any one of element is remove from list)
		System.out.println(list2);// [3, 4, 5]

//		retainAll(Collection c)(Collection interface)
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);

		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(3);
		list4.add(4);
		list4.add(5);

		ArrayList<Integer> list5 = new ArrayList<Integer>();
		list5.add(1);
		list5.add(2);
		list5.add(3);

		System.out.println(list3.retainAll(list4));// true
		System.out.println(list3);// [3,4,5]
		System.out.println(list3.retainAll(list5));// true
		System.out.println(list3);// [3]
		System.out.println(list4);// [3, 4, 5]

//		clear() method (collection interface)
		list4.clear();
		System.out.println(list4);// []

//		remove(int index) method(List interface)
		System.out.println(list5.remove(1));// 2
		Integer remove = list5.remove(1);
		System.out.println(remove);// 3

//		replaceAll() method(List interface)

		ArrayList<Integer> list6 = new ArrayList<Integer>();
		list6.add(1);
		list6.add(2);
		list6.add(3);
		list6.add(4);
		list6.add(5);
//		replace all element by there square
		list6.replaceAll(n -> n * n);
		System.out.println(list6);// [1, 4, 9, 16, 25]i

		/*****************
		 * Some Special methods in ArrayList,Collection and List
		 ***********************/

//		iterator() method(Collection interface)

		ArrayList<String> list7 = new ArrayList<String>();

		list7.add("Apple");
		list7.add("Banana");
		list7.add("Cherry");

		Iterator<String> iterator = list7.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");// Apple Banana Cherry
		}
		System.out.println();

//		toArray() method(Collection interface)

		list7.toArray();
		System.out.println(list7);// [Apple, Banana, Cherry]

//		toArray(T[] t) method(collection interface)

		ArrayList<String> list8 = new ArrayList<String>();

		list8.add("Apple");
		list8.add("Banana");
		list8.add("Cherry");

		String[] array = list8.toArray(new String[3]);
		System.out.println(Arrays.toString(array));// [Apple, Banana, Cherry]
		System.out.println(list8);

		ArrayList<String> list9 = new ArrayList<String>();

		list9.add("Banana");
		list9.add("Apple");
		list9.add("Cherry");
		System.out.println("list before sorting "+list9);//[Banana, Apple, Cherry]
		Collections.sort(list9);
		System.out.println("list after sorting "+list9);//[Apple, Banana, Cherry]

	}

}
