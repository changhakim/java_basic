package day9;

import java.util.Scanner;

public class OddSum {
//Odd 홀수의합
	//Even 짝수
	//1 부터 입력받은 숫자까지의 합인데 그중에서 홀수의 합
	public void menu10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = scanner.nextInt();
		int sum = 0;
		int[] b = new int[a];
		for(int i=0; i<b.length;i++) {
			if(i % 2 == 1 ) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
}
