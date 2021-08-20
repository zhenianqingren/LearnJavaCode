package Revise;

import Test.TestInterFace;

public class Revise1 {

	public static void main(String[] args) {
		User u1=new User(100,"Jay");
		u1.test01(u1);
		System.out.println(u1.name);
		u1.test02(u1);//传递的是引用拷贝，传递的不是它本身，只是又拷贝了一份地址，可以看作此时有两份u1和u1_copy,test02虽然改变了u1_copy,但并没有改变u1
		System.out.println(u1.name);
	}

}

class User {
	int id;
	String name;
	String pwd;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void test01(User u) {
		u.name = "John";
	}
	public void test02(User u) {
		u=new User(80,"Claire");
	}
}