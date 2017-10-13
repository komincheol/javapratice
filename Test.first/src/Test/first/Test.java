package Test.first;

import java.io.*;

public class Test {
	public static void main(String[] args) {
		BufferedReader inputStream;
		String input;
		int line=0;
		
		if(args.length !=1){
			System.out.println("사용법:클래스명,파일명");
			System.exit(0);
		}else
			
		try{
		inputStream= new BufferedReader(new FileReader(args[0]));
		while((input = inputStream.readLine())!=null){
			
			System.out.println(input);
			line++;
		}
		System.out.println();
		System.out.println("라인수"+line);
		inputStream.close();
		}catch(IOException e){
			System.err.print("에러남");
			e.printStackTrace();
		}
	}
}
