package com.ameya.hackerrank;

import java.util.Scanner;

public class BowlingGame {

	public static void main(String[] args) {

		BowlingGame b = new BowlingGame();
		int score = 0, t1 = 0, t2 = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; ++i) {
			System.out.println("Enter score for t1");
			t1 = sc.nextInt();
			if (t1 < 10) {
				score = score + t1;
				System.out.println("Enter score for t2");
				t2 = sc.nextInt();
				if (t2 > 10) {
					System.out.println("Enter valid value of t2");
					t2 = sc.nextInt();
					score = score + t2;
				} else if (t2 < 10) {
					score = score + t2;
					score = score + t2;
				} else if (t2 == 10) {
					System.out.println("Strike");
					do {
						System.out.println("Enter score for t2");
						t2 = sc.nextInt();
						score = score + t2;
					} while (t2 < 10 || t2 > 10);
				}

			} else if (t1 > 10) {
				System.out.println("Enter valid value of t1");
				t1 = sc.nextInt();
				score = score + t1;
			} else if (t1 == 10) {
				System.out.println("Strike");
				score = score + t1;

			}

			System.out.println("Round" + i);
		}
		System.out.println("Score" + score);
	}

	/*
	 * public int scoreT1(Scanner sc, int score){
	 * System.out.println("Enter score for t1"); int t1 = sc.nextInt(); score =
	 * score + t1; return score; }
	 * 
	 * public int scoreT2(Scanner sc, int score){
	 * System.out.println("Enter score for t2"); int t2 = sc.nextInt(); score =
	 * score + t2; return t2; }
	 */
}
