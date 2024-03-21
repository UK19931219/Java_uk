package person;

// インポート
import vehicle.Bicycle;
import vehicle.Car;

public class Person{
	
	
	// クラスフィールド値countを定義
	public static int count = 0;
	
	// フィールド値の定義
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstName, int age, double height, double weight){
		// 引数をフィールド値に代入
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// countの値に1足す
		Person.count++;
	}
	
	// Personメソッドをオーバーロード。引数にlastNameを追加
	public Person(String firstName, String lastName, int age, double height, double weight){
		// 引数をフィールド値に代入
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// countの値に1足す
		Person.count++;
	}

	// フルネームを取得するクラスメソッド
	public String fullName(){
		return this.firstName + this.lastName;
	}

	// 名前と年齢を出力するメソッド
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// bmiを返すメソッド
	public double bmi(){
		return this.weight / this.height / this.height;
	}

	// 合計人数を出力するクラスメソッド
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
	
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
	
}