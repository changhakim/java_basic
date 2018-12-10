package day7;

import java.util.Scanner;

public class Avr {
public void menu5() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름과 점수를 입력하세요");
	String a1 = scanner.next();
	int b1 = scanner.nextInt();
	String a2 = scanner.next();
	int b2 = scanner.nextInt();
	String a3 = scanner.next();
	int b3 = scanner.nextInt();
	
	String one = "";
	String two = "";
	String three = "";
	
	if(b1 > b2 && b2 > b3 ) {
		one = a1; 
		two = a2;
		three=a3;
	}else if(b1 > b3 && b3 > b2 ) {
		one = a1; 
		two = a3;
		three=a2;
	}else if(b2 > b1 && b1 > b3 ) {
		one = a2; 
		two = a1;
		three=a3;
	}else if(b3 > b1 && b1 > b2 ) {
		one = a3; 
		two = a1;
		three=a2;
	}else if(b2 > b3 && b3 > b1 ) {
		one = a2; 
		two = a3;
		three=a1;
	}else {
		one = a3; 
		two = a2;
		three=a1;
	}
	
System.out.println("1등"+one+"2등"+two+"3등"+three);



}
}
