package day9;

import java.util.Scanner;

public class NameScoreArray {
	public void menu8() {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		String b = ""; 
		System.out.println("점수3입력");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
				b +=  arr[i] + ",";
			}else {
				b += arr[i] + "";
			}
}

		System.out.println(b);
}
	


}

