package Class;

class Person
{
	//属性
	String name;
	int age;
	boolean isMale;
	int id;//身份证号
	private int test;//Java中封装性的特质与C++类似
	//Java规定的4种权限(从小到大排列) private    缺省     protected public
	//                        仅类内部    +同一个包     +不同包的子类  +所有(不同的工程不行)
	//修饰类只能使用缺省 public
	
	//构造器 类似于C++中的构造函数
	//显示定义默认构造器后 系统不再提供
	public Person() {System.out.println("Create new Person");}
	public Person(int A) {this();test=A;}
	public Person(String n,int A) {this(A);name=n;age=A;/*this(A);*/}//可以调用另一个构造器，但必须放在构造器内部的第一行
	public Person(boolean M) {this.isMale=M;}//与C++中的this相似，但Java中的this指的是当前对象而不是指针
	                                         //如果一个类中有n个构造器，最多只能有n-1个调用this(形参)
	
	
	//方法
	//1.可根据形参的类型或个数以及顺序（不同类型）进行重载方法
	//2.类型不匹配时会发生自动类型提升
	//3.可变个数形参的方法 数据类型...变量名 有匹配的重载优先考虑匹配的方法 与相同类型的形参数组不构成重载
	public void eat() {System.out.println("Eat");}
	public void eat(char a) {System.out.println("Eat_");}
	public void sleep() {System.out.println("Sleep");}
	public void sleep(int...i) {System.out.println(i.length+"Sleep_");}//此处i可用作数组
	public void talk() {System.out.println("Talk");}
	
	Object testoverwrite() {return null;}
}

