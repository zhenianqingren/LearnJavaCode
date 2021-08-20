package experiment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Inventory {//处理Invenctory.txt
	String Item_num;// 货物编号
	int Quantity;// 货物数量
	String supplier;// 供应商编号
	String Description;// 货物描述

	public Inventory() {
	}

	public Inventory(String I, int Q, String s, String D) {
		this.Item_num = I;
		this.Quantity = Q;
		this.supplier = s;
		this.Description = D;
	}//构造函数

	public static void main(String[] args) {
		new Handle().DealRecord(new Inventory[10], new Transactions[10]);
	}

	public String toString() {
		return "Inventory [Item_num=" + Item_num + ", Quantity=" + Quantity + ", supplier=" + supplier
				+ ", Description=" + Description + "]";
	}

}

class Transactions extends Inventory {//保存Transactions.txt
	char variety;// 事务类型

	public Transactions() {
	}

	public Transactions(char v, String I, int Q, String s, String D) {
		super(I, Q, s, D);
		this.variety = v;
	}

	public String toString() {
		return "Transactions [variety=" + variety + ", Item_num=" + Item_num + ", Quantity=" + Quantity + ", supplier="
				+ supplier + ", Description=" + Description + "]";
	}

}

class Handle {//处理类 已在报告中详细说明

	public int ReadInventory(Inventory in[]) {
		int k = 0;
		try {//读入Invenctory.txt到in中
			FileInputStream fis = new FileInputStream("D:/Inventory.txt");
			while (true) {
				String obj[] = new String[4];
				for (int i = 0; i < obj.length; i++)
					obj[i] = "";
				int t = 0;
				int count = 0;
				while (true) {
					t = fis.read();
					if (t == -1)
						break;
					char temp = (char) t;
					if (temp == '\n')//遇到换行时结束读入行循环
						break;
					if (temp == '\t') {
						count++;
						continue;//遇到\t说明一个数据元读取结束，进行下一轮循环
					}
					if (temp == '\r')
						continue;
					obj[count] += temp;
				}
				in[k++] = new Inventory(obj[0], Integer.parseInt(obj[1]), obj[2], obj[3]);//赋值给in
				if (t == -1)
					return k;//读到末尾时返回
			}
		} catch (IOException e) {
			System.out.println("未找到该文件");
		}
		return -1;
	}

	public int ReadTransactions(Transactions ts[]) {
		int k = 0;
		try {
			FileInputStream fis = new FileInputStream("D:/Transactions.txt");
			while (true) {
				String obj[] = new String[3];
				for (int i = 0; i < obj.length; i++)
					obj[i] = "";
				int t = 0;
				int count = 0;
				char v = (char) fis.read();//将每行的第一个字符读入，锁定它的处理类型
				fis.read();
				while (true) {
					t = fis.read();
					if (t == -1)
						break;
					char temp = (char) t;
					if (temp == '\n')
						break;
					if (temp == '\t') {
						count++;
						continue;
					}
					if (temp == '\r')//原理与上述类似
						continue;
					obj[count] += temp;
				}

				switch (v) {//根据variety的不同进行对象的赋值
				case 'O': // 发货订单
					ts[k++] = new Transactions(v, obj[0], Integer.parseInt(obj[1]), obj[2], "");
					break;
				case 'R':// 到货订单
					ts[k++] = new Transactions(v, obj[0], Integer.parseInt(obj[1]), "", "");
					break;
				case 'A':// 增加新货物
					ts[k++] = new Transactions(v, obj[0], 0, obj[1], obj[2]);
					break;
				case 'D':// 删除货物
					ts[k++] = new Transactions(v, obj[0], 0, "", "");
					break;
				}
				if (t == -1)
					return k;
			}
		} catch (IOException e) {
			System.out.println("未找到该文件");
		}
		return -1;
	}

	public void QuickSort(Transactions ts[], int lo, int hi) {
		if (lo >= hi)
			return;
		int standard = ts[lo].Quantity;//快速排序，方便对货物量由小到大的顺序进行处理
		int i = lo;
		int j = hi;
		Transactions temp = null;
		while (i != j) {
			while (i < j && ts[j].Quantity >= standard)
				j--;
			while (i < j && ts[i].Quantity <= standard)
				i++;

			temp = ts[i];
			ts[i] = ts[j];
			ts[j] = temp;
		}
		temp = ts[j];
		ts[j] = ts[lo];
		ts[lo] = temp;
		QuickSort(ts, lo, j - 1);
		QuickSort(ts, j + 1, hi);
	}

	public void DealRecord(Inventory in[], Transactions ts[]) {
		int len1 = ReadInventory(in);
		int len2 = ReadTransactions(ts);
		QuickSort(ts, 0, len2 - 1);
		// A:新增
		// R:到货
		// O:发货
		// D:删除
		// I Q s D
		for (int i = 0; i < len2; i++)
			if (ts[i].variety == 'A')
				in[len1++] = new Inventory(ts[i].Item_num, 0, ts[i].supplier, ts[i].Description);//直接新增

		for (int i = 0; i < len2; i++)
			if (ts[i].variety == 'R')
				for (int j = 0; j < len1; j++)
					if (in[j].Item_num.equals(ts[i].Item_num))
						in[j].Quantity += ts[i].Quantity;//直接到货

		try {
			FileWriter Shipping = new FileWriter("D:/Shipping.txt", true);
			FileWriter Error = new FileWriter("D:/Error.txt", true);

			for (int i = 0; i < len2; i++)
				if (ts[i].variety == 'O')
					for (int j = 0; j < len1; j++)
						if (in[j].Item_num.equals(ts[i].Item_num)) {
							if (in[j].Quantity - ts[i].Quantity >= 0) {//进行发货的判断
								in[j].Quantity -= ts[i].Quantity;
								Shipping.write(//记录发货
										ts[i].supplier + "\t" + ts[i].Item_num + "\t" + ts[i].Quantity + "\t" + "\n");
							} else
								Error.write(ts[i].supplier + "\t" + ts[i].Item_num + "\t" + ts[i].Quantity + "\n");
						}//发货错误

			for (int i = 0; i < len2; i++)
				if (ts[i].variety == 'D')
					for (int j = 0; j < len1; j++)
						if (in[j].Item_num.equals(ts[i].Item_num)) {
							if (in[j].Quantity == 0) {
								for (int k = j; k < len1 - 1; k++)
									in[k] = in[k + 1];
								len1--;
							} else
								Error.write("0" + "\t" + ts[i].Item_num + "\t" + ts[i].Quantity + "\n");
						}//与上述类似
			Shipping.close();
			Error.close();
		} catch (IOException e) {
			System.out.println("未在D盘中发现目标文件");
		}
		Update(in, len1);//更新NewInvenctory.txt
		DealSame();
	}

	public void Update(Inventory in[], int len) {
		try {
			FileWriter fw = new FileWriter("D:/NewInvenctory.txt", true);
			for (int i = 0; i < len; i++)
				fw.write(in[i].Item_num + "\t" + String.valueOf(in[i].Quantity) + "\t" + in[i].supplier + "\t"
						+ in[i].Description + "\n");
			fw.close();
		} catch (IOException e) {
			System.out.println("未发现此文件");
		}
	}

	public void DealSame() {
		FileWriter fw=null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/Shipping.txt"));
			String str = null;
			Vector<Vector<String>> v = new Vector<Vector<String>>();//存储数据
			HashMap<String, Integer> merge = new HashMap<String, Integer>();//已在报告中详细说明
			while ((str = br.readLine()) != null) {
				String t[] = str.split("\t");//按照\t进行分割字符串
				List<String> temp = new ArrayList<String>(Arrays.asList(t));
				v.add(new Vector<String>(temp));
				if (!merge.containsKey(t[1])||(merge.containsKey(t[1])&&!v.get(merge.get(t[1])).get(0).equals(t[0])))
					merge.put(t[1], v.size() - 1);//如果不包含相同的则放入merge中
				else{
					v.remove(v.size()-1);
					v.get(merge.get(t[1])).set(2,String.valueOf(Integer.parseInt(t[2])+Integer.parseInt(v.get(merge.get(t[1])).get(2))));
				}//若包含相同的，删除刚刚放入的数据，并按照merge中的给定的在v中的索引，将它的Quantity并入其中
				fw = new FileWriter("D:/Shipping.txt");
			}
			System.out.println(v.size());
			for(int i=0;i<v.size();i++)
				System.out.println(v.get(i).get(0)+"\t"+v.get(i).get(1)+"\t"+v.get(i).get(2));//一个打印的操作，可自行忽略
			for(int i=0;i<v.size();i++)
				fw.write(v.get(i).get(0)+"\t"+v.get(i).get(1)+"\t"+v.get(i).get(2)+"\n");//重新写入
			
			fw.close();
			br.close();
		} catch (IOException e) {
			System.out.println("未发现此文件");
		}

	}

}
