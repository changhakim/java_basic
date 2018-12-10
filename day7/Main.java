package day7;
import java.util.Scanner;
import java.util.Random;
import day7.Calc;
import day7.Bmi;
import day7.Yun;
import day7.Gender;
import day7.Avr;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calc c1 = new Calc();
		Bmi c2 = new Bmi();
		Yun c3 = new Yun(); 
		Gender c4 = new Gender();
		Avr c5 = new Avr();
		
		while(true) {
			System.out.println("[메뉴]\n"
							+ "0.정지\n"
							+ "1.오칙연산\n"
							+ "2.BMI\n"
							+ "3.윤년\n"
							+ "4.성별\n"
							+ "5.등수구하기");
		String start = scanner.next();
		
		switch(start) {
			case "0" :	System.out.println("종료");
					return;
			case "1" :	c1.menu1();break;
				
			case "2" :	c2.menu2();break;
				
			case "3" :	c3.menu3();break;
				
			case "4" :	c4.menu4();break;
			
			case "5" :	c5.menu5();break;
				
			
		}
		}
		
		
		
	
	}
}