package Class;

/*
 * java.lang.Object类
 * 1.Object类是所有Java类的根父类
 * 2.如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object类
 * */
public class ObjectTest {
	public static void main(String args[])
	{
		System.out.println(new Order().getClass().getSuperclass());
		Student student=new Student("US");
		System.out.println(student.name);
	}
}

class Order
{
	
}
