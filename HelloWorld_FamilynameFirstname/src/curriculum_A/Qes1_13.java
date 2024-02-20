package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {

		//１
		//バイト型の変数bを宣言
		byte b;
		//短整数型の変数sを宣言
		short s;
		//整数型の変数cを宣言
		int i;
		//長変数型の変数lを宣言
		long l;
		//単精度浮動小数点数型の変数fを宣言
		float f;
		//倍精度浮動小数点数型の変数dを宣言
		double d;
		//文字型の変数cを宣言
		char c;
		//文字列型の変数sを宣言
		String S;
		//ブーリアン型の変数Bを宣言
		boolean B;
		
		
		//2
		//変数bの初期値
		b = 0;
		//変数sの初期値
		s = 0;
		//変数iの初期値
		i = 0;
		//変数lの初期値
		l = 0;
		//変数fの初期値
		f = 0.0f;
		//変数dの初期値
		d = 0.0d;
		//変数cの初期値
		c = '\u0000';
		//変数Sの初期値
		S = null;
		//変数Bの初期値
		B = false;
		
		
		//3
		//変数bに10を代入する
		b = 10;
		//変数sに100を代入する
		s = 100;
		//変数iに1000を代入する
		i = 1000;
		//変数lに10000を代入する
		l = 10000;
		//変数fに9.5を代入する
		f = 9.5f;
		//変数dに10.5を代入する
		d = 10.5d;
		//変数cにaを代入する
		c = 'a';
		//変数Sにハローを代入する
		S = "ハロー";
		//変数Bにtrueを代入する
		B = true;
		
		
		//4
		//11110を出力する
		System.out.println(b + s + i + l);
		//20を出力する
		System.out.println(d + f);
		//aハローtrueを出力する
		System.out.println(c + S + B);
		//数字をすべて足した値を出力する
		System.out.println(b + s + i + l + d + f);
		//小数点以外の数字をすべてかけた値を出力する
		System.out.println(b * s * i * l);
		//10.5割る100の結果を出力する
		System.out.println(d / s);
		//10引く90の結果を出力する
		System.out.println(b - s);
		
		
		//5
		//変数numを宣言し、文字列”20”を代入する
		String num="20";
		//変数num1を宣言し、文字列”23”を代入する
		String num1="23";
		//ハローJAVA2023を出力する
		System.out.println("ハローJAVA"+(num+num1));
		
		
		//6
		//変数nameを宣言し、文字列”山田太郎”を代入する
		String name = "山田太郎";
		//変数ageを宣言し、18を代入する
		int age = 18;
		//変数heightを宣言し、170.5を代入する
		double height = 170.5;
		//変数weightを宣言し、62.2を代入する
		double weight = 62.2;
		//変数foodを宣言し、文字列”寿司”を代入する
		String food = "寿司";
		
		//はじめまして○○ですと出力する
		System.out.println("はじめまして" + name + "です");
		//年齢は○○歳です
		System.out.println("年齢は" + age + "歳です");
		//身長は○○cmです
		System.out.println("身長は" + height + "cmです");
		//体重は○○kgです
		System.out.println("体重は" + weight + "kgです");
		//好きな食べ物は○○です
		System.out.println("好きな食べ物は" + food + "です");

		
		//7
		//変数bmiを宣言
		double bmi = weight / ((height/100) * (height/100));
		//BMIを出力する
		System.out.println("BMIは" + bmi + "です");
		
		
		//8
		//変数nameを宣言し、文字列”鈴木一郎”を代入する
		name = "鈴木一郎";
		//変数ageを宣言し、24を代入する
		age = 24;
		//変数heightを宣言し、168.5を代入する
		height = 168.5;
		//変数weightを宣言し、64.2を代入する
		weight = 64.2;
		//変数foodを宣言し、文字列”オムライス”を代入する
		food = "オムライス";
		
		//はじめまして○○ですと出力する
		System.out.println("はじめまして" + name + "です");
		//年齢は○○歳です
		System.out.println("年齢は" + age + "歳です");
		//身長は○○cmです
		System.out.println("身長は" + height + "cmです");
		//体重は○○kgです
		System.out.println("体重は" + weight + "kgです");
		//好きな食べ物は○○です
		System.out.println("好きな食べ物は" + food + "です");
		
		//bmiに値を代入
		bmi = weight / ((height/100) * (height/100));
		//BMIを出力する
		System.out.println("BMIは" + bmi + "です");
		
		
		//9
		//変数nameを宣言し、文字列”鈴木一郎”を代入する
		name = "鈴木一郎";
		//変数ageを宣言し、24を代入する
		age = age + 24;
		//変数heightを宣言し、168.5を代入する
		height = height + 168.5;
		//変数weightを宣言し、64.2を代入する
		weight = weight + 64.2;
		//変数foodを宣言し、文字列”オムライス”を代入する
		food = "オムライス";
		
		//はじめまして○○ですと出力する
		System.out.println("はじめまして" + name + "です");
		//年齢は○○歳です
		System.out.println("年齢は" + age + "歳です");
		//身長は○○cmです
		System.out.println("身長は" + height + "cmです");
		//体重は○○kgです
		System.out.println("体重は" + weight + "kgです");
		//好きな食べ物は○○です
		System.out.println("好きな食べ物は" + food + "です");
				
		//bmiに値を代入
		bmi = weight / ((height/100) * (height/100));
		//BMIを出力する
		System.out.println("BMIは" + bmi + "です");
		
		
		//10
		//ブーリアン型の変数
		boolean ageJudge = false;
		//変数ageの値が25以上のとき、ageJugeにtrueを代入する
		ageJudge = age >= 25 ? true : false;
		//ageJugeの値を出力する
		System.out.println(ageJudge);
		
		
		//11
		//変数nameを宣言し、文字列”鈴木一郎”を代入する
		name = "鈴木一郎";
		//変数ageを宣言し、24を代入する
		age = 24;
		//変数heightを宣言し、168.5を代入する
		height = 168.5;
		//変数weightを宣言し、64.2を代入する
		weight = 64.2;
		//変数foodを宣言し、文字列”オムライス”を代入する
		food = "オムライス";
		
		//変数ageを文字列型に変換する
		String ageSt = String.valueOf(age);
		//変数heightを文字列型に変換する
		String heightSt = String.valueOf(height);
		//変数weightを文字列型に変換する
		String weightSt = String.valueOf(weight);
		//【年齢・身長・体重】を出力する
		System.out.println(ageSt + heightSt + weightSt);
		
		
		//12
		//変数ageStを整数型に変換する
		int ageIn = Integer.parseInt(ageSt);
		//変数heightStをdouble型に変換する
		double heightDo = Double.parseDouble(heightSt);
		
		//変数ageInを出力する
		System.out.println(ageIn);
		//変数heightStを出力する
		System.out.println(heightDo);
		
		
		//13
		//ブーリアン型の変数
		boolean judge = false;
		//変数ageInの値が25以上のとき、judgeにtrueを代入する
		judge = ageIn >= 25 ? true : false;
		//変数heightDoの値が160以上のとき、judgeにtrueを代入する
		judge = heightDo >= 160 ? true : false;
		//変数judgeを出力する
		System.out.println(judge);
		
	}
}
