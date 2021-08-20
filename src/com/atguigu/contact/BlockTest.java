package com.atguigu.contact;

import Virtual.Person;
/*
 * 代码块用来初始化类和对象
 * 代码块只能用static修饰
 * 分类：静态代码块和非静态代码块
 * 静态代码块：
 * 	内部可以有输出语句
 * 	随着类的加载而执行 并且只加载一次
 * 	作用：初始化类的信息
 * 	如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 	只能调用静态结构
 * 
 * 非静态代码块
 * 	内部可以有输出语句
 * 	随着对象的创建而执行
 * 	每创建一个对象加载一次
 * 	作用：创建对象时，对对象的属性等进行初始化
 * 	如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * 	可以调用非静态结构
 * 
 * 	对属性可以赋值的位置
 * 	1.默认初始化
 * 	2.显式初始化/在代码块中初始化
 * 	3.构造器中初始化
 * 	4.创建对象后初始化
 * 
 * 	执行的顺序 1.-》2.-》3.-》4.
 * */
public class BlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Per().desc);
	}

}
class Per
{
	String name;
	int age;
	static String desc="test";
	@Override
	public String toString() {
		return "Per [name=" + name + ", age=" + age + "]";
	}
	{
		System.out.println("non static test");
	}
	static{
		System.out.println("static test");
	}

	public void eat() {System.out.println("eat");}
	public Per() {}
	public Per(String name,int age) {this.name=name;this.age=age;}
}