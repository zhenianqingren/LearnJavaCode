package Ton;

/*
 * 1.所谓类的单例设计模式就是采取一定的方法保证在整个软件系统中，对某个类只存在一个对象实例
 * 
 * 2.如何实现
 * 
 * 
 * 
 * 饿汉式
 * 坏处：加载时间过长
 * 好处：线程安全
 * 
 * 饱汉式
 * 好处：延迟对象的创建
 * 
 * */
public class Singletontest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = Bank.getinstance();
		Bank b2 = Bank.getinstance();
		System.out.println(b1 == b2);
	}

}

//饿汉式
class Bank {
	// 1.私有化类的构造器
	private Bank() {

	}

	// 2.内部创建类的对象
	// 4.将内部创建的对象声明为静态
	private static Bank instance = new Bank();

	// 3.提供静态方法返回内部类创建的对象
	public static Bank getinstance() {
		return instance;
	}
}

//懒汉式
class Order {
	// 1.私有化类的构造器
	private Order() {
	}

	// 2.声明当前类的对象但并不进行初始化
	// 4.此对象也必须为static
	private static Order instance = null;

	// 声明public static 返回当前类对象的方法
	public static Order getinstance() {
		if (instance == null)
			instance = new Order();
		return instance;
	}

}
