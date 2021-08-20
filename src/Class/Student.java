package Class;


//代表继承Person类
//父类中的私有成员或属性子类不能直接访问 需要通过其他接口
//一个父类可以有多个子类
//一个子类只能有一个父类 此点与C++不同
//允许多层继承
//若没有显示继承某个类，则自动继承自java.lang.Object类


//方法重写 overwrite 针对父类中在子类进行重名重参数的函数进行重写
//子类的重写函数会覆盖父类的原有函数，子类对象执行重写函数，父类对象执行原父类函数
//重写规定：必须是重名重参数 子类重写的权限修饰符不小于父类权限修饰符 子类中不能重写父类中用private声明的方法
//父类中的被重写方法返回类型是void时，子类重写方法只能是void
//父类中的被重写方法返回值类型是A类时，子类重写方法可以是A或A的子类
//父类中的被重写方法返回值类型是基本数据类型时，子类重写方法只能是与之相同的基本数据类型

//在子类中使用super关键字可以显示调用父类中的属性或方法
//子类从父类中继承的方法不可以访问子类的属性，即使子类中又定义了一个与父类重名的属性，此时有两份副本
//（1）：调用基类构造器。这个步骤会不断地反复递归下去，首先是构造这种层次结构的根，然后是下一层导出类，等等，直到最低层的导出类。
//（2）：按声明顺序调用成员的初始化方法。 ．
//（3）：调用导出类构造器的主体。
public class Student extends Person {
	@Override
	public String toString() {
		return "Student [major=" + major + ", id=" + id + "]";
	}
	String major;
	int id;//学号 
//	子类中有重名的属性时不会覆盖父类原有属性，会有两份副本，通过super显示调用父类副本
	public Student() {System.out.println("Student Create");}
	public Student(String name,int age,boolean isMale,String major) {
		this.name=name;//其实就是super.name
		this.age=age;
		this.isMale=isMale;
		this.major=major;
	}
	public Student(String name) {super.name=name;}
	public Student(String name,int age) {super(name, age); /*此语句必须声明在首行*/}//使用super调用构造器来给子类继承的属性赋值
//	 error void sleep() {}								 因此this调用子类其他构造函数与super调用父类构造函数只能选一个
//  在子类构造器中既没有显示指定调用this其他构造器或super构造器，则默认调用super()
//  在子类的多个构造器中，至少有一个构造器使用了super(不管是显示还是默认)
	public void eat()
	{
		System.out.println("Student eat");
	}
	public void sleep() {super.sleep();System.out.println("Student sleep");}
	public String testoverwrite() {return null;}
}
