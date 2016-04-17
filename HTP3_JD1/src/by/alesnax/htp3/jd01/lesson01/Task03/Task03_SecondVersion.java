package by.alesnax.htp3.jd01.lesson01.Task03
;

import java.util.Scanner;

/*
 * Task_1.3
 * Найти произведение цифр заданного четырехзначного числа
 */

public class Task03_SecondVersion {

	public static void main(String[] args) {
		int x = enterNum();
		int res = findMult(x);
		print(res);
	}
	
	public static int findMult(int num){
		String str = num + "";
		char[] ch = str.toCharArray();
		int res = 1;
		for(int i = 0; i < ch.length; i++){
			res = res * Integer.parseInt(ch[i] + "");
		}
		return res;
	}
	
	public static int enterNum() {
		System.out.print("Введите положительное четырехзначное число: ");
		int num;
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				if ((num / 1000) >= 1 && (num / 1000) < 10)
					break;
				else {
					System.out.println("Число не входит в заданный диапозон!");
				}
			} else {
				System.out.println("Введено некорректное значение, повторите ввод!");
			}
		}
		return num;
	}

	public static void print(int res) {
		System.out.println("Произведение цифр заданного числа: " + res);
	}
}
