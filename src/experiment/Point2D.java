package experiment;
/*
 * 
 *  Point2D有两个整型成员变量x, y (分别为二维空间的X,Y方向坐标)，Point2D的构造方法要实现对其成员变量x, y的初始化。
 *   Point2D有一个void型成员方法offset(int a, int b)，它可以实现Point2D的平移。
 *
 * 
 * 
 * 
 * 
 * */
public class Point2D {
	double x,y;//计算两点之间的距离最好用浮点型
	public Point2D() {x=0;y=0;}
	public Point2D(double x,double y) {this.x=x;this.y=y;}
	public void offset(double a,double b) {x+=a;y+=b;}
}
