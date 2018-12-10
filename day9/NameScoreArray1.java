package day9;

import java.util.Scanner;

public class NameScoreArray1 {
public void menu9(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("학생수 몇명?");
	int count = scanner.nextInt();
	String[] names = new String[count];
	int[] scores = new int[count];
	int iter = 0;
	String na = "";
	while(true) {
		System.out.println("0.종료 1.진행");
		String select = scanner.next();
		switch(select) {
		case "0" : System.out.println("종료");return;
		case "1"  : 
			System.out.println("학생 이름과 점수를 입력하세요");
			
			for(int i=0;i<names.length;i++) {
				names[i] = scanner.next();
				scores[i] = scanner.nextInt();
				na += names[i]+":"+scores[i];
			}
			System.out.println(na);break;
		}
	}
	
			
}
	
}
