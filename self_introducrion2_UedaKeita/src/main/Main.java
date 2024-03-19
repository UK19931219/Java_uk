package main;

import person.Person;

public class Main {
	
	public static void main(String[] argos){
		
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		
		// 人数は○○人ですとコンソールに出力
		System.out.println("人数は" + Person.getCount() + "人です");
		
		// クラスメソッドprintCountを呼び出す
		Person.printCount();
	}
	
}
