package by.alesnax.htp3.jd01.lesson05.Task03;

import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		int[] ar = createAr();
		print(ar);
		// selectSort(ar);
		// bubbleSort(ar);
		//insertSort(ar);	// самый непонятный
		qSort(ar, 0, ar.length-1);
		
		print(ar);

	}

	public static void qSort(int[] array,int l, int r) {
        int i = l;
        int j = r;
        Random rand = new Random();
        int x = array[l + rand.nextInt(r - l + 1)];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (l<j){
            qSort(array, l, j);
        }
        if(i<r){
            qSort(array, i, r);
        }
    }
	
	public static void insertSort(int[] ar) {
		int j;
		for (int i = 0; i < ar.length; i++) { // цикл проходов, i - номер
												// прохода
			int temp = ar[i];
			for (j = i - 1; j >= 0 && ar[j] > temp; j--) {// поиск места
															// элемента в
															// готовой
															// последовательности
				ar[j + 1] = ar[j]; // сдвигаем элемент направо, пока не дошли
			}
			ar[j + 1] = temp;// место найдено, вставить элемент
		}
	}

	public static void bubbleSort(int[] ar) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = ar.length - 1; j > i; j--) {
				if (ar[j - 1] > ar[j]) {
					temp = ar[j - 1];
					ar[j - 1] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}

	public static void selectSort(int[] ar) {
		int temp; // temp value
		int num; // temp number

		for (int i = 0; i < ar.length; i++) {
			num = i;
			temp = ar[i];
			for (int j = i + 1; j < ar.length; j++) {// цикл выбора наименьшего
														// элемента
				if (ar[j] < temp) {
					num = j; // num - индекс наименьшего элемента
					temp = ar[j];
				}
			}
			ar[num] = ar[i];
			ar[i] = temp; // меняем наименьший эл-т с a[i]
		}
	}

	public static int[] createAr() {
		int[] ar = new int[150000];
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}
		return ar;
	}

	public static void print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "; ");
		}
		System.out.println();
	}

}
