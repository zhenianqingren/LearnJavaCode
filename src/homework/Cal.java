package homework;

import java.math.*;
public class Cal {
	public static void main(String args[]) {
		BigInteger sum=BigInteger.valueOf(0L);//记录总和
		BigInteger i=BigInteger.valueOf(1L);
		BigInteger j=BigInteger.valueOf(1L);
		int k=1;	//统计循环次数
		do {
			i=i.multiply(j);//i=i*j
			sum=sum.add(i);//sum+=i;
			j=j.add(BigInteger.ONE);//j++
			k++;
		}while(k<=100);
		String str=String.valueOf(sum);//以字符串形式输出
		System.out.println(str);
	}
}
