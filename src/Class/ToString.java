package Class;

import java.util.Date;

/*
 * 1.当输出一个对象的引用时，实际上是调用它的toString()
 * 2.String Date File等重写了toString()
 * 3.可以在自定义的类中重写toString()
 * 
 * 
 * 
 * 
 * */
public class ToString {
	public static void main(String args[]) {
		Student s1=new Student();
		Person p1=new Student();
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(p1);
		System.out.println(p1.toString());
		Date d1=new Date(453453453L);
		System.out.println(d1);
	}
}
