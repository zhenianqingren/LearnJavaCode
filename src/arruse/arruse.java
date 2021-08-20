package arruse;

import java.util.Arrays;

//Arrays工具类的使用

public class arruse {
	public static void main(String args[])
	{
		int arr1[]= {1,2,3,4};
		int arr2[]=new int[] {1,4,3,2};
		
		boolean judge=Arrays.equals(arr1,arr2);//判断两个数组是否相等
		System.out.println(judge);
		System.out.println(Arrays.toString(arr1));//String toString() 打印数组
		Arrays.fill(arr1, 0);//将指定数值填充到数组中
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr2);//对数组排序
		System.out.println(Arrays.toString(arr2));
		int index=Arrays.binarySearch(arr2,3);//二分查找
		System.out.println(index);//返回下标
		index=Arrays.binarySearch(arr2, 10);
		System.out.println(index);
	}
}
