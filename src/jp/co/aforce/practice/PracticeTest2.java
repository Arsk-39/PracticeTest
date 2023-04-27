package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
	//練習問題1
	final double TAX = 1.1;
	System.out.println(TAX);
	//練習問題2
	int x = 480;
	double price =(x * TAX);
	System.out.println(price);
	//練習問題3
	String name = "有坂玲志";
	System.out.println(name);
	//練習問題4
	String syouhin = "この商品の値段は";
	String en = "円です";
	System.out.println(syouhin + price + en);
	}
}
