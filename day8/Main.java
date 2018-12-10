package day8;
import java.util.Scanner;
import day8.Calc;
import day8.Bmi;
import day8.MyCalender;
import day8.GenderChecker;
import day8.Grade;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calc a = new Calc();
	Bmi b = new Bmi();
	MyCalender c = new MyCalender();
	GenderChecker d = new GenderChecker();
	Grade e = new Grade();
	
	while(true) {
		System.out.println("[메뉴]\n"
				+ "1.계산기\n"
				+ "2.BMI\n"
				+ "3.달력\n"
				+ "4.성별\n"
				+ "5.성적표"
				+ "");
		String start = scanner.next();
		
		switch(start) {
		case "0" :System.out.println("종료...");return;
		case "1" : a.menu1();break;
		case "2" : b.menu2();break;
		case "3" :c.menu3();break;
		case "4" :d.menu4();break;
		case "5" :e.menu5();break;
		
		}
	}
  }
}
