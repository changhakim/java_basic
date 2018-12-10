package day8;

import java.util.Scanner;

public class MyCalender {
public void menu3() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("년도를 입력하세요");
	
	int a = scanner.nextInt();
	String b = "";
	
	if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
		b = "윤년";
	}else{
		b= "평년";
	}
	System.out.println(b);
}
}
