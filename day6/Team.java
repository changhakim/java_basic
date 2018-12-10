package day6;
import java.util.Scanner;
public class Team {
     public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
     
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0.종료\n"
					+ "1.오칙연산\n"
					+ "2.Bmi\n"
					+ "3.윤년계산기\n"
					+ "4.성별판별기\n"
					+ "5.등수구하기");
			String se = scanner.next();
			
			switch(se) {
			case "0" : System.out.println("종료");
				return;
			case "1" :	System.out.println("오칙연산");
			
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			int result =0;
			
			switch (op) {
			case "+" : result = a + b;break;
			case "-" : result = a - b;break;
			case "*" : result = a * b;break;
			case "/" : result = a / b;break;
			case "%" : result = a % b;break;
			
		
					}
		System.out.println(a+op+b+"="+result);	
			break;
			
		case "2" : System.out.println("평균 점수 구하기");
		System.out.println("이름과 점수를 입력하세요");
		
		int[] score = new int[2];
		
		for(int i = 0; i < score.length; i++) {
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					break;
			case "2" : System.out.println("신장과 체중을 입력");
				double h = scanner.nextDouble();
				double w = scanner.nextDouble();
				double bmi = w / ( h * h ) * 10000;
				String res = "";
				
				if(bmi >= 40) {
					res = "고도 비만";
				}else if(bmi >= 35) {
					res = "중등도 비만";
				}else if(bmi >= 30) {
					res = "경도 비만";
				}else if(bmi >= 25) {
					res = "과체중";
				}else if(bmi >=20) {
					res = "정상";
				}else {
					res = "저체중";
				}
			System.out.println( bmi + " : " + res );
			
			break;
			
			case "3" : System.out.print("윤년계산기");
						int year = scanner.nextInt();
						String result3 = "";
						
						if(year%4==0 && year%400==0 || year%100!=0) {
							result3 = "윤년";
						}else {
							result3 = "평년";
						}
						System.out.println(result3);
					break;
					
			case "4" : System.out.println("이름과 주민번호 입력");			
						String name = scanner.next();
						String ssm = scanner.next();
								
						char s1 = ssm.charAt(7);
						String result4 = "";
						
						switch (s1) {
						case '1': result4 = "남자"; break;
						case '2': result4 = "여자"; break;
						case '3': result4 = "남자"; break;
						case '4': result4 = "여자"; break;
						case '5': result4 = "외국인"; break;
						case '6': result4 = "외국인"; break;
						
						default: result4 = "다시입력";
							break;
						}
						System.out.println(result4);
								break;
			
			
			
			case "5" : System.out.println("이름과 점수를 입력하세요");
						String n1 = scanner.next();
						int d1 = scanner.nextInt();
						String n2 = scanner.next();
						int d2 = scanner.nextInt();
						String n3 = scanner.next();
						int d3 = scanner.nextInt();
						
						String one = "";
						String two = "";
						String three = "";
						
						if(d1>d2 && d2>d3) {
									one = n1;
									two = n2;
									three = n3;
						}else if(d1>d3 && d3>d2){
									one = n1;
									two = n3;
									three = n2;
						}else if(d2>d1 && d1>d3){
									one = n2;
								    two = n1;
									three = n3;
						}else if(d3>d1 && d1>d2){
									one = n3;
								    two = n1;
									three = n2;
						}else if(d2>d3 && d3>d1){
									one = n2;
								    two = n3;
									three = n1;
						}else {
									one = n3;
									two = n2;
									three = n1;
						}
						System.out.println("1등"+one +"2등"+two + "3등"+three);
						break;
			
			
			
			
			
			}

			
		}
     
     
     
     
    }
}
