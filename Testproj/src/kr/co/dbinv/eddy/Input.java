package kr.co.dbinv.eddy;

import java.util.Scanner;

public class Input {

	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("exit�� �Է��ϸ� �����մϴ�.");
	        while (true) {
	            System.out.println(">>");
	            String text = scanner.nextLine();
	            if (text.equals("exit"))
	                break;
	        }
	        System.out.println("�����մϴ�");

	        scanner.close();
	    }

		
}
