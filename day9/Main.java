package day9;

import java.util.Scanner;
import day9.*;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Calc a = new Calc();
	ForDemo b = new ForDemo();
	Gugudan c = new Gugudan();
	LottoNumberGen d= new LottoNumberGen();
	NameArray2 e= new NameArray2();
	NameArray3 f = new NameArray3();
	NameScoreArray g = new NameScoreArray();
	NameScoreArray1 h = new NameScoreArray1();
	OddSum i= new OddSum();
	ScoreArray k = new ScoreArray();
	Bmi l = new Bmi();
	
	
	while(true) {
		System.out.println("[메뉴]\n"
				+ "0.정지\n"
				+ "1.BMI\n"
				+ "2.계산기\n"
				+ "3.ForDemo\n"
				+ "4.Gugudan\n"
				+ "5.LottoNumberGen\n"
				+ "6.NameArray2\n"
				+ "7.NameArray3\n"
				+ "8.NameScoreArray\n"
				+ "9.NameScoreArray1\n"
				+ "10.OddSum\n"
				+ "11.ScoreArray");
		String select = scanner.next();
		switch(select) {
		case "0" :System.out.println("정지");return;
		case "1" :l.menu1();break;
		case "2" :a.menu2();break;
		case "3" :b.menu3();break;
		case "4" :c.menu4();break;
		case "5" :d.menu5();break;
		case "6" :e.menu6();break;
		case "7" :f.menu7();break;
		case "8" :g.menu8();break;
		case "9" :h.menu9();break;
		case "10" :i.menu10();break;
		case "11" :k.menu11();break;
		}
	}
	}
}
