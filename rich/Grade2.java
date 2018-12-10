package rich;

import java.util.Scanner;

public class Grade2 {
public void menu4(){
	System.out.println("주민등록번호를 입력하세요");
	Scanner scanner = new Scanner(System.in);
	String a = scanner.next();
	char b = a.charAt(7);
	String c = "";
	
	switch (b) {
	case '1':c="남";break;
	case '2':c="여";break;
	case '3':c="남";break;
	case '4':c="여";break;
	case '5':c="외국인";break;
	case '6':c="외국인";break;
		
		

	default: c = "잘못 입력되었습니다.";
		break;
	}
	System.out.println(c);
}
}
