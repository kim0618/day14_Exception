package day14_Exception;
class BBB {
	public int aaa;
}
class AAA extends BBB{
	public void catch1(Object a) {
		System.out.println("오브젝트 : "+a);
	}
}


public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.catch1(123);
		a.catch1("aaa");
		a.catch1(1.12);
		a.catch1('a');
		
		
		
		
		
		
		
	}
}
