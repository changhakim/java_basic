package day6;
import java.util.Scanner;
public class Sunggong {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	
	while(true) {
		System.out.println("[메뉴]\n"
				+ "0.종료\n"
				+ "1.계산기\n"
				+ "2.Bmi\n"
				+ "3.윤년계산\n"
				+ "4.주민번호\n"
				+ "5.등수구하기");
		String st = scanner.next();	
		
		
	switch(st) {
	case "0" : System.out.println("종료");
	
				return;
	case "1" : 
			 System.out.println("계산기");
			 int a = scanner.nextInt();
			 String op = scanner.next();
			 int b = scanner.nextInt();
			 int result = 0;
			 switch (op) {
			case "+": result = a + b;break;
			case "-": result = a - b;break;
			case "*": result = a * b;break;
			case "/": result = a / b;break;
			case "%": result = a % b;break;
			default : result = 0;break;
				
				
				
			 }
			 System.out.println(a+op+b+"="+result);
			 break;
	case "2" : System.out.println("키를 입력하세요");
				double k = scanner.nextDouble();
			   System.out.println("몸무게를 입력하세요");
			   double m = scanner.nextDouble();
			   String resul = "";
			   double bmi = m / (k * k) * 10000;
			   if(bmi > 40.0) {
				   resul = "고도비만";
			   }else if(bmi > 35.0) {
				   resul = "중등도 비만";
			   }else if(bmi > 30.0) {
				   resul = "경도비만";
			   }else if(bmi > 25.0) {
				   resul = "과체중";
			   }else if(bmi > 18.5) {
				   resul = "정상";
			   }else {
				   resul = "잘못입력하셨습니다";
			   }
			   System.out.println(bmi+resul);
			   
	case "3" : 
		System.out.println("숫자를 입력하세요");
		int a7 = scanner.nextInt();
		int sum = 0;
		String result7 ="" ;
		for(int i = 0;i <= a7;i++) {
			if(i < a7) {
				result7 += i+"+"; 
			}else {
				result7 += i+"=";
			}
			sum += i;
				
		}
			System.out.println(result7+sum);
				
		break;
	case "4" : System.out.println("주민번호를 입력하세요");
				String num = scanner.next();
				char ssn = num.charAt(7);
				String gender = "";
				
				switch(ssn) {
				case '1' : gender = "남";break;
				case '2' : gender = "여";break;
				case '3' : gender = "남";break;
				case '4' : gender = "여";break;
				case '5' : gender = "외국인";break;
				case '6' : gender = "외국인";break;
				default : gender = "잘못 입력하셨습니다";break;
				}
				System.out.println(gender);
				break;
				
	case "5" : System.out.println("이름과 점수를 입력하세요");
			  String b1 = scanner.next();
			  int	n1 = scanner.nextInt();
			  String b2 = scanner.next();
			  int	n2 = scanner.nextInt();
			  String b3 = scanner.next();
			  int	n3 = scanner.nextInt();
			   
			  String one = "";
			  String two = "";
			  String three = "";
			  
			  if(n1 > n2 && n2 > n3) {
				   one = b1;
				   two = b2;
				   three = b3;
			}else if(n1 > n3 && n3 > n2){
				one =b1;
				two =b3;
				three =b2;
			}else if(n2 > n1 && n1 > n3) {
				one = b2;
				two = b1;
				three =b3;
			}else if(n3 > n1 && n1 > n2) {
				one = b3;
				two = b1;
				three =b3;
			}else if(n3 > n2 && n2 > n1) {
				one = b3;
				two = b2;
				three =b1;
			}else{
				one = b2;
				two = b3;
				three =b1;
			}
			  System.out.println("1등"+one+"2등"+two+"3등"+three);
			   break;
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}
	
}
}
