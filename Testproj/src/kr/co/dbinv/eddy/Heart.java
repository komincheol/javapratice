package kr.co.dbinv.eddy;

public class Heart {
	
	    public static void main(String[] args) 
	    {
	        int i;   //���� i ����
	       for(i = 4; i < 10; i+=2){
	                pprn(10 - i);    //������ ����ϴ� �Լ� ȣ��
	               pprns(i*2);    //*�� ����ϴ� �Լ� ȣ��
	               pprn((10 - i)*2); //��Ʈ�� �������� �κ� ����
	               pprns(i*2);    //������ ���Ŀ� ����Ǵ� *���
	       System.out.println();     //������ �ϼ��ϸ� �� ����
	       }
	        /* ��Ʈ�� �Ӹ��� ����ϴ� For�� ����*/
	        for(i = 20; i >= 0; i-=2){
	                pprn(20 - i);    //���� ��� �Լ� ȣ��
	               pprns(i*2);    //*�� ����ϴ� �Լ� ȣ��
	       System.out.println();     //������ �ϼ��Ǹ� �ٳ���
	       }
	        /* ��Ʈ�� �Ʒ����� ���*/
	    }
	    /*a�� �޾Ƶ��� int��ŭ ������ ����ϴ� �޼ҵ�*/
	    static void pprn(int a){
	        int j;
	        for(j = 0; j < a; j++)
	            System.out.print(" ");
	    }
	    /*a�� �޾Ƶ��� int��ŭ *�� ����ϴ� �޼ҵ�*/
	   static void pprns(int a){
	        int j;
	        for(j = 0; j <= a; j++)
	            System.out.print("*");
	    }
	 }



