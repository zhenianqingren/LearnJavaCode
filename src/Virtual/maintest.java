package Virtual;
import Virtual.Person;
//多态的使用：虚拟方法调用
//有了对象的多态性以后，在编译器只能调用父类中的方法，但在运行期实际执行的是子类重写的方法
//编译：看左边  运行：看右边
//多态性使用前提：
//类的继承关系 要有方法的重写
//
public class maintest {
	public static void main(String args[])
	{
//		对象多态性：父类引用指向子类对象
		Person p1=new Man();
		Person p2=new Woman();
		
		p1.eat();
		p2.sleep();
//		p1.mantest(); error
		p1.persontest();
		System.out.println(p1.id);//多态性不适用于属性，编译和运行时都看左边
		
//有了对象的多态性以后，内存中实际上加载了子类特有的属性和方法，但由于变量类型声明为父类类型，导致
//编译时只能调用父类中声明的属性和方法，子类特有的属性和方法不能被调用
//可以通过强制类型转换，向下转
		Man m1=(Man)p1;
		m1.mantest();
//		Woman w1=(Woman)p1;不会报错，但运行时会发生ClassCastException的异常
//		使用instanceof
//		a instanceof A  判断a对象是否是类A的一个实例，若是，返回true,若不是，返回false

//		若 a instanceof A返回true 则a instanceof B也返回true 其中B是A的父类
//		
		
		
		if(p2 instanceof Woman)
		{
			Woman w2=(Woman)p2;
			w2.womantest();
		}
		/*
		 * equals是一个方法而非运算符
		 * 只适用于引用数据类型
		 * Object类中的equals实际上比的还是地址值
		 * String Date File包装类等都重写了equals,比较的是实体对象的内容
		 * */
		Man m2=new Man(true,1);
		Man m3=new Man(true,1);
		String str1=new String("null");
		String str2=new String("null");
		System.out.println(str1.equals(str2));
		System.out.println(m2.equals(m3));
		
		
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
			if(sum>21)
				continue;
			System.out.println(i);
		}
		System.out.println(sum);
	}
}
