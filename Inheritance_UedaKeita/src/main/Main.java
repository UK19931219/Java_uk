package main;

import java.util.Objects;
import character.Name;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Heroクラスを呼び出す
		Name h = new Name();
		// コンソールに出力
		System.out.print("名前を入力してください：");
		// コンソールで名前を入力
		String name = new java.util.Scanner(System.in).nextLine();
		// 入力された名前をHeroクラスのnameに代入
		h.setName(name);
		
		// outNameメソッドを呼び出す
		h.outName();
		
		// ステータスと出力する
		System.out.println("ステータス");

		
		if (Objects.nonNull(h.getHp())) {
			//　コンソールに出力
			System.out.println("HP：" + h.getHp());
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
		if (Objects.nonNull(h.getMp())) {
			//　コンソールに出力
			System.out.println("MP：" + h.getMp());
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
		if (Objects.nonNull(h.getAttack())) {
			//　コンソールに出力
			System.out.println("攻撃力：" + h.getAttack());
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
		if (Objects.nonNull(h.getSpeed())) {
			//　コンソールに出力
			System.out.println("素早さ：" + h.getSpeed());
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
		if (Objects.nonNull(h.getDefence())) {
			//　コンソールに出力
			System.out.println("防御力：" + h.getDefence());
		} else {
			// 処理を停止
			System.exit(0); 
		}
		
		// 改行
		System.out.println("");
		// コンソールに出力
		System.out.println("さあ冒険に出かけよう！");
		
	}

}


/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/
