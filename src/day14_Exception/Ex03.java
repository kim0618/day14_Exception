package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x,y,result;
		System.out.println("수 입력 : ");
		x = input.nextInt();
		y = input.nextInt();
		try {
			result = x/y;
			System.out.println("x / y = "+result);
		} catch (Exception e) {
			System.out.println("0으로는 나눌수 없습니다.");
			e.printStackTrace();	// 문제가 뭔지 알려줌
		}finally {
			System.out.println("마지막에 수행해야할 내용이 있으면 쓴다");
		}
		System.out.println("다음 문장들 실행~");
		
		
		
		
		
		
		
	}
}
