package Class;


/*
 * 类的内部成员之内部类
 * 1.Java允许将一个类A声明在另一个类B中，则A就是内部类，类B称为外部类
 * 2.内部类的分类：成员内部类(静态、非静态)VS局部内部类（方法内、代码块内、构造器内）
 * 
 * 成员内部类：一方面作为外部类的成员
 * 				可以被static修饰  
 * 				调用外部类结构
 * 				可以被四种不同权限修饰
 * 
 * 另一方面，作为一个类
 * 	类内可以定义属性、方法、构造器等
 * 	可以被final、abstract修饰
 * 
 * 
 * 1.如何实例化成员内部类的对象
 * 2.如何在成员内部类中区分调用外部类的结构
 * 3.开发中局部内部类的使用
 * 
 * */
public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建EE实例（静态成员内部类）
		Human.DD dd=new Human.DD();
		dd.show();
		//非静态成员内部类 不能直接调用
		Human human=new Human();
		Human.EE ee=human.new EE();
		ee.Sing();
		ee.display("test");
	}

}

class Human
{
	String name="Human";
	int age;
	public void Eat() {System.out.println("Eat");}
	//静态成员内部类
	static class DD{
		String name="DD";
		int age;
		void show() {System.out.println("DD show");}
	}
	//非静态成员内部类
	class EE{
		String name="EE";
		public EE() {}
		void Sing() {Eat();System.out.println("EE Sing");Human.this.Eat();}
		public void display(String name)
		{
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Human.this.name);//以此区分
		}
	}
	
	public void method()
	{
		class AA{
			
		}
		class BB{
			
		}
	}
	public Human() {}
}