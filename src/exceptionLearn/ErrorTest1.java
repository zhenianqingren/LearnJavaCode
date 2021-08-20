package exceptionLearn;

/*
 * 
 * 异常的处理：抓拋模型
 * 
 * 过程一：抛 程序在正常执行时，一旦出现异常，就会在异常代码处生成一个对应异常类的对象 并将此对象抛出 一旦抛出后 程序不再执行
 * 
 * 
 * 过程二 抓 try-catch-finally和throws
 * try{
 * 
 * 
 * 
 * }catch(异常类型1 变量名1){
 * 	处理方式
 * }
 * ……
 * catch(异常类型n 变量名n){
 * 	处理方式
 * }
 * finally{
 * 	一定会执行的代码
 * }
 * finally也可以不写
 * 
 * catch中的异常若有父子类关系 则子类异常要在父类异常前面
 * 常用的异常对象处理方式 String getMessage() 和printStackTrace()
 * 在try中定义的变量出了try结构后不能再使用
 * 使用该结构处理的编译时异常在运行时仍然可能出现异常
 * */
public class ErrorTest1 {

	public static void main(String[] args) {

		String str = "abc";
		try {
			int num = Integer.parseInt(str);// 此处出现异常后再往下的代码不会再执行
			System.out.println("Hello World");
		} catch (NumberFormatException e) {
			System.out.println("数值转换异常");//一旦匹配到的第一个catch执行完毕后便会跳出try-catch
		} catch (Exception e) {
			System.out.println("出现异常");
		}
		System.out.println("Hello World out");
	}

}
