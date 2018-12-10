package day9;

import java.util.Scanner;

public class NameArray {
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[3];
		int[] score = new int[3];
		int[] rank = new int[3];
		String r = "";
				
		for(int i=0;i<score.length;i++) {
			rank[i] = 1;
		}
		System.out.println("이름과 점수를 입력하세요");
		for(int i=0;i<score.length;i++) {
			name[i] = scanner.next();
			score[i] = scanner.nextInt();
			
		}
		for(int i =0;i<score.length;i++) {
			for(int j = 0; j<score.length;j++) {
				if(i<j){
				rank[i] = rank[i]+1;
				}
			}
			System.out.println(name[i]+score[i]+"점"+rank[i]+"등");
		}
		
	}

	public static void main(String[] args) {
	NameArray d = new NameArray();
	d.test1();
	}
}