package main;

// Nameクラスをインポート
import character.Name;
// Statusクラスをインポート
import character.Status;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nameクラスを呼び出す
		Name n = new Name();
		
		// Statusクラスを呼び出す
		Status s = new Status();
		
		// コンソールに出力
		System.out.print("名前を入力してください：");
		// コンソールで名前を入力
		String name = new java.util.Scanner(System.in).nextLine();
		// 入力された名前をNameクラスのnameに代入
		n.setName(name);
		// outNameメソッドを呼び出す
		n.outName();
		// ステータスと出力する
		System.out.println("ステータス");
		
		// 各ステータスの変数を宣言し、setStatusメソッドを用いて数値を代入する
		int hp = s.setStatus();
		int mp = s.setStatus();
		int attack = s.setStatus();
		int speed = s.setStatus();
		int defence = s.setStatus();
		
		// 各ステータスを出力する
		System.out.println("HP:" + hp);
		System.out.println("MP:" + mp);
		System.out.println("攻撃力:" + attack);
		System.out.println("素早さ:" + speed);
		System.out.println("防御力:" + defence);
		
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
