package day6;
import java.util.Scanner;
import java.util.Random;
public class Yuns {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("[메뉴]\n 0.종료\n "
					+ "1.계산기\n"
					+ "2.Bmi\n"
					+ "3.윤년계산\n"
					+ "4.주민번호\n"
					+ "5.등수구하기");
					
			String select = scanner.next();
			switch(select) {
			case "0" :
				System.out.println("종료");
				return;
			case "1" :System.out.println("숫자를입력하세요");
			          
			          int a = scanner.nextInt();
			          String op = scanner.next();
			          int b = scanner.nextInt();
			          int result = 0;
			          switch (op) {
			          case "+": result = a + b;
				
			          break;
			          case "-": result = a - b;
			          break;
			          case "*": result = a * b;
			          break;
			          case "/": result = a / b;
			          break;
			          case "%": result = a % b;
			          break;
			          default: result = 0;
			          break;
			          }
			case "2" : System.out.println("몸무게");
					double m = scanner.nextDouble();
					System.out.println("키");
					double k = scanner.nextDouble();
					double bmi = m  / (k * k) * 10000;
					String na = "";
					
					if(bmi >= 40.0 ) {
						na = "고도비만";
					}else if(bmi >= 35.0){
						na = "중등도비만";
					}else if(bmi >= 30.0) {
						na = "경도비만";
					}else if(bmi >= 25.0) {
						na = "과체중";
					}else if(bmi >= 18.5) {
						na = "정상";
					}else {
						na = "저체중";
					}
					System.out.println(bmi
							+ na);
					
			case "3": System.out.println("년도를 입력하세요");
						int year = scanner.nextInt();
						String hu = "";
						if(year % 4 == 0 && year % 100 != 0 || year % 100 ==0) {
							hu = "윤년";
						}else {
							hu = "평년";
						}
					System.out.println(year+":"+hu);
					break;
			
			case "4" : System.out.println("주민번호를 입력하세요");
						String num = scanner.next();
						char num1 = num.charAt(7);
						String gender = "";
						switch(num1) {
						case '1': gender = "남";break;
						case '2': gender = "여";break;
						case '3': gender = "남";break;
						case '4': gender = "여";break;
						case '5': gender = "외국인";break;
						case '6': gender = "외국인";break;
						default : gender ="다시입력해주세요";break; 
						}
						System.out.println(gender);
						break;
			
						
			case "5" : System.out.println("학생이름과 점수를 입력해주세요");
						String na1 = scanner.next();
						int n1 = scanner.nextInt();
						String na2 = scanner.next();
						int n2 = scanner.nextInt();
						String na3 = scanner.next();
						int n3 = scanner.nextInt();
						String one = "";
						String two = "";
						String three = "";
			  			
						if(n1 > n2 && n2 > n3 ) {
						  	one = na1;
						  	two = na2;
						  	three = na3;
						}else if(n2 > n1 && n1 > n3){
							one = na2;
							two = na1;
							three = na3;
						}else if(n3 > n1 && n1 > n2){
							one = na3;
							two = na1;
							three = na2;
						}else if(n1 > n3 && n3 > n2){
							one = na1;
							two = na3;
							three = na2;
						}else if(n2 > n3 && n3 > n1 ) {
							one = na2;
							two = na3;
							three = na1;
						}else {
							one = na3;
							two = na2;
							three = na1;
						}
						System.out.println("1등"+one+"2등"+two+"3등"+three);
						
						
						break;
			
			
			
			
			
			
			
			
			
			
			
			
			
	}		
					
					
					
					
	}


	
}
}
