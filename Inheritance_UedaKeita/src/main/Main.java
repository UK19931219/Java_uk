package main;


import character.Attack;
import character.Defence;
import character.Hp;
import character.Mp;
import character.Name;
import character.Speed;
import character.Status;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nameクラスを呼び出す
		Name n = new Name();
		
		// コンソールに出力
		System.out.print("名前を入力してください：");
		// コンソールで名前を入力
		String name = new java.util.Scanner(System.in).nextLine();
		// 入力された名前をNameクラスのnameに代入
		n.setName(name);
		// outNameメソッドを呼び出す
		System.out.println(n.getName());
		// ステータスと出力する
		System.out.println("ステータス");
		
		// Statusクラスを呼び出す
		Status s = new Status();
		
		// Hpクラスを呼び出す
		Hp h = new Hp();
		// Hpの値を出力する
		h.setStatus();
		
		// Mpクラスを呼び出す
		Mp m = new Mp();
		// Mpの値を出力する
		m.setStatus();
		
		
		// Attackクラスを呼び出す
		Attack a = new Attack();
		// Attackの値を出力する
		a.setStatus();
		

		// Speedクラスを呼び出す
		Speed sp = new Speed();
		// Speedの値を出力する
		sp.setStatus();
		
		
		// Defenceクラスを呼び出す
		Defence d = new Defence();
		// Defenceの値を出力する
		d.setStatus();
		
		
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
