package day6;
import java.util.Scanner;
public class Dasi {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자를입력하세요");
	int b = scanner.nextInt();
	String a ="";
	
	int sum = 0;
	
	
	for(int i=0;i<=b;i++) {
		if(i < b) {
			a += i + "+";
		}else {
			a += i + "=";
		}
		sum += i; 
		
	}
	System.out.println(a+sum);
	
	
}
}
