package kr.co.dbinv.eddy;
import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, area;
		final double PI = 3.141592;

		Scanner input = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ� : ");
		radius = input.nextDouble();

		area = PI * radius * radius;
		System.out.println("���� ���� : " + area);
	}

}
