package Class;


/*
 * 包装类的使用：
 * 1.java提供了8种数据类型对应的包装类，使得基本数据类型具有类的特征
 * 2.掌握基本数据类型、包装类、String三者之间的转换
 * 
 * 
 * 
 * 
 * */
public class WrapperClass {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
			int i=10;
			System.out.println(new Integer(i).toString());
			System.out.println(new Integer("10").toString());
			//包装类转换为基本数据类型
			Float f1=new Float(12.3);
			float f2=f1.floatValue();
			System.out.println(f2);
			//自动装箱：基本数据类型-》包装类
			int num1=10;
			Integer num2=num1;
			boolean b1=true;
			Boolean b2=b1;
			//自动拆箱：包装类-》基本数据类型
			int num3=num2;
			boolean b3=b2;
			//基本数据类型、包装类-》String
			//1.连接运算
			String s1=num1+" ";
			System.out.println(s1.getClass());
			//2.String中的valueof
			String s2=String.valueOf(num1);
			//String->包装类、基本数据类型  ：调用包装类的parsexxx()
			String str1="1234";
			int num4=Integer.parseInt(str1);
			Integer num5=Integer.parseInt(str1);
			//自动类型提升
			Object o1=true?new Integer(1):new Double(2.0);
			System.out.println(o1);
	}
}
