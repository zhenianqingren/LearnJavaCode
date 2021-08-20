package Revise;

import java.awt.Color;

import javax.swing.JFrame;

//JDK中提供了AWT和Swing两个包，用于GUI程序的设计和开发
//AWT位于java.awt中
//Java中窗口视为一个容器，把不同的图形界面组件放入其中
public class Revise_GUI {

	public static void main(String[] args) {
		MyFrame1 f1=new MyFrame1("Hello GUI");
		
	}

}

//基本操作
class MyFrame1 extends JFrame{
//	JFrame这样的框架,一旦创建,在其中就已经包含一个内容面板,一般我们在往JFrame中添加组件时,都加在了内容面板中,这个面板可以通过JFrame的成员方法getContentPane()取出来,
//	所以如果设置JFrame的背景颜色,仍然会被内容面板盖住,不如设置内容面板的背景颜色
//	当时如果框架中还加有其他面板,内容面板的颜色也会被其他面板盖住,要注意一下面板的布局情况
	public MyFrame1(String s) {
		super(s);
		setSize(300,200);
		getContentPane().setBackground(Color.yellow);
		setVisible(true);
	}
//	setTitle 设置标题栏文字
//	setResizable 是否可以改变框架大小
//	dispose 关闭窗口 回收所有资源
//	setSize
//	setBackground
//	setVisible 组件是否可见
//	setBounds 设置大小和位置
}

//常用组件
//Lable 在界面上显示一行文字
//Button 按钮 点击触发事件
//TextField 单行文本 接受用户输入
//TextArea 多行文本
//Checkbox 复选框 提供简单的on/off开关
//CheckboxGroup 单选框 提供单项选择 每个选项相关联的 互斥的
//Dialog 用户数据的接受 提示一些信息
//FileDialog 用来为用户选择文件
//Choice 下拉列表
//
//界面布局管理器：当把组件添加到容器中时，希望控制组件在容器中的位置 容器可以使用方法 setLayout()
//FlowLayout的布局策略时将容器中的组件按照加入的顺序从左向右排列，如果一行排满下一行继续，每行均采取居中排列 是Panel型容器的默认布局，即Panel及其子类
//创建的容器对象，如果不专门为其指定布局，则它们默认为FlowLayout

//BorderLayout布局策略是把容器内的空间划分为东西南北中5个区域分别用英文的East West South North Center表示，向容器中加入每个组件都要
//指明在容器的区域。
//是Window型容器的默认布局，例如Frame、Dialog都是Window类的子类，它们的默认布局都是BorderLayout布局


//CardLayout 可以容纳多个组件 但是实际上同一时刻只能从这些组件中选择一个来显示，这个被显示的组件将占据所有的容器空间，依次排序
//GridLayout的布局策略是把容器划分为若干行乘若干列的网格区域，组件就位于这些划分出来的小格中，但每个网格都是相同大小并且强制组件与网格大小相同
//GridBagLayout 将组件排行在一行或者一列，这取决于创建盒式布局对象时，是否指定了是行排列或者列排列
//使用行（列）式盒式布局的容器将组件排在一行（列），组件按加入的先后顺序从左（上）到右（下）排列，两端是剩余的空间
//和FlowLayout不同的是，它只有一行（列），即使组件再多，也不会延伸到下一行（列），这些组件可能会被缩小大小，紧缩在这一行（列）中

//Java对事件处理采用委托事件模型的形式
//监听器对象就是一个实现了某种类型的监听器接口的对象 (addXXXListener())
//ActionEvent 处理按钮 列表双击 单机菜单项目 监听器:ActionListener
//MouseEvent 处理鼠标拖动、移动、单机、按下、释放或者进入、退出组件的事件 
//WindowEvent 与窗口有关 WindowListener
//TextEvent 文本区域
//ComponentEvent 处理组件被隐藏、移动、尺寸调整或变为不可见的事件
//FocusEvent 组件获得或失去焦点
//KeyEvent 键盘的输入
//InputEvent 复选框 列表项 控件的选择


//适配器：实现了相应接口的类 为接口中的方法提供方法体
//事件监听器的实现形式：顶级类形式 类本身作为事件监听器类 匿名内部类


//Swing包 在awt的相关类前加一个J
//通过setDefaultCloseOperation() 关闭窗口
//DO_NOTHING_ON_CLOSE 不执行任何操作
//HIDE_ON_CLOSE 自动隐藏窗体
//DISPOSE_ON_CLOSE 自动隐藏并释放该窗体
//EXIT_ON_CLOSE 退出应用程序


//BoxLayout和Box容器 BoxLayout把控件依次进行水平或者垂直排列布局


//绘制图形 Graphics、Graphics2D
//public void paint(Graphics g)
//图形上下文：通俗讲就是画图环境。每个窗口构件（如主窗口、按钮等） 都有一个 自己的图形上下文对象，使用这个对象来画，这个对象就是Graphics对象
//getGraphics()
//Java坐标系 左上角0 0








