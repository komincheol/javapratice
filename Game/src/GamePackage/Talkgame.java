package GamePackage;

import java.util.*;

public class Talkgame {
	public static void main(String[] args) {
		System.out.println("���ӿ� �����ϴ� �ο��� �� �� �Դϱ�?\n");

		Scanner sc = new Scanner(System.in);

		int pNum = sc.nextInt();

		int i = 0;

		boolean game = true;

		String starWord = "�ƹ���";

		String uName, inputWord;

		Player[] p;

		p = new Player[pNum];

		for (int n = 0; n < pNum; n++) {

			System.out.println("�̸��� �Է��ϼ���.\n");

			sc = new Scanner(System.in);

			uName = sc.next();

			p[n] = new Player(uName);

		}

		for (int m = 0; m < pNum; m++) {

			System.out.println("���� ������ " + m + " " + p[m].name);

		}

		System.out.println("�����ϴ� �ܾ��" + starWord + "�Դϴ�.");

		// game�� '��'�� ��� ���� �������

		while (game) {

			if (i > pNum || i == pNum) {

				i = 0;

			}

			System.out.print(p[i].name + " >> ");

			inputWord = p[i].sayWord();

			game = p[i].succeed(starWord);

			starWord = inputWord;

			i++;

		}

		System.out.println(p[i - 1].name + "���� �й��Ͽ����ϴ�.");




	}

	
}
