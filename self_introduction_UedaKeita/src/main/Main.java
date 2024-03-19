package main;

import person.Person;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
	   
	    // 下記をコンソールに出力する
	    System.out.println(person1.getName());
	    System.out.println(person1.getAge());
	    System.out.println(person1.getHeight());
	    //　改行
	    System.out.println("");
	    
	    // printメソッドを呼び出す
	    person1.print();
	    
	    // 合計人数を出力する
	    System.out.println("合計は" + 1 + "人です");
	  }
}
