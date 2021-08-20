package Class;

public class TestStaticBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubBlocks();
		System.out.println("One more Time");
		new SubBlocks();
	}

}
class Blocks
{
	static {System.out.println("父类静态初始化块");}
	
	public Blocks() {
		// TODO Auto-generated constructor stub
		System.out.println("父类构造函数");
		
	}
	{System.out.println("父类初始化块");}
}
class SubBlocks extends Blocks
{
	static Blocks testb_=new Blocks();
	static {System.out.println("子类静态初始化块");}
	Blocks testb=new Blocks();
	
	public SubBlocks() {System.out.println("子类构造函数");}
	
	{System.out.println("子类初始化块");}
}