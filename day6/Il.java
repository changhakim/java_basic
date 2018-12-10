package day6;
import java.util.Scanner;
public class Il {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
		System.out.println("[메뉴]\n"
						  + "0.정지\n"
						  + "1.오칙연산계산기\n"
						  + "2.BMI계산기\n"
						  + "3.윤년 계산기\n"
						  + "4.성별 뽑기\n"
						  + "5.평균등수구하기");
		
		
		String st = scanner.next();
		switch(st) {
		case "0": System.out.println("정지");
				return;
		case "1": System.out.println("숫자를입력하세요");
					int a = scanner.nextInt();
					String op = scanner.next();
					int b = scanner.nextInt();
					
				int result = 0;
				
				switch(op) {
				case "+" : result = a+b;break;
				case "-" : result = a-b;break;
				case "*" : result = a*b;break;
				case "/" : result = a/b;break;
				case "%" : result = a%b;break;
				default : result = 0;break;
				}
				System.out.println(a + op + b+"="+result);
				break;
		case "2" : System.out.println("키와 몸무게를 입력하세요");
					double t = scanner.nextDouble();
					double w = scanner.nextDouble();
					double bmi = w / (t * t) * 10000;
					
					String m = "";
					
					if(bmi>40.0) {
						m = "고도비만";
					}else if(bmi>35.0) {
						m = "중등도비만";
					}else if(bmi>30.0) {
						m = "경도비만";
					}else if(bmi>25.0) {
						m = "과체중";
					}else if(bmi>18.5) {
						m = "정상";
					}else {
						m = "저체중";
					}
					System.out.println(bmi +m);
					break;
		
		
		case "3" : System.out.println("년도를 입력하세요");
		
					int year = scanner.nextInt();
					String year1 =scanner.next();
					
					if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
						year1 ="윤년";
						
					}else{
						year1 = "평년";
					}
					System.out.println(year);
					break;
					
		case "4" : System.out.println("주민등록번호를 입력하세요");
		
					String num3 = scanner.next();
					char nu3 = num3.charAt(7);
					String gender = "";
					switch (nu3) {
					case '1': gender = "남";break;
					case '2': gender = "여";break;
					case '3': gender = "남";break;
					case '4': gender = "여";break;
					case '5': gender = "외국인";break;
					case '6': gender = "외국인";break;
					

					default: gender = "다시입력하세요";break;
					}
					System.out.println(gender);
					break;
					
		case "5" : System.out.println("이름과 등수를 입력하세요");
					String n1 = scanner.next();
					int q1 = scanner.nextInt();
					String n2 = scanner.next();
					int q2 = scanner.nextInt();
					String n3 = scanner.next();
					int q3 = scanner.nextInt();
					String one = "";
					String two = "";
					String three = "";
					
					
					if(q1>q2 && q2>q3) {
						one = n1;
						two = n2;
						three = n3;
					}else if(q1>q3 && q3>q2) {
						one = n1;
						two = n3;
						three = n2;
					}else if(q2>q1 && q1>q3) {
						one = n2;
						two = n1;
						three = n3;
					}else if(q3>q1 && q1>q2) {
						one = n3;
						two = n1;
						three = n2;
					}else if(q2>q3 && q3>q1) {
						one = n2;
						two = n3;
						three = n1;
					}else {
						one = n3;
						two = n2;
						three = n1;
					}
							
				System.out.println("1등"+one+"2등"+two+"3등"+three);
				break;
				
				
				
				
				
				}
		
		
	}
}
}
