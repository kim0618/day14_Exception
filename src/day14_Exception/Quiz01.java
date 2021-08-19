package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class Print{
	Scanner input = new Scanner(System.in);
	private String age;
	private int n;
	public void aaa(int n) {
		this.age = n+"";
		if(age.length() == 6) {
			if(age.charAt(0)<'9') {
				System.out.println("가입 가능");
			}else {
				System.out.println("가입 불가");
			}
		}else {
			System.out.println("길이가 다릅니다.");
		}
	}
	
	public boolean display() {
		while(true) {
		System.out.println("==== 인증 프로그램 ====");
		System.out.println("나이 입력 : ");
		try {
			n = input.nextInt();
			aaa(n);
		} catch (Exception e) {
			System.out.println("숫자를 입력 하세요");
			input.nextLine();
		}
		
	}
	}
	
}



public class Quiz01 {
	public static void main(String[] args) {
		
		Print ex = new Print();
		ex.display();
		
		
		
		
		
	}
}
