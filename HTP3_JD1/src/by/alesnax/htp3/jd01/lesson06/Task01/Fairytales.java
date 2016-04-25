package by.alesnax.htp3.jd01.lesson06.Task01;

/*
 * 1. Написать программу, позволяющую обрабатывать информацию о 50 сказках Шахерезады.
 * 2. Реализовать возможность просмотра информации обо всех сказках
 * 		о выборе самой интересной сказки
 * 		выбора сказок суммарный печатный объем печатных знаков которых не превысит заданный.
 * В качестве хранилища информации о сказках можно использовать массив или коллекцию
 */

public class Fairytales {

	public static void main(String[] args) {
		Fairytale[] f = createNewTales(); // create new 50 tales with
											// autofilling
		// showAllInfo(f); //show info about all the tales
		//showMostInterest(f); // show tales with highest rate
		showSpecifiedTale(f, 30); // show tales which printed-sign value is less
									// then specified

	}

	public static Fairytale[] createNewTales() {
		Fairytale[] f = new Fairytale[50];
		Fairytale.generate(f);
		return f;
	}

	public static void showAllInfo(Fairytale[] f) {
		Fairytale.printAll(f);
	}

	public static void showMostInterest(Fairytale[] f) {
		int maxRate = 0;
		Fairytale[] intTale = new Fairytale[50];
		int num = 0;
		for (int i = 0; i < f.length; i++) {
			if (maxRate < f[i].getRate()) {
				maxRate = f[i].getRate();
				num = 0;
				intTale[num] = f[i];
				num++;
			} else if (maxRate == f[i].getRate()) {
				intTale[num] = f[i];
				num++;
			}
		}
		for (int j = num; j < intTale.length; j++) {
			intTale[j] = null;
		}
		for (int i = 0; i < intTale.length; i++) {
			if (intTale[i] != null) {
				intTale[i].print();
			}
		}
	}

	public static void showSpecifiedTale(Fairytale[] f, int len) {
		for (Fairytale fair : f) {
			if (fair.getText().length() < len) {
				fair.print();
			}

		}
	}
}
