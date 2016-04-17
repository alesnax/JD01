package by.alesnax.htp3.jd01.lesson01.Task11;

/*
 * Task_1.11
 * Даны две точки A(x1, y1) и B(x2, y2).
 * Составить алгоритм, определяющий, 
 * которая из точек находится ближе к началу координат.
 */

public class Main {
	public static void main(String[] args) {
		Point a = new Point();
		Point b = new Point();
		compareDist(a, b);
	}

	public static void compareDist(Point a, Point b) {
		if ((a.x * a.x + a.y * a.y) > (b.x * b.x + b.y * b.y)) {
			System.out.println("Point B is closer to origin than point A");
		} else if ((a.x * a.x + a.y * a.y) == (b.x * b.x + b.y * b.y)) {
			System.out.println("Point B and point A is the same distance from origin ");
		} else
			System.out.println("Point B is farther to origin than point A");
	}

}
