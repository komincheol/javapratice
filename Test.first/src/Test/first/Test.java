package Test.first;

import java.io.*;

public class Test {
	public static void main(String[] args) {
		BufferedReader inputStream;
		String input;
		int line=0;
		
		if(args.length !=1){
			System.out.println("����:Ŭ������,���ϸ�");
			System.exit(0);
		}else
			
		try{
		inputStream= new BufferedReader(new FileReader(args[0]));
		while((input = inputStream.readLine())!=null){
			
			System.out.println(input);
			line++;
		}
		System.out.println();
		System.out.println("���μ�"+line);
		inputStream.close();
		}catch(IOException e){
			System.err.print("������");
			e.printStackTrace();
		}
	}
}
