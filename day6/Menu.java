package day6;
import java.util.Scanner;
import java.util.Random;
public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[메뉴] 0.종료 1.시작");
		int select = scanner.nextInt();
		boolean flag = true;		
				while(flag) {
					if (select == 1) {
						System.out.println("진행");
						flag = true;
					}else {
						System.out.println("스톱");
						flag = false;
						
					}
				}

	}

}
