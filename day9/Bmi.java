package day9;

import java.util.Scanner;

public class Bmi {
public void menu1(){
	Scanner scanner = new Scanner(System.in);
	double t = scanner.nextDouble();
	double w = scanner.nextDouble();
	double bmi = w / (t * t) * 10000;
	String res = "";
	if(bmi>40) {
		 res = "초고도비만";
	}else if(bmi>35) {
		 res ="중등도비만";
	}else if(bmi>30) {
		 res ="경도비만";
	}else if(bmi>25) {
		 res ="과체중";
	}else if(bmi>18) {
		 res ="정상";
	}else{
	res  ="저체중";
	}
	
	System.out.println(bmi+res);
		
	
}
}
