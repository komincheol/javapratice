package GamePackage;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;//��ǻ�Ͱ� ����
		int scanValue = 0;
		Random random = new Random();
		num = random.nextInt(3);

		System.out.println("Random!" + num);

		System.out.println("�Է�:");

		String scanString = scan.nextLine();

		if (scanString.equals("����")) {
			scanValue = 0;
		} else if (scanString.equals("����")) {
			scanValue = 1;
		} else if (scanString.equals("��")) {
			scanValue = 2;
		}
		if (num == 0) {
			System.out.println("������ ����");

		} else if (num == 1) {
			System.out.println("������ ����");

		} else if (num == 2) {
			System.out.println("������ ��");
		}

		switch (scanValue) {

		case 0:
			if (num == 0) {
				System.out.println("�����ϴ�.");
			} else if (num == 1) {
				System.out.println("�����ϴ�.");
			} else if (num == 2) {
				System.out.println("�̰���ϴ�.");
			}
			break;
		case 1:
			if (num == 0) {
				System.out.println("�̰���ϴ�.");
			} else if (num == 1) {
				System.out.println("�����ϴ�.");
			} else if (num == 2) {
				System.out.println("�����ϴ�.");
			}
			break;

		case 2:
			if (num ==0 ) {
				System.out.println("�����ϴ�.");
			} else if (num == 1) {
				System.out.println("�̰���ϴ�.");
			} else if (num == 2) {
				System.out.println("�����ϴ�.");
			}
			break;

		}
	}
}
