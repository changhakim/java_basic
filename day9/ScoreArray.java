package day9;

import java.util.Scanner;

public class ScoreArray {
	public void menu11() {
	Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int[] sc = new int[3];
		for(int i=0;i<sc.length;i++ ) {
			sc[i] = scanner.nextInt();
		}
		
		String res ="";
		
			for(int i= 0;i<sc.length;i++) {
				if(i<sc.length-1) {
				res +=sc[i]+",";
				}else {
				res +=sc[i]+"";
				}
			}
		System.out.println(res);
		
	
	}
		
		
		
			
		
}

