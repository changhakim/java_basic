package day8;

import java.util.Scanner;

public class Haha {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String[] name = new String[3];
	int[] score = new int[3];
	int[] rank = new int[3];
	
	for(int i = 0; i<3;i++) {
		rank[i] = 1; 
	}
	System.out.println("이름과 등수를 입력하세요");
	for(int i=0;i<3;i++) {
		name[i] = scanner.next();
		score[i] = scanner.nextInt();
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(score[i]<score[j]) {
			rank[i]=rank[i]+1;
		
			}
		
			
		
	}
		System.out.println(name[i]+rank[i]);
}
}
}