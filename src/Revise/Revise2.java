package Revise;

public class Revise2 {

	public static void main(String[] args) {
		System.out.println(new GrandSon().t);
		System.out.println("\n\n");
		System.out.println(new GrandSon().t);
		
	}

}
class Base
{
	static int t;
	public Base() {
		System.out.println("New Base");
	}
	{
		System.out.println("Non Static Base Block2");
	}
	static 
	{
		System.out.println("Static Base Block");
	}
	{
		System.out.println("Non Static Base Block1");
	}
}
class Son extends Base
{
	public Son()
	{
		System.out.println("New Son");
	}
	{
		System.out.println("Non Static Son Block");
	}
	static 
	{
		System.out.println("Static Son Block");
	}
}
class GrandSon extends Son
{
	public GrandSon() {
		System.out.println("New GrandSon");
	}
	
	{
		System.out.println("Non Static GrandSon Block");
	}
	static 
	{
		System.out.println("Static GrandSon Block");
	}
}























