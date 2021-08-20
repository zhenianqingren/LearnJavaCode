package com.atguigu.contact;
/*
 * 
 * 1.final用来修饰一个类：此类不能被其他类继承
 * 例如String StringBuffer等
 * 
 * 2.final用来修饰一个方法代表此方法不能被重写
 *  
 * 3.final用来修饰变量 其作用相当于const
 * 
 * 4.final用来修饰属性，可以考虑的赋值位置有：显式初始化(即定义时直接初始化) 代码块初始化 构造器初始化
 * 
 * 5.final修饰局部变量 尤其是final修饰形参时，表明此形参是一个常量，当我们调用此方法时，给常量形参赋一个实参，一旦赋值以后，
 * 只能在方法中调用此形参，但不能进行重新赋值
 * 
 * static用来修饰属性：全局常量
 * */
public class FinalTest {

}

final class FinalA
{
	
}