package kr.co.dbinv.eddy;

import java.util.Scanner;

public class MathTest {
	public static void main(String[] args) {
		int a= 0;
		
		while(true){
			
		Scanner input=new Scanner(System.in);
		System.out.println("���������� �Է��Ͻÿ�:");
		
		a=input.nextInt();
		if (a>100){
			System.out.println("�ٽ��Է��ϼ���");
		}
		else{
			break;
		}
			
		}
		if(a>=90 && a==100){
			System.out.println("A");
		}
		else if(a>=80 && a<=89){
			System.out.println("B");
		}
		else if(a>=70 && a<=79){
			System.out.println("C");
		}
		else if(a>=60 && a<=69){
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
		
	}

}
