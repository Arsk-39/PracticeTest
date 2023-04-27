package jp.co.aforce.practice;

public class PracticeTest6 {
	public static void main(String[] args) {
		//練習問題1
		int r = new java.util.Random().nextInt(4);
		int fortune = r;
		System.out.println(fortune);
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		//練習問題2
		
		int number = 7;
		
		do {
			System.out.print(number + ",");
			number +=7;
		}while(number <= 100);
		//計算問題3
		System.out.println();
		
		for ( int i = 1; i <= 9; i ++ ) {
			for ( int j = 1; j <= 9; j ++ ) {
				int m = i * j;
				System.out.print( " " );
				if ( 10 > m ) 
					System.out.print( " " );
				System.out.print( m );
			}
			System.out.println();
		}
	}

		
		
	}


