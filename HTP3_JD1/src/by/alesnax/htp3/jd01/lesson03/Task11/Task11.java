package by.alesnax.htp3.jd01.lesson03.Task11;

import java.util.Scanner;

/*
 * Сформировать квадратную матрицу порядка n (n - четное) по заданному образцу
 */

public class Task11 {

	public static void main(String[] args) {
		int n = enterNum();
		int[][] matr = new int[n][n];
		form(matr);
		print(matr);

	}

	public static int enterNum() {
		int num;
		while (true) {
			System.out.print("Введите число n: ");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				if(num > 1){
					if(num % 2 == 0)
						break;
					else System.out.print("нечетное число, не подходит по условию!  ");
				}else{
					System.out.print("Число отрицательное или меньше 2, повторите ввод!  ");
				}
			}else{
				System.out.print("Некорректное значение, повторите ввод!  ");
			}
		}
		return num;
	}
	
	public static void form(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			if(i % 2 == 0){
				for(int j = 0; j < mat[i].length; j++){
					mat[i][j] = j+1;
				}
			}else{
				for(int j = 0; j < mat[i].length; j++){
					mat[i][j] = mat[j].length - j;
				}
			}
		}
		
		
	}
	
	public static void print(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				System.out.printf("%3d", mat[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
