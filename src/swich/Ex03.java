package swich;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		Scanner input = new Scanner(System.in);
		String name =null;
		while (true) {
			System.out.println("이름 변경");
			name=input.next();
			
			System.out.println("당신 이름: "+name);
		}
		*/
		
		//1번 문제
		/*
		Scanner input = new Scanner(System.in);
		
		int num;
	
		System.out.println("숫자를 입력하시오");
		
		
		while (true) {
			
			num=input.nextInt();
		    num%=7;
			
			switch (num) { //num%7
			case 1: System.out.println("월요일"); break;
			case 2: System.out.println("화요일"); break;
			case 3: System.out.println("수요일"); break;
			case 4: System.out.println("목요일"); break;
			case 5: System.out.println("금요일"); break; 
			case 6: System.out.println("토요일"); break;
			case 0: System.out.println("일요일"); break;
			default : System.out.println("등록할 수 없는 날짜");
			}
		}*/
		
		
		//2번문제
		Scanner input = new Scanner(System.in);
		int num1;
		
		while(true) {
		System.out.println("숫자를 입력하시오");
		num1=input.nextInt();
		String Myadr =null;
		String Woadr =null;
		System.out.println("우리집 등록");
		System.out.println("회사 등록");
		System.out.println("등록보기");
		
		switch (num1) {
		case 1: System.out.println("우리집 목적지");
				Myadr =input.next();
		case 2: System.out.println("회사 목적지");
				Woadr =input.next();
		case 3: System.out.println("우리집 :"+Myadr);
				System.out.println("회사 :"+Woadr);
		
		}
		}
		
	}

}
