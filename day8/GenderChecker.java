package day8;

import java.util.Scanner;

public class GenderChecker {
public void menu4() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("주민등록번호를 입력해주세요");
	String a = scanner.next();
	char b = a.charAt(7);
	String gender = "";
	switch (b) {
	case '1' : gender = "남";break;
	case '2' : gender = "여";break;
	case '3' : gender = "남";break;
	case '4' : gender = "여";break;
	case '5' : gender = "외국인";break;
	case '6' : gender = "외국인";break;
	default: gender = "잘못입력하셨습니다";break;
		
	}
	System.out.println(gender);
	
}
}
