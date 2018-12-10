package day8;
import java.util.Scanner;
import day8.Calc;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calc calc = new Calc();
	
	while(true) {
		System.out.println("[메뉴\n]"
				+ "1.계산기\n"
				+ "2.BMI\n"
				+ "3.달력\n"
				+ "4.성별\n"
				+ "5.성적표"
				+ "");
		String start = scanner.next();
		
		switch(start) {
		case "0" :System.out.println("종료...");return;
		case "1" : calc.menu1();
			
			break;
		case "2" :Bmi bmi = new Bmi();break;
		case "3" :MyCalender calender = new MyCalender();break;
		case "4" :GenderChecker checker = new GenderChecker();break;
		case "5" :Grade grade = new Grade();break;
		default : break;
		}
	}
  }
}
