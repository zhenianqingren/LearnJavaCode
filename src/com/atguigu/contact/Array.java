package com.atguigu.contact;
import java.util.Scanner;
public class Array {
   /**
 * @Description
 * @author Bigbirdflyflyfly
 * @date 2021年2月28日下午8:14:24
 * @param args
 */
/**
 * @Description
 * @author Bigbirdflyflyfly
 * @date 2021年2月28日下午8:14:48
 * @param args
 */
/**
 * @Description
 * @author Bigbirdflyflyfly
 * @date 2021年2月28日下午8:14:50
 * @param args
 */
/**
 * @Description
 * @author Bigbirdflyflyfly
 * @date 2021年2月28日下午8:14:52
 * @param args
 */
public static void main(String[]args)
   {
	 //正确的数组定义
	 //int[]arr1;
	   int arr1[];
	   arr1=new int[]{1,2,3,4,5};
	   
	   String arr2[]=new String[5];//动态初始化
	   char arr3[]= {'a','b','c','d'};//定义时直接赋值，正确 静态初始化
	   char arr00[];
	   //arr00={'c','d'}; 错误，必须重新分配空间进行指定赋值
	   arr00=new char[] {'c','d'};
	 //数组的属性
	   System.out.println(arr1.length);
	   System.out.println(arr3.length);
	 //一维数组的遍历
	   for(int i=0;i<arr1.length;i++)
	   {
		   System.out.println(arr1[i]);
	   }
	 //一维数组的默认初始化值
	 //整型：0
	 //浮点型：0.0
	 //char型：0或'\u0000'而非'0'
	 //boolean型：false
	 //引用类型：null
	   
	 //二维数组的正确定义
	   int[][]arr5=new int[][] {{1,2,3},{4,5},{6,7,8}};
	   String[][]arr6=new String[3][4];
	   String[][]arr7=new String[3][];
	 //也是正确写法
	   int[]arr8[]=new int[][] {{1,2},{3,4}};
	   int[]arr9[]={{5,6,7},{8,9,10}};
	   char arr11[][]= {{'a'},{'b','c'},{'d','e','f'}};
	  // arr11=new char[][]= {{'p'},{'q'},{'l'}};错误
	 //二维数组的遍历
	   for(int i=0;i<arr5.length;i++)
	   {
		   for(int j=0;j<arr5[i].length;j++)
		   {
	          System.out.print(arr5[i][j]+" ");
           }
           System.out.println();
	   }
	   System.out.println("\n \n");
	//二维数组的默认初始化值
	/*
    int[][]arr=new int[4][3];	
	此方式外层元素初始化值为地址值，内层元素初始化值与一维数组情况相同
	 
	int[][]arr=new int[4][];
	此方式外层元素初始化值为null,内层元素不能调用，否则报错
	*/
	Scanner scanf =new Scanner(System.in);
	int size=scanf.nextInt();
	int yanghui[][]=new int[size][];
	for(int i=0;i<yanghui.length;i++) {
	    yanghui[i]=new int[i+1];
	    for(int j=0;j<yanghui[i].length;j++)
	    {
	    	if(j==0||j==yanghui[i].length-1)
	    		yanghui[i][j]=1;
	    	else
	    		yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];
	    }
   }

	for(int i=0;i<yanghui.length;i++) {
		for(int j=0;j<yanghui[i].length;j++)
			System.out.print(yanghui[i][j]+" ");
	System.out.println();
	}
	

	
	

	
	
	
 }
}








































