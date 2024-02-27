package curriculum_B;

public class Qes1_3 {

	// 入力されたユーザー名が半角英数字かどうか判定する関数を定義する
	public static Boolean isHalfWidthAlphanumeric(String value) {
		// 引数がnullもしくは0のとき
		if ( value == null || value.length() == 0 )
			// trueを返す
			return true;
		// 変数lenに引数の長さを代入する
		int len = value.length();
		// 引数をbyte配列に変換する
		byte[] bytes = value.getBytes();
		// もし文字列の長さとbyte配列の長さが異なる場合
		if ( len != bytes.length )
			// falseを返す
			return false;
		// trueを返す
		return true;
	}
	
	// ユーザーの手を決める関数userJanken()を定義する
	public static int userJanken() {
		// 0～2の整数をランダムに変数nameJankenに代入する
		int janken = new java.util.Random().nextInt(3);
		// 変数jankenの値を返す
		return janken;
	}
	
	// 相手の手を決める関数pcJanken()を定義する
		public static int pcJanken() {
		// 0～2の整数をランダムに変数enemyJankenに代入する
		int janken = new java.util.Random().nextInt(3);
		// 変数jankenの値を返す
		return janken;
	}
	
	// じゃんけんの勝ち負けを判定する関数judgeJankenを定義する
		public static int judgeJanken(int user, int pc){
			// 判定結果を保存する
			int result = 0;
			
			if((user == 0 && pc == 1) || (user == 1 && pc == 2) || (user == 2 && pc == 0 )){
				// 勝ちの場合
				result = 0;
			}else if((user == 0 && pc == 2) || (user == 1 && pc == 0) || (user == 2 && pc == 1)){
				//　負けの場合
				result = 1;
			}else {
				// 引き分けの場合
				result = 2;
			}
		
			//勝敗結果を返す
			return result;
	}
		
	
	// main関数
	public static void main(String[] args) {
		
		String name = "";
		// ブーリアン型の変数inputNameを宣言し、falseを代入する
		Boolean inputName = false;
		
		do {
			// ユーザー名を入力してくださいと出力
			System.out.println("ユーザー名を入力してください");
			// ユーザー名を入力し、変数nameに代入する
			name =  new java.util.Scanner(System.in).nextLine();
			// 変数nameの文字列の長さを変数nameLengthに代入
			int nameLength = name.length();
			// 変数nameの文字列が半角英数字のみか判定する関数を呼び出し、戻り値を変数nameHalfに代入
			Boolean nameHalf = isHalfWidthAlphanumeric(name);
		
			if(nameHalf == true) {
				// ユーザー名の文字数が10文字より大きい場合
				if(nameLength > 10) {
					// 「名前を10文字以内にしてください」と出力する
					System.out.println("名前を10文字以内にしてください");
					// ユーザー名の文字数が0文字以下、もしくはnullの場合
				}else if(nameLength <= 0 || name == null) {
					// 「名前を入力してください」と出力する
					System.out.println("名前を入力してください");
					// どちらでもない場合
				}else {
					// 「ユーザー名「○○」を登録しました」
					System.out.println("ユーザー名「 " + name + " 」を登録しました");
					// 変数inputNameにtrueを代入する
					inputName = true;
				}
			} else {
				// 「半角英数字のみで名前を入力してくださいと出力する」
				System.out.println("半角英数字のみで名前を入力してください");
			}
			
		// inputNameがtrueでない間
		}while(inputName != true);
		
		// 変数iを宣言し、初期値を0とする。
		int i = 0;
		// ブーリアン型変数kaiを宣言し、初期値をfalseを設定
		boolean kai = false;
		// 配列jankenを宣言し、グー、チョキ、パーを格納する
		String janken[] = {"グー", "チョキ", "パー"};
		
		
		do {
			// 関数userJankenを呼び出し、結果を変数userResultに代入する
			int userResult = userJanken();
			// 関数pcResultを呼び出し、結果を変数pcResultに代入する
			int pcResult = pcJanken();
			// 関数judgeJankenを呼び出し、結果を変数	jankenResultに代入する
			int jankenResult = judgeJanken(userResult, pcResult);
			
			// ユーザー名の手を出力する
			System.out.println(name + "の手は「" + janken[userResult] + "」");
			// 相手の手を出力する
			System.out.println("相手の手は「" + janken[pcResult] + "」");
			
			// もし変数jankenResultが0（勝ち）の場合
			if(jankenResult == 0) {
				//　変数iに１を足す
				i = i + 1;
				// 下記の文字列を出力する
				System.out.println("やるやん。\r\n" + "次は俺にリベンジさせて\r\n" + "");
				// 変数kaiにtrueを代入する
				kai = true;
			// 変数jankenResultが0（勝ち）でない場合
			}else if(jankenResult == 1){
				// 変数iに１を足す
				i = i + 1;
				// チョキを出して負けた場合
				if(userResult == 1 && pcResult == 0) {
					System.out.println("俺の勝ち！\r\n" + "負けは次につながるチャンスです！\r\n" + "ネバーギブアップ！\r\n" + "");
				// パーを出して負けた場合
				}else if(userResult == 2 && pcResult == 1) {
					System.out.println("俺の勝ち！\r\n" + "たかがじゃんけん、そう思ってないですか？\r\n" + "それやったら次も、俺が勝ちますよ\r\n" + "");
				//　グーを出して負けた場合
				}else {
					System.out.println("俺の勝ち！\r\n" + "なんで負けたか、明日まで考えといてください。\r\n" + "そしたら何かが見えてくるはずです\r\n" + "");
				}
			}else {
				// 変数iに１を足す
				i = i + 1;
				// 下記の文字列を出力する
				System.out.println("DRAW あいこ もう一回しましょう！\r\n" + "");
			}
			
			// 変数jankenResultの値を出力する
			//System.out.println(jankenResult);
			
		// 変数kaiがtrueでない間
		}while(kai != true);
		
		// 勝つまでにかかった回数を出力する
		System.out.println("勝つまでにかかった合計回数は" + i + "回です。");
	}

}
