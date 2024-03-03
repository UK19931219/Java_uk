package curriculum_New_question;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	// メソッドgreeting()を定義
	public static void greeting(String a, int b) {
		// 「Hello a b」と出力
		System.out.println("Hello" + " " + a + " " + b);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	// メソッドmultiplicationを定義
	public static void intMultiplication(int a, int b) {
		// 変数solutionを宣言。引数aと引数bをかけた値を乗算
		int solution = a * b;
		// 戻り値として変数solutionを返す
		System.out.println(solution);
	}
			
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	// メソッドorderを定義
	public static void order(int[]  aryData) {
		// 配列の長さの回数繰り返す
		for (int i = 0; i < aryData.length; i++) {
			// 配列の中身を順番に出力
			System.out.print(aryData[i]);
		}
		// 改行
		System.out.println();
	}
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	// メソッドdoubleAddを定義する
	public static void doubleAdd(double a, double b) {
		// 変数solutionを宣言し、引数aと引数bを足した値を代入する
		double solution = a + b;
		//　変数solutionの値を出力する
		System.out.println(solution);
	}
			
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randNum(int a) {
		// 整数型の配列numRandを宣言し、データ数を引数aとする
		int[] numRand = new int[a];
		
		// 引数a回分繰り返す
		for(int i = 0; i < a; i++) {
			// 整数型の配列randomを宣言し、１～１００の整数をランダムに代入する
			int random = new java.util.Random().nextInt(100) + 1;
			//　変数randomをコンソールに出力する
			System.out.print(random + " ");
			// 配列numRand[i]に変数randomの値を代入する
			numRand[i] = random;
		}
		// 改行
		System.out.println();
		
		// 戻り値として配列numRandを返す
		return numRand;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double randAve(int[] aryData) {
		
		// 配列の値の合計値を代入するための変数sumを宣言し、０で初期化する
		int sum = 0;
		
		// 配列のデータ数分繰り返す
		for(int i = 0; i < aryData.length; i++) {
			// 変数sumに配列の値を加える
			sum = sum + aryData[i];
		}
		// 配列の中身の合計値を配列のデータ数で割る
		double ave = sum / aryData.length;
		// 変数aveを出力する
		System.out.println(ave);
		// 変数aveを返す
		return ave;
	}
	
		
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void judAve(double d) {
		// ブーリアン型の変数xを宣言し、falseを代入する
		boolean x = false;
		
		// もし引数が50以上なら
		if(d >= 50) {
			// 変数xにtrueを代入する
			x = true;
		}
		// 変数xを出力する
		System.out.println(x);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q1
		greeting("JavaSE", 11);
		
		// Q2
		intMultiplication(10, 20);
		
		// Q3
		int example[] = {2, 3, 1, 7, 3, 9};
		order(example);
		
		// Q4
		doubleAdd(2.5, 9.3);
		
		// Q5
		randNum(6);
		
		// Q6
		randAve(randNum(6));
		
		// Q7
		judAve(randAve(randNum(6)));
	}

}
