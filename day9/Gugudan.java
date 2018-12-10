package day9;

import java.util.Scanner;

public class Gugudan {
// 출력할 단..예를 들어 3을 입력하면
	//3단 출력 3*2 = 6.....3*9=27
	public void menu4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = scanner.nextInt();
		int[] b = new int[10];
		String dd = "";
		int odd = 0;
		for(int i = 1; i<b.length;i++ ) {
			b[i] = a * i;
			if(i<b.length-1) {
			dd += a +"*"+ i+"="+b[i]+",";
			}else {
			dd += a +"*"+ i+"="+b[i]+"";
			}
		}
		System.out.println(dd);
		
	}
	
}

