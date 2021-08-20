package h2;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat("小苹果","红色");
		Cat c2=new Cat("小叶","绿色");
		Cat c3=new Cat("小许","黄色");
		if(c1.equals(c2))
			System.out.println(c1.getname()+"和"+c2.getname()+"一样");
		else 
			System.out.println(c1.getname()+"和"+c2.getname()+"不一样");
		if(c1.equals(c3))
			System.out.println(c1.getname()+"和"+c3.getname()+"一样");
		else 
			System.out.println(c1.getname()+"和"+c3.getname()+"不一样");
		if(c2.equals(c3))
			System.out.println(c2.getname()+"和"+c3.getname()+"一样");
		else 
			System.out.println(c2.getname()+"和"+c3.getname()+"不一样");
	}

}

class Cat {
	private String name;
	private String color;

	public Cat() {
	}

	public Cat(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public boolean equals(Cat cat) {
		if (this.name == cat.name && this.color == cat.color)
			return true;
		else
			return false;
	}

	public String getname() {
		return this.name;
	}

	public String getcolor() {
		return this.color;
	}
}
