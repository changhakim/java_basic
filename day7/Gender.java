package day7;

import java.util.Scanner;

public class Gender {
	public void menu4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		String num = scanner.next();
		char num1 = num.charAt(7);
		String result = "";
		
		switch(num1) {
		case '1' : result = "남";break;
		case '2' : result = "여";break;
		case '3' : result = "남";break;
		case '4' : result = "여";break;
		case '5' : result = "외국인";break;
		case '6' : result = "외국인";break;
		default : result = "다시 입력하세요";break;
		
		
		}
		
		System.out.println(result);
	
	
	
	
	}

}
