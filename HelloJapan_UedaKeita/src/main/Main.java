/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */


package main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

// パッケージexecutionをインポートする
import execution.Execution;

public class Main {
	
	public static void main(String[] args) {
		
		// Executionクラスを呼び出す
		Execution e = new Execution();
		
		// 変数に日本を代入
		e.setCountｒy();
		
		if (Objects.nonNull(e.countryName)) {
			//　コンソールに出力
			System.out.println("こんにちは！ここは" + e.countryName + "です！");
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
		// 変数に寿司を代入
		e.setFood();
		
		if (Objects.nonNull(e.foodName)) {
			//　コンソールに出力
			System.out.println("この" + e.foodName + "うまい");
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
		// 変数に和食を代入
		e.setGenre();
		
		if (Objects.nonNull(e.foodGenre)) {
			//　コンソールに出力
			System.out.println(e.foodName + e.foodGenre + "です");
		} else {
			// 処理を停止
			System.exit(0); 
		}

		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力
		Date nowDate = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		String formatNowDate = sdf1.format(nowDate);
		System.out.println("今の現在日時は" + formatNowDate + "です");
		
		
	}
}
