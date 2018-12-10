package day9;

public class NameArray2 {
	public void menu6() {
		String[] name = {"홍길동","유관순","이순신"};
		
		String a = "";
		for(int i = 0; i < 3;i++) {
			a +=name[i]+",";
		}
		System.out.println(a);
	}



}