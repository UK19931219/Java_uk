package person;

public class Person{
	// フィールド値を定義
	public String name;
	public int age;
	public double height;
    public double weight;
    
    // クラスフィールド値countを定義
    public static int count = 0;

    // コンストラクタを定義しインスタンスフィールドに値をセット
    public Person(String name, int age, double height, double weight){
    	this.name = name;
    	this.age = age;
    	this.height = height;
    	this.weight = weight;
    	// フィールド値countに１を足す
    	count = count + 1;
    }
    
    // フィールド値のgetterメソッド、setterメソッドを定義
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
	
	// countの値を取得するgetterクラスメソッド
	public static int getCount() {
		return count;
	}

    // bmiを返すメソッド
    public double bmi(){
    	return this.weight / this.height / this.height;
    }

    // 名前、年齢をコンソールに出力するメソッド
    public void print(){
    	System.out.println("名前は" + this.name + "です");
    	System.out.println("年は" + this.age + "です");
    }
    
    // 名前、年齢をコンソールに出力するクラスメソッド
    public static void printCount() {
    	System.out.println("人数は" + count + "人です");
    }
}