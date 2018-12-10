package rich;
import java.util.Scanner;
import rich.Calc;
import rich.Calender;
import rich.Bmi;
import rich.Gender;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calc a = new Calc();
	Bmi b = new Bmi();
	Calender c = new Calender();
	Gender d = new Gender();
	while(true) {
		System.out.println("[메뉴]\n"
				+ "1.계산기\n"
				+ "2.BMI\n"
				+ "3.달력\n"
				+ "4.성별\n"
				+ "5.평균등수");
	String select = scanner.next();
	switch(select) {
	case "0" : System.out.println("종료");
				return;
	case "1" : a.menu1();break;
	case "2" : b.menu2();break;
	case "3" : c.menu3();break;		
	case "4" : d.menu4();break;

	}
	
	
	
		
	
	
	}
}
}
