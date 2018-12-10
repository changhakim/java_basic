package day9;

import java.util.Random;

public class LottoNumberGen {
	public void menu5() {
	Random random = new Random();
	int[] lotto = new int[6];
	String e = "";
	for(int i =0 ;i<lotto.length;i++) {
		if(i != 5) {
		lotto[i] = random.nextInt(45);
		e += lotto[i]+",";
		}else {
		e += lotto[i]+"";	
		}
	}
	System.out.println(e);
	}
		
}
