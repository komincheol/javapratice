package kr.co.dbinv.eddy;

import java.util.Random;
import java.util.Scanner;

public class Upgame {
	

	public static void main(String[] args) {
		int randNum;
	    int inputNum;
	    int count = 0;
	    float avg = 0;
	    int sum = 0;
	    String up = "UP!";
	    String down = "DOWN!";
	    Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        randNum = rnd.nextInt(100) + 1;
       
        while(true) {
            count++;
            System.out.println("1~100������ ���ڸ� �Է��ϼ���.: ");
            
            inputNum = scan.nextInt();
            if(inputNum == 0) {
                System.out.println("�����մϴ�.\n");
                break;
            }
            else if(inputNum > 100) {
                System.out.println(inputNum + " <-- �Է��Ͻ� �� ");
                System.out.println("   " + count + "��°�Դϴ�.");
                System.out.println("1~100 �� �Է����ּ���.");
            }
            else if(inputNum < randNum) {
                System.out.println(inputNum +"! "+up+" "+ count + "��°�Դϴ�.");
               
                
            }
            else if(inputNum > randNum) {      
                System.out.println(inputNum+"! "+down+" " + count + "��°�Դϴ�.");
                
             
            }
            else if(inputNum == randNum) {
                System.out.println("����!" + count + "�� ���� ���߼̾��.");
                sum = sum + count;
                count = 0;
                randNum = rnd.nextInt(100) + 1;
                break;
            }
        }
	}
	
}
            
            
        



