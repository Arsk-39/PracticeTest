package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main(String[] args) {
		//練習問題1
		ArrayList<String> list = new ArrayList<>();
		list.add("シャープペンシル");
		list.add("ボールペン");
		list.add("リングノート");
		list.add("クリップ");
		list.add("消しゴム");
		//練習問題2
		System.out.println(list.get(0));
		//練習問題3
		ArrayList<String> employees = new ArrayList<>();
		
		employees.add("山田太郎");
		employees.add("鈴木花子");
		employees.add("佐藤二郎");
		employees.add("山田太郎");
		employees.add("高橋三郎");
		//練習問題5
		System.out.println(employees.get(2));
	}
}
