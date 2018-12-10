package day7;

import java.awt.geom.GeneralPath;
import java.util.Scanner;

public class Gebbak {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		String res = "";
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(i<a.length-1) {
				res += a[i] +",";
			}else {
				res += a[i] + "";
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Gebbak d = new Gebbak();
		d.test();
	}
}
