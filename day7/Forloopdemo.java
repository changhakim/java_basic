package day7;
import java.util.Scanner;
public class Forloopdemo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	int a = scanner.nextInt();
	int sum = 0;
	String result ="" ;
	for(int i = 0;i <= a;i++) {
		if(i < a) {
			result += i+"+"; 
		}else {
			result += i+"=";
		}
		sum += i;
			
	}
		System.out.println(result+sum);

}
}
