package kr.co.dbinv.eddy;

	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;
	import java.util.concurrent.ThreadLocalRandom;

public class BaseballGame {

	public static int compNum = 0;
	public static int testn = 3;
	public static int u_arr[] = new int[testn];
	public static int c_arr[];
	public static int userNum;
	public static int s_num = 0;
	public static int b_num = 0;
	public static int o_num = testn;

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			userNum = 0; //����ڰ� �Է��� �ѹ�
			int cnt = 0;
			//���߾�� �� ����
			randomNumber();
			System.out.println(compNum);
			
			while(s_num!=testn){ //Ʋ���� ������ ��� �������
				System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
				userNum = sc.nextInt();
				cnt++;
				checkComUser(userNum);
			}
			
			System.out.println(cnt);
		}

	public static void randomNumber(){//http://itpangpang.xyz/50
			c_arr = new int[testn];
			Random r = new Random();
			//a[0] = r.nextInt(9)+1;
			for(int i=0; i<testn; i++){
				c_arr[i] = r.nextInt(10);
				for(int j=0; j<i; j++){//�ߺ����Ÿ� ���� for
					if(c_arr[i]==c_arr[j])
						i--;
				}
			}
			if(c_arr[0]==0){
				int sample = c_arr[2];
				c_arr[2] = 0;
				c_arr[0] = sample;
			}
			//int rnd = (int) (Math.random()*(900)+100);
			for(int k=0; k<testn; k++){
				compNum = compNum*10 + c_arr[k];
			}
			
		}

	public static void checkComUser(int u_Number){
			s_num=0;b_num=0;o_num=testn;
			u_arr[0] = u_Number/100;	//����� �Է��� 100���ڸ���
			u_arr[1] = (u_Number/10)%10;//����� �Է��� 10���ڸ���
			u_arr[2] = u_Number%10;		//����� �Է��� 1���ڸ���
			//strike ó��
			if(compNum == u_Number){
				s_num = testn;System.out.println(testn+"Strike");o_num--;
			}else{
				for(int n=0;n<testn; n++){
					if(u_arr[n]==c_arr[n]){
						s_num++; u_arr[n]=100;
						o_num--;
					}	
				}
				for(int n=0; n<testn; n++){
					for(int j=0; j<testn; j++)
						if(u_arr[n]!=100 && c_arr[n]==u_arr[j]){
							b_num++;o_num--;
						}
				}
				
			}
			if(o_num == testn){
				System.out.println(testn+"Out");
			}else if(s_num!=testn)
				System.out.println(s_num + "Strike "+b_num+"Ball ");
		}

}
