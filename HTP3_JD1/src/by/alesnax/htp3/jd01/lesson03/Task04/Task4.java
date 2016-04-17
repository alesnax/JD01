package by.alesnax.htp3.jd01.lesson03.Task04;

import java.util.Scanner;

/*
 * Task_3.4
 * Задан массив, содержащий несколько нулевых элементов.
 * Сжать его выбросив эти элементы.
 */
public class Task4 {

	public static void main(String[] args) {
		int numElem = enterNum();
		int[] arr = createRandomArray(numElem);
		print(arr);
		int[] nullFreeArr = createNullElemFreeArray(arr);
		print(nullFreeArr);		
	}
	
	public static void print(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
	}
	
	public static int[] createNullElemFreeArray(int[] arr){
		int count = 0;
		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] == 0){
				for(int j = i; j < arr.length-1-count; j++){
					arr[j]= arr[j+1];
				}
				count++;
			}
		}
		int[] nullFreeAr = new int[arr.length - count];
		for(int i = 0; i < nullFreeAr.length; i++){
			nullFreeAr[i] = arr[i];
		}
		return nullFreeAr;
	}

	
	public static int[] createRandomArray(int numElem){
		int[] arr = new int[numElem];
		for (int i = 0; i < numElem; i++) { 
			arr[i] = (int) (Math.random() * 3);
		}
		return arr;
	}

	public static int enterNum() {
		int num = 0;
		while (true) {
			System.out.print("Enter number of elements: ");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				if (num > 0) {
					break;
				} else {
					System.out.println("Negative value or 0, please try again!");
				}
			} else {
				System.out.println("Incorrect input, try again!");
			}
		}
		return num;
	}
}
