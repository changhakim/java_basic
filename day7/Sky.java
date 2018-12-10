package day7;
import java.util.Scanner;
public class Sky {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
			System.out.println("[메뉴]\n"
							+ "0.정지\n"
							+ "1.오칙연산\n"
							+ "2.BMI\n"
							+ "3.윤년\n"
							+ "4.성별\n"
							+ "평균등수");
			String st = scanner.next();
			
			switch(st) {
			case "0" : System.out.println("정지");
						return;
			case "1" : System.out.println("숫자를 입력하세요");
						int a = scanner.nextInt();
						String op = scanner.next();
						int b  = scanner.nextInt();
						
						int result = 0;
						
						switch(op) {
						case "+" : result =a + b;break;
						case "-" : result =a - b;break;
						case "*" : result =a * b;break;
						case "/" : result =a / b;break;
						case "%" : result =a % b;break;
						default : result =0;break;
						}
						System.out.println(a+op+b+"="+result);
						break;
						
			case "2" : System.out.println("키와 몸무게를 입력하세요");
						double t = scanner.nextDouble();
						double w = scanner.nextDouble();
						double bmi = w / (t * t) * 10000;
						String de = "";
						if(bmi > 40.0) {
							de = "고도비만";
							
						}else if(bmi > 35.0) {
							de = "중등도비만";
							
						}else if(bmi > 30.0) {
							de = "경도비만";
							
						}else if(bmi > 25.0) {
							de = "과체중";
							
						}else if(bmi > 18.5) {
							de = "정상";
							
						}else {
							de = "저체중";
						}
						System.out.println(bmi+de);
						break;
						
			case "3" : System.out.println("년도를 입력하세요");
			
						int year = scanner.nextInt();
						String yun = "";
						if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
							yun = "윤년";
							
						}else {
							yun = "평년";
						}
						System.out.println(yun);
						break;
						
						
						
						
						
						
						
						
						
			
			
			}
			
	
	
	
	
	}





}
}
