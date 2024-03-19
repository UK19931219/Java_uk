package person;

public class Person {

	// インスタンスフィールドを定義
	
	// フィールド値nameを定義
	private String name;
	// フィールド値ageを定義
	private int age;
	// フィールド値heightを定義
	private double height;
	// フィールド値weightを定義
	private double weight;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
		// 引数nameをフィールド値nameに代入
		this.setName(name);
		// 引数ageをフィールド値ageに代入
		this.setAge(age);
		// 引数heightをフィールド値heightに代入
		this.setHeight(height);
		// 引数weightをフィールド値weigthに代入
		this.setWeight(weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// bmiを返すbmiメソッドを定義
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return Math.floor(bmi);
	}
		
	public void print() {
		//　コンソールに下記の値を出力する
		System.out.println("名前は" + this.name + "です");
		System.out.println("歳は" + this.age + "才です");
		System.out.println("BMIは" + bmi() + "です");
		//　改行
	    System.out.println("");
	}
	
}
