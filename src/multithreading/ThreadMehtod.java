package multithreading;
/*
 * setName()设置当前线程名字
 * yield()让出一下执行权 释放给其他线程
 * join()在线程a中调用线程b的join() 此时a进入阻塞状态 直到b完全执行以后 线程a才结束阻塞状态
 * stop()强制线程结束
 * boolean isAlive()判断线程是否还存活
 * sleep(long millitime):休眠当前线程 以毫秒为单位
 * wait()挂起 线程将释放所有资源 等得到通知后再次参加资源竞争 启动方法是notify()和notifyAll()
 * 
 * 
 * 
 * 线程的优先级
 * 1.MAX_PRIORITY:10
 * 2.MIN_PRIORITY:1
 * 3.NORM_PRIORITY:5
 * 
 * getPriority():获取线程的优先级
 * setPriority(int p)：设置线程的优先级 只是从概率上讲优先执行
 * */
public class ThreadMehtod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread();
		m1.setName("线程一");
		m1.start();
	}

}
