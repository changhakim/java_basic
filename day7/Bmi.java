package day7;

import java.util.Scanner;

public class Bmi {
	public void menu2() {
		Scanner scanner = new Scanner(System.in);
		
		double t = scanner.nextDouble();
		double w = scanner.nextDouble();
		double bmi = w / (t * t) * 10000;
		String res = "";
		if(bmi > 40) {
			res = "고도비만";
		}else if(bmi > 35.0) {
			res = "중등도비만";
		}else if(bmi > 30.0) {
			res = "경도비만";
		}else if(bmi > 25.0) {
			res = "과체중";
		}else if(bmi > 18.5) {
			res = "정상";
		}else {
			res = "저체중";
		}
		
		System.out.println(bmi+res);
	
	}

}
