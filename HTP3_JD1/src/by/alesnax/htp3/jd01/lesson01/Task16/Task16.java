package by.alesnax.htp3.jd01.lesson01.Task16;
import java.util.Scanner;

/*
 * Task_1.16
 * Квадрат заданного трехзначного числа 
 * равен кубу суммы цифр этого числа
 */

public class Task16 {
	public static void main(String[] args) {
		int a = enterNum();
		compare(a);
		boolean b = compare(a);
		print(a, b);
	}

		public static int enterNum() {
			int num;
			  System.out.print("Enter 3-digit number: ");
			while (true) {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				if (scanner.hasNextInt()) {
					num = scanner.nextInt();
					if(num > 99 && num < 1000)
					break;
					System.out.println("Number is from wrong interval!");
				} else {
					System.out.println("Incorrect input, please try again!");
				}
			}
			return num;
		}
		
	public static boolean compare(int a){
		boolean b = false;
		int left = a * a;
		int right = (int) Math.pow((a/100 + a%100/10+a%10),3);
		if(left == right){
			b = true;
		}
		return b;
	}
	
	public static void print(int a, boolean b){
		if(b == true){
			System.out.println("Квадрат числа  " + a + " равен кубу суммы цифр этого числа");
		}
		else
			System.out.println("Квадрат числа  " + a + " НЕ равен кубу суммы цифр этого числа");
	}
}
