package exceptionLearn;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		try {
			stu.regist(-1001);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}

class Student {
	private int id;

	public void regist(int id) throws MyException{
		if (id > 0)
			this.id = id;
		else {
//			System.out.println("非法数据");
//			手动抛出异常
			throw new MyException("非法数据");
		}
	}
}