package exceptionLearn;
/*
 * 如何自定义异常类
 * 1.继承于现有异常结构 RuntimeException Exception
 * 2.提供全局常量 serialVersionUID
 * 3.提供构造器
 * 
 * */
public class ExceptionTest4 {

}

class MyException extends Exception {
	static final long serialVersionUID = -3387516993124229948L;
	public MyException() {}
	public MyException(String msg) {super(msg);}
}