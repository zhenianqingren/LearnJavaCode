package experiment;
/*
 * 
 * Point3D是Point2D的直接子类，它有三个整型成员变量x,y,z (分别为三维空间的X、Y、Z方向坐标)，Point3D有两个构造方法：Point3D(int x, int y, int z)和Point3D(Point2D p, int z)，两者均可实现对Point3D的成员变量x, y, z的初始化。
   Point3D有一个void型成员方法offset(int a, int b, int c)，该方法可以实现Point3D的平移 
   在Point3D中的主函数main()中实例化两个Point2D的对象p2d1，p2d2，打印出它们之间的距离，再实例化两个Point3D的对象p3d1，p3d2，打印出他们之间的距离。

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Point3D extends Point2D{
	double z;
	public Point3D() {x=0;y=0;z=0;}
	public Point3D(double x,double y,double z) {this.x=x;this.y=y;this.z=z;}
	public void offset(double a,double b,double c) {x+=a;y+=b;z+=c;}
	public static void main(String[] args) {
		Point2D p2d1=new Point2D(2.7,3.6);
		Point2D p2d2=new Point2D(5.4,12.8);
		
		double length1=Math.sqrt((p2d1.x-p2d2.x)*(p2d1.x-p2d2.x)+(p2d1.y-p2d2.y)*(p2d1.y-p2d2.y));
		
		Point3D p3d1=new Point3D(1.7,2.8,3.9);
		Point3D p3d2=new Point3D(6.1,7.2,8.3);
		double length2=Math.sqrt((p3d1.x-p3d2.x)*(p3d1.x-p3d2.x)+(p3d1.y-p3d2.y)*(p3d1.y-p3d2.y)+(p3d1.z-p3d2.z)*(p3d1.z-p3d2.z));
		
		System.out.println(length1);
		System.out.println(length2);
	}

}
