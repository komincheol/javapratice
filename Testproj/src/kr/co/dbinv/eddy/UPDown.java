package kr.co.dbinv.eddy;
import java.util.*;

public class UPDown {
	int randNum;
    int inputNum;
    int count = 0;
    float avg = 0;
    int i = 0;
    int sum = 0;
    String up = "��!";
    String down = "�ٿ�!";

    private void execute() {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        randNum = rnd.nextInt(100) + 1;
        
        
        while(i<3) {
        count++;
        p("1~100������ ���ڸ� �Է��ϼ��� : ");
        
        inputNum = scan.nextInt();
        if(inputNum == 0) {
            p("�����մϴ�.\n");
            break;
        }
        else if(inputNum > 100) {
            p(inputNum + " <-- �Է��Ͻ� �� \n");
            p("   " + count + "��°�Դϴ�.\n");
            p("1~100 �� �Է����ּ���. \n");
        }
        else if(inputNum < randNum) {
            p(inputNum + " <-- �Է��Ͻ� �� \n");
            p(up);
            p("   " + count + "��°�Դϴ�.");
            p("\n\n");
        }
        else if(inputNum > randNum) {
            p(inputNum + " <-- �Է��Ͻ� �� \n");
            p(down);
            p("   " + count + "��°�Դϴ�.");
            p("\n\n");
        }
        else if(inputNum == randNum) {
            p("����!! ����!!\n" + count + "�� ���� ���߼̾��.!\n");
            i++;
            sum = sum + count;
            count = 0;
            randNum = rnd.nextInt(100) + 1;
        }
        }
        avg = (float)sum / 3;
        p("�� �� : " + avg + "�� ���� ���߽ó׿�.\n");
    }

    private void p(Object o) {
        System.out.print(o);
    }


    public static void main(String[] args) {
        new UPDown().execute();
    }

}

