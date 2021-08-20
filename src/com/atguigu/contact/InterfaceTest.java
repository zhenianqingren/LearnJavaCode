package com.atguigu.contact;
/*
 * 接口的使用
 * 1.接口使用interface定义
 * 2.Java中，接口和类是两个并列的结构
 * 3.如何定义接口：定义接口中的成员
 * 
 * 	3.1 JDK7及以前：只能定义全局变量和抽象方法
 * 	》全局变量:public static final 书写时可以省略不写
 * 	>抽象方法:public abstract
 * 	3.1 JDK8:除了定义全局变量和抽象方法之外，还可以定义静态方法，默认方法
 * 
 * 接口中不能定义构造器 意味着接口不能实例化
 * 
 * 接口通过让类去实现(implements)的方式来使用
 * 如果实现类覆盖了接口中的所有抽象方法，则此类就可以实例化
 * 如果实现类没有覆盖接口中的所有抽象方法，则此类仍为抽象类
 * 
 * Java类可以实现多个接口---打破了单继承性的弊端
 * 
 * 格式：class AA extends BB implements CC,DD,EE
 * 
 * 接口与接口之前可以继承，而且可以多继承
 * 接口的具体使用体现多态性:即接口可以指向被实现的对象
 * 
 * 
 * */
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Flyable.MAX_SPEED=2; FALSE
		Flyable fly1=new Plane();
		Flyable fly2=new Bullet();
	}

}
interface Flyable
{
	int MAX_SPEED=7900;//默认public static final
	int MIN_SPEED=1;
	void fly();
	void stop();
}

interface Attack
{
	void attack();
}

class Plane implements Flyable
{
	public void fly() {System.out.println("Fly");}
	public void stop() {System.out.println("Stop");}


}

class Bullet implements Flyable,Attack
{
	public void fly() {System.out.println("Bullet Fly");}
	public void stop() {System.out.println("Bullet Stop");}
	public void attack() {System.out.println("Bullet Attack");}
}
interface testA
{
	
}
interface testB extends testA
{
	
}
















abstract class Kite implements Flyable
{
	public void Fly() {System.out.println("Kite Fly");}

}