package exceptionLearn;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 子类重写父类方法的规则
 * 
 * 子类重写的方法抛出的异常不大于父类原方法抛出的异常
 * 
 * */
public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SuperClass {
	public void method1() throws IOException {

	}
}

class Subclass extends SuperClass {
	public void method1()/*不抛：正确*/throws /*Exception 大于：错误*/ FileNotFoundException/*等于：正确*/{

	}
}