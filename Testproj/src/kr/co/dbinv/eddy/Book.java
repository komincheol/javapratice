package kr.co.dbinv.eddy;

public class Book {
int price;
int num=0;
String title;
Book(String t, int p){
	title = t;
	price= p;
}
void print(){
	System.out.println("����: "+title);
	System.out.println("����: "+price);
	System.out.println("�ֹ�����: "+num);
	System.out.println("�հ�ݾ�: "+price*num);
}
}
