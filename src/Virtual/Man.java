package Virtual;


public class Man extends Person{
	boolean isSmoking;
	int id=1002;
	
	Man(){}
	Man(boolean is,int id){this.isSmoking=is;this.id=id;}
	public void mantest() {System.out.println("null");}
	public void sleep() {System.out.println("man sleep");}
	public void eat() {System.out.println("man eat");}
//	public boolean equals(Object )
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Man other = (Man) obj;
//		if (id != other.id)
//			return false;
//		if (isSmoking != other.isSmoking)
//			return false;
//		return true;
//	}
	//equals定义在基类之中，可以重写
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj instanceof Man)
		if(((Man) obj).isSmoking==this.isSmoking&&((Man)obj).id==this.id)
			return true;
		return false;
	}
}
