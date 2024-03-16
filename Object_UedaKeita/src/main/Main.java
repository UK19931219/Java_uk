package main;

import animal.Animal;
import animal.Lion;
import animal.Elephant;
import animal.Panda;
import animal.Chimpanzee;
import animal.Zebra;
import animal.Parakeet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 各クラスを呼び出す
		Animal a = new Animal();
		Lion l = new Lion();
		Elephant e = new Elephant();
		Panda p = new Panda();
		Chimpanzee c = new Chimpanzee();
		Zebra z = new Zebra();
		Parakeet pa = new Parakeet();
		
		
		// コンソールに出力
		System.out.println("コンソールに文字を入力してください");		
		
		// コンソールで名前を入力
		String data = new java.util.Scanner(System.in).nextLine();
		
        // 分割に用いる文字を指定
        String[] dataArray = data.split(",");
        
        // ライオンのステータスを出力
        l.setStatus(dataArray[0]);
        l.getStatus();
        System.out.println("");
        
        // ゾウのステータスを出力
        e.setStatus(dataArray[1]);
        e.getStatus();
        System.out.println("");
        
        // パンダのステータスを出力
        p.setStatus(dataArray[2]);
        p.getStatus();
        System.out.println("");
        
        // チンパンジーのステータスを出力
        c.setStatus(dataArray[3]);
        c.getStatus();
        System.out.println("");
        
        // シマウマのステータスを出力
        z.setStatus(dataArray[4]);
        z.getStatus();
        System.out.println("");
        
        // インコのステータスを出力
        pa.setStatus(dataArray[5]);
        pa.getStatus();
        System.out.println("");
        
	}

}


/*

コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
コンソール出力結果
	
コンソールに文字を入力してください
動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/