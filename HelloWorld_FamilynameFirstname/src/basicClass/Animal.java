package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog d = new Dog();
		d.setName();
		System.out.println(d.animalName);
			
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		d.setNum(3);
		System.out.println(d.animalNum);
			
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date nowDate = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		String formatNowDate = sdf1.format(nowDate);
        System.out.println(formatNowDate);
		
	}

}
