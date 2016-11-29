package com.briup.servlet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		//
	//	setTest();
	//	setTest2();
	//	mapTest();
		listTest();
	}

	private static void listTest() {
		
		List<Person> list=new ArrayList<Person>();
		
		list.add(new Person("zhangsan", "20"));
		list.add(new Person("zhangsan", "11"));
		list.add(new Person("zhangsan", "22"));
		list.add(new Person("zhangsan", "88"));
		list.add(new Person("zhangsan", "33"));
		
		for(Person p:list){
			System.out.println(p);
		}
		
	}

	private static void setTest2() {
		Set<String> set=new HashSet<String>();
		
		set.add("sss");
		set.add("xxx");
		set.add("ttt");
		set.add("hhhh");
		
		/*Iterator<String> it = set.iterator();
		while(it.hasNext()){
		//	String haha = it.next();
			System.out.println(it.next());
		}*/
		
		for(String s:set){
			System.out.println(s);
		}
		
		
	}

	private static void setTest() {
		Set set=new HashSet();
		set.add("sss");
		set.add("haha");
		set.add(true);
		set.add(1111.99889);
		set.add(new Integer(1));
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
		
	}

	private static void mapTest() {
	
		Map<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(1, "ss");
		map.put(2, "ss2");
		map.put(3, "ss3");
		map.put(4, "ss4");
		map.put(5, "ss5");
		map.put(5, "lihong");

		Set<Integer> keys = map.keySet();
		
		for(Integer i:keys){
			String s=map.get(i);
			System.out.println(i+"==="+s);
		}
		
	}
}










