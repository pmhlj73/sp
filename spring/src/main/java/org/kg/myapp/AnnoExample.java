package org.kg.myapp;

public class AnnoExample {

	//@MyAnnotation
	//String name;
	
	//@MyAnnotation(name="어노테이션에 넣은 값")
	//String name2;
	
	@MyAnnotation
	java.util.Date name;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		MyContext con = new MyContext();
		AnnoExample a = con.getInstance(AnnoExample.class);
		System.out.println(a.name);
		//System.out.println(a.name2);
	}
	
}
