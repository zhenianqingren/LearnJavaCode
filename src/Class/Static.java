package Class;
/*
 * static关键字的使用
 * 
 * 1.用来修饰属性、方法、代码块、内部类
 * 修饰属性：静态变量
 * 类的多个对象共享同一个静态变量
 * 静态变量随着类的加载而加载
 * 静态变量的加载早于对象
 * 静态变量只被初始化一次，在内存之中只有一份，存在于静态域中
 * 即静态实例对象变量的构造器只被调用一次
 * 实例化一个类的对象之前实例化它的静态属性或方法，即如果有静态实例化变量，先实例化它而忽视对象变量的声明次序
 * 总结：（第一次）初始化 父类静态变量(按声明次序 包括代码块) 子类静态变量(按声明次序 包括代码块) 父类非静态成员变量(包括代码块) 父类构造函数 子类非静态成员变量(包括代码块) 子类构造函数
 * 修饰方法：
 * 可以直接通过类调用
 * 静态方法只能调用静态方法和属性
 * 非静态方法及可以调用非静态方法和属性，也可以调用静态方法和属性
 * 静态方法不能使用this和super
 * */
public class Static {
	public static void main(String args[]) {
		person_ p1=new person_();
		person_ p2=new person_();
		p1.nation="US";
		System.out.println(p2.nation);
		person_.show();
	}
}

class person_
{
	String name;
	int age;
	static String nation;
	static void show() {System.out.println("US");}
}