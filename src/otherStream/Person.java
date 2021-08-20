package otherStream;

import java.io.Serializable;

/*
 * 
 * Person满足以下要求方可实例化
 * 1.实现接口：Serializable
 * 2.当前类提供一个全局long型常量serialVersionUID
 * 3.保证其内部所有属性均是可序列化（基本数据类型默认可序列化）
 * 如内部类，对象成员所属的类
 * 
 * 
 *ObjectInputStream和ObjectOutputStream不能序列化static和transient修饰的成员变量 
 * */
public class Person implements Serializable{
	public static final long serialVersionUID=123456L;
//	如果类没有显示定义这个静态常量，它的值是java运行时环境根据类的内部细节自动生成的。若类的实例变量（即成员）做了修改，serialVersionUID可能
//	发生变化，此时会出现要求读取的成员与文件中已经存储的成员不匹配的现象，若显示声明后，就算不匹配系统也会根据默认值规则自动分配
//	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	private String name;
	private int age;
	
}
