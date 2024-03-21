package main;

//インポート
import person.Person;
import vehicle.Car;
import vehicle.Bicycle;

public class Main {
	
	public static void main(String[] args){
		
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		//person1.print();

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		//person2.print();

		//Person.printCount();

		
		// Carクラスを呼び出す
		Car c = new Car();
		
		// Bicycleクラスを呼び出す
		Bicycle b = new Bicycle();
		
		// Carクラスのインスタンス「car」の所有者を「person1」
		c.setOwner(person1.fullName());
		
		// Bicycleクラスのインスタンス「bicycle」の所有者を「person2」
		b.setOwner(person2.fullName());
		
		// 「car」の所有者名を出力する
		//System.out.println(c.getOwner());
		
		// 「Bicycle」の所有者名を出力する
		//System.out.println(b.getOwner());
		
		
		// person1がcarを購入
		person1.buy(c);
		
		// person2がbicycleを購入
		person2.buy(b);
		
	}
}