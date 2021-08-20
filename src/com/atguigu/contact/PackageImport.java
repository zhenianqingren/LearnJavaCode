package com.atguigu.contact;
/*
 * 
 * package声明类或接口所属的包，声明在首行
 * 每.一次代表一层文件目录
 * 同一个包下不能命名相同名字的类和接口，不同包可以
 * 
 * import源文件中使用import导入包下的指定类或接口
 * 若需要导入多个并列结构，直接写出即可
 * 导入的是java.lang下的可以省略不写
 * 不同包下的同名类要在定义变量前指明哪一个 如 new test1.Account(……);
 * 使用xxx.*可以导入该包下的所有类或接口，但要导入该包子包中的类或接口，仍需显示指定
 * import static:导入指定类或接口中的静态结构
 * */
import java.util.*;//导入包下所有结构
import java.util.Arrays;
public class PackageImport {
	public static void main(String args[])
	{
		int d=483;
		byte b=(byte)d;
		System.out.print(b);
	}
}
