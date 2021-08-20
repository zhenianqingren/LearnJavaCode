package Class;

/*
 * abstract:抽象的
 * abstract:可以用来修饰类和方法
 * 不能进行实例化，但可以进行定义
 * 
 * 抽象父类中要有构造器便于子类对象调用
 * 包含抽象方法的类必须被声明为抽象类 反之，抽象类中可以没有抽象方法
 * 
 * 抽象方法之中只有声明没有实现
 * 子类重写抽象父类中的所有方法后方可实例化，否则应该被声明为抽象类
 * 
 * abstract不能修饰属性和方法
 * abstract不能修饰私有方法和静态方法和final修饰的方法
 * */
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p1;//true
//		P p2=new P();wrong
		S s1=new S();
	}

}
abstract class Creature
{
	abstract public void create();
}
abstract class P extends Creature
{
	String name;
	int age;
	public P()
	{
		
	}
	public P(String name,int age)
	{
		this.age=age;
		this.name=name; 	
	}
	//抽象方法无方法体
	public abstract void Eat();
}
class S extends P
{
	public S() {}
	public S(String name,int age) {super(name,age);}
	public void Eat() {}
	public void create() {System.out.println("Create");}


}