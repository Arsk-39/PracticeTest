package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest5 {

	public static void main(String[] args) {
		//練習問題1
		ArrayList<String> list = new ArrayList<>();
		list.add("犬");
		list.add("猫");
		list.add("ウサギ");
		list.add("蛇");
		//練習問題2
		String inu = "ワニ";
		if(list.contains(inu)) {
			System.out.println(inu + "はリストに含まれています");
		}else {
			System.out.println(inu +"はリストに含まれていません");
		}
		//練習問題3
		int x = 11;
		
		switch(x) {
		
		case 1:
			System.out.println("冬物セール");
			break;
		case 2,3,4:
			System.out.println("春物を売る");
			break;
		case 5:
			System.out.println("春物セール");
			break;
		case 6,7:
			System.out.println("夏物を売る");
			break;
		case 8:
			System.out.println("夏物セール");
			break;
		case 9:
			System.out.println("秋物を売る");
			break;
		case 10,11,12:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
			break;
		}
		
		}
}
