package kr.co.dbinv.eddy;

public class Sum {
	public static void main(String[] args) {
		int a =0;
		int b =0;
		for (int i=1; i<=10; i++)
		{
			if((i%2)==0){
				a+=i;
			}
			else{
				b+=i;
			}
			System.out.println("1���� 10������ ¦����="+a);
			System.out.println("1���� 10������ Ȧ����="+b);
			
			
		}
		
	}

}
