package day7;

import java.util.Scanner;

public class Yun {
     public void menu3(){
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("연도를 입력하세요");
    	 int a = scanner.nextInt();
    	 String result = scanner.next();
    	 if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
    		 result = "윤년";
    	 }else {
    		 result = "평년";
    	 }
    	 System.out.println(result);
    	 
     }
}
