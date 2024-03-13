package main;

import java.util.Objects;
import animal.Lion;

public class Main {

	public static void main(String[] args) {
		
		// Lionクラスを呼び出す
		Lion l = new Lion();
				
		// 変数にライオンを代入
		l.setName("ライオン");
				
		if (Objects.nonNull(l.getName())) {
			//　コンソールに出力
			System.out.println("動物名：" + l.getName());
		} else {
			// 処理を停止
			System.exit(0); 
		}
			
		
		// 変数にライオンを代入
		l.setHeight(2.1);
								
		if (Objects.nonNull(l.getHeight())) {
			//　コンソールに出力
			System.out.println("体長：" + l.getHeight() + "m");
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
		
		// 変数にライオンを代入
		l.setSpeed(80);
										
		if (Objects.nonNull(l.getSpeed())) {
			//　コンソールに出力
			System.out.println("速度：" + l.getSpeed() + "km/h");
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
	}
		
}


/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	
*/