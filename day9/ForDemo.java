package day9;

import java.util.Scanner;

public class ForDemo {
	public void menu3() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b = "";
		int sum = 0;
		for(int i = 0;i<=a;i++) {
	
			if(i < a) {
			b += i + "+";
			}else {
			b += i + "=";
		
			}
			sum += i;
	}
		System.out.println(b+sum);
	}		
	
}
