package Class;
//Java类及类的成员:属性、方法、构造器、代码块、内部类
//封装、继承、多态
//类中的属性拥有默认初始化值，而局部变量没有
//属性加载到堆空间，局部变量加载到栈空间
public class Class_ {
	public static void main(String args[])
	{
		Person p1=new Person();
		//Person p2;  错误
		p1.name="A";
		System.out.println(p1.name);
		p1.sleep();
		p1.talk();   //在Java中，一个对象名可以看作是一个地址，此处即将p1的地址值赋给了p2
		Person p2=p1;//类似于C++中的地址，此处并未创建新对象,p2与p1指向同一块堆空间，与C++中不同，该方式只针对引用数据类型(基本数据类型依旧是值传递)
		p2.name="B";                                                //方法中的形参赋值与此相同
		System.out.println(p1.name);
		new Person().sleep();//匿名对象，特性与C++大致相同 可作为方法的形参
		new Person().sleep(1);
		new Person().sleep(1,2,3);
		
		new Student().sleep();
		
		new Student().eat();
		
	}
}

