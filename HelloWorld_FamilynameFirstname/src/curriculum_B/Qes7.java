package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String型の変数Nを宣言
		String N = "";
		// 生徒の人数を入力してくださいと出力する
		System.out.print("生徒の人数を入力してください（２以上）：");
		// コンソールで入力した値を変数Nに代入
		N = new java.util.Scanner(System.in).nextLine();
		// 変数Nの値を整数型に変更する
		int intN = Integer.parseInt(N);
		
		// 改行
		System.out.println();
		
		// 配列subjectを宣言
		String[] subject = {"英語", "数学", "理科", "社会"};
		
		// 各生徒の各点数を保存するための２次元配列、scoreDataを宣言。行数は人数分。列数は４科目分
		int[][] score = new int[intN][4];
		
		// 生徒ごとの合計点を格納する配列scoreTotalを宣言
		int[] scoreTotal = new int[intN];
		
		//　生徒ごとの平均点を格納する配列averageStudentを宣言
		double[] averageStudent = new double[intN];
		
		//　各教科ごとの平均点を格納する配列aberageStudentを宣言
		double[] averageSubject = new double[4];

		// 各生徒の各教科の点数を入力
		// iが1から人数までの間
		for(int i = 1; i <= intN; i++) {
			// jが0~3の間
			for(int j = 0; j < 4; j++) {
				// i人目の『subject[j]』の点数を入力してくださいと出力
				System.out.print( i + "人目の『" + subject[j] + "』の点数を入力してください：");
				//  コンソールで入力した値を変数scoreStringに代入
				String scoreString = new java.util.Scanner(System.in).nextLine();
				//　scoreStringを整数型に変換し、変数scoreIntに代入
				int scoreInt = Integer.parseInt(scoreString);
				// 配列score[i -1][j]にscoreIntの値を代入する
				score[i- 1][j] = scoreInt;
			}
			// 改行
			System.out.println();
		}
		
		// 合計点を入力格納する配列sumStudentを宣言
		int sumStudent;
		
		// kが1~intNの間
		for(int k = 1; k <= intN; k++) {
			//変数sumStudentを0で初期化する
			sumStudent = 0;
			// lが0~3の間
			for(int l = 0; l < 4; l++) {
				// 配列の中身を順に足していく
				sumStudent = sumStudent + score[k - 1][l];
			}
			// 合計点を配列scoreTotalに代入
			scoreTotal[k - 1] = sumStudent;
			// 平均点を配列averageStudentに代入
			averageStudent[k - 1] = scoreTotal[k - 1] / 4;
			// k-1人目の平均点を出力
			System.out.println( k + "人目の平均点は：" + averageStudent[k - 1] + "です。");
		}
		// 改行
		System.out.println();
		
		// 変数sumSubjectを宣言
		double sumSubject;
		
		for(int m = 0; m < 4; m++) {
			// 変数sumSubjectの値を0で初期化する
			sumSubject = 0;
			//
			for(int n = 0; n < intN; n++ ) {
				// 各教科の合計点を生徒の人数分求める
				sumSubject = sumSubject + score[n][m];
			}
			// 各教科の平均点を求める
			averageSubject[m] = sumSubject / intN;
			// 各教科の平均点を出力
			System.out.println( subject[m] + "の平均点は：" + averageSubject[m] + "です。");
		}
		
		// 各教科の平均点の合計を格納する変数subjectTotalを宣言し、0で初期化
		double subjectTotal = 0;
		// 全体の平均点を格納する変数averageAveを宣言し、0で初期化
		double averageAve = 0; 
		
		for(int p = 0; p < 4; p++) {
			// 各教科の平均点の合計を計算
			subjectTotal = subjectTotal + averageSubject[p];
		}
		// 全体の平均点を求める
		averageAve = subjectTotal / 4;
		
		// 全体の平均点を出力
		System.out.println("全体の平均点は：" + averageAve + "です。");
		
	}

}
