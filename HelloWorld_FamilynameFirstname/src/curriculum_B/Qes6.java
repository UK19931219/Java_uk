package curriculum_B;

import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 配列の宣言と初期化
		int[] consumerElectronics = new int[7];
		
		// 変数iが7より小さい間繰り替えす
		for(int i = 0; i < 7; i++) {
			// 配列consumerElectronicsに0～11までの整数をランダムに代入していく
			consumerElectronics[i] = new java.util.Random().nextInt(12);
		}

		int a = 1;
		
		while(a == 1) {
		
			// 商品名を入力してくださいと出力する
			System.out.println("商品名を入力してください");
			
			// コンソールで入力した文字列を変数conEleに代入
			Scanner conEle =  new Scanner(System.in);
			// 文字列型の変数strに変数conEleの値を代入
			String str = conEle.next();
			// 変数strの値を,で区切り、変数conに代入する
			String[] con = str.split(",");
				
			for(String k : con) {		
				switch(k) {
					case "パソコン":
						System.out.println("パソコンの残り台数は" + consumerElectronics[0] + "です");
						break;
					case "冷蔵庫":
						System.out.println("冷蔵庫の残り台数は" + consumerElectronics[1]  + "です");
						break;
					case "扇風機":
						System.out.println("扇風機の残り台数は" + consumerElectronics[2]  + "です");
						break;
					case "洗濯機":
						System.out.println("洗濯機の残り台数は" + consumerElectronics[3] + "です");
						break;
					case "加湿器":
						System.out.println("加湿器の残り台数は" + consumerElectronics[4] + "です");
						break;
					case "テレビ":
						System.out.println("テレビの残り台数は" + consumerElectronics[5] + "です");
						break;
					case "ディスプレイ":
						System.out.println("ディスプレイの残り台数は" + (11 - consumerElectronics[6]) + "です");
						break;
					default:
						System.out.println("『" + k + "』は指定の商品ではありません");
						break;
				}
				
				// 改行
				System.out.println();
				
			}
		
		}
		
	}

}
