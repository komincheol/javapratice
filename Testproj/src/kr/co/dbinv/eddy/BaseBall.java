package kr.co.dbinv.eddy;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {

		System.out.println("Start game");
		Scanner s = new Scanner(System.in);
		String nums = "";
		int strike = 0;
		int ball = 0;
		int count = 0;
		int n = 0;

		while (true) {
			System.out.print("�ڸ� ���� �Է� : ");
			n = s.nextInt();
			if (n > 5) {
				System.out.println("�ִ� �ڸ����� 5�ڸ� �Դϴ�.");
			} else if (n < 1) {
				System.out.println("�ּ� 1�ڸ� �Դϴ�.");
			} else {
				break;
			}
		}

		// create number

		int[] value = new int[n];
		for (int i = 0; i < n; i++) {
			int v = value();
			while (i == 0 && v == 0) {
				v = value();
			}
			int j = 0;
			while (true) {
				if (j > i) {
					break;
				} else if (value[j] != v) {
					j++;
				} else {
					v = value();
					j = 0;
				}
			}
			value[i] = v;
		}

//		for (int i : value) {
//			System.out.print(i);
//		}
//		System.out.println();

		// execute game

		System.out.println("������ ��������...");
		
		while (true) {
			count++;
			strike = 0;
			ball = 0;
			System.out.println("���ڸ� �Է��ϼ���! : ");
			nums = s.next();

			if (nums.length() != n) {
				System.out.println("�� �� �� �����ϴ�.");
				continue;
			}

			String[] num = nums.split("");//string [] num���� ���� ���� �ɰ���.
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (value[i] == Integer.parseInt(num[j])) {//�ɰ����� ���� ���Ѵ�.
						if (i == j) {//�ɰ����� ��ġ�ϸ�
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike == n) {
				System.out.println(count + " �� ���� ���߾����ϴ�.");
				break;
			} else if (strike == 0 && ball == 0) {
				System.out.println("out!");
			} else {
				System.out.println(strike + " strike(s) & " + ball + " ball(s) //  count : " + count);
			}
		}
	}

	static int value() {
		int value = new Random().nextInt(10);
		return value;
	}
}
