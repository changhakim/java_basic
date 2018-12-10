package day1;

import java.util.Scanner;

public class WhatName {
public static void main(String[] args) {
	System.out.println("이름,나이,주소,소개");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.next();
	String age = scanner.next();
	String addr = scanner.next();
	System.out.println("이름은"+name+"나이는"+age+"주소는"+addr+"입니다");
}
}
