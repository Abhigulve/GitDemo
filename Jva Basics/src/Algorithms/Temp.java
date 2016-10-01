package Algorithms;

public class Temp {
	public static void main(String[] args) {

		int Alice_score = 0, Bob_score = 0;
		int a0 = 5;
		int a1 = 6;
		int a2 = 7;
		int b0 = 3;
		int b1 = 6;
		int b2 = 10;

		if (a0 > b0) {
			Alice_score++;
		} 
		else
			Bob_score++;

		if (a1 > b1)
			Alice_score++;
		else if (a0 == b0) {
		} else
			Bob_score++;

		if (a1 > b1)
			Alice_score++;
		else if (a0 == b0) {
		} else
			Bob_score++;
		System.out.print(Alice_score + " " + Bob_score);

	}
}
