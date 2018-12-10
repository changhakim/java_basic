package day9;

import java.util.Scanner;

public class NameArray3 {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		String res = "";
		System.out.println("숫자를 입력하세요");
		for(int i=0 ; i<3;i++) {
		num[i] = scanner.nextInt();
			if(i<2) {
			res += num[i]+",";
			}else {
			res += num[i]+"";
			}
		}
		System.out.println(res);
	}


public static void main(String[] args) {
	NameArray3 a = new NameArray3();
	a.test();
}
}