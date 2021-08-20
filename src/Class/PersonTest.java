package Class;
/*
 * 抽象类的匿名对象
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个匿名子类的对象
		P p=new P(){
			public void create()
			{
				System.out.println("Create");
			}
			public void Eat()
			{
				System.out.println("Eat");
			}
			
		};
		method(p);
		//匿名类的匿名对象
		method(new P(){
			public void create()
			{
				System.out.println("Create");
			}
			public void Eat()
			{
				System.out.println("Eat");
			}
			
		});
	}
	public static void method(P p)
	{
		p.Eat();
	}
}

