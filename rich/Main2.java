package rich;

import java.util.Scanner;
import rich.Calc2;
import rich.Bmi2;
import rich.Calender2;
import rich.Gender2;
public class Main2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calc2 a1 = new Calc2();
	Bmi2 a2 = new Bmi2();
	Calender2 a3 = new Calender2();
	Gender a4 = new Gender();
	while(true) {
		System.out.println("[메뉴]\n"
				+ "1.계산기\n"
				+ "2.bmi\n"
				+ "3.달력\n"
				+ "4.성별\n"
				+ "5.평균등수");
		String select = scanner.next();
		switch (select) {
		case "0":System.out.println("종료");return;
		case "1":a1.menu1();break;
		case "2":a2.menu2();break;
		case "3":a3.menu3();break;
		case "4":a4.menu4();break;
		case "5":break;
			


		
			
		}
	}



}





}
