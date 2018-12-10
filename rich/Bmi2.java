package rich;

import java.util.Scanner;

public class Bmi2 {
public void menu2() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("키와 몸무게를 입력하세요");
	double t = scanner.nextDouble();
	double w = scanner.nextDouble();
	double bmi = w / (t * t) * 10000;
	
	
	String result = "";
	
	if(bmi>40.0) {
		result = "고도비만";
	}else if(bmi>35.0) {
		result = "중등도 비만";
	}else if(bmi>30.0) {
		result = "경도 비만";
	}else if(bmi>25.0) {
		result = "과체중";
	}else if(bmi>18.5) {
		result = "정상";
	}else {
		result = "저체중";
	}
	System.out.println(bmi+"="+result);
}
}
