package animal;

public class Animal {

	// フィールド値abilityValueを宣言
	private String name;
	
	// フィールド値heightを宣言
	private double height;
	
	// フィールド値speedを宣言
	private int speed;
	
	// フィールド値scientificNameを宣言
	protected String scientificName;
	
	
	// scientificNameを設定するコンストラクタ
	public Animal(){
		this.scientificName = "";
	}
	
	// フィールド値nameを取得するgetterメソッド
	public String getName() {
		return this.name;
	}
	//　フィールド値nameに値を代入するメソッド
	public void setName(String name) {
		this.name = name;
	}
	
	// フィールド値heightを取得するgetterメソッド
	public double getHeight() {
		return this.height;
	}
			
	//　フィールド値heightに値を代入するメソッド
	public void setHeight(double height) {
		this.height = height;
	}
	
	// フィールド値heightを取得するgetterメソッド
	public int getSpeed() {
		return this.speed;
	}
					
	//　フィールド値heightに値を代入するメソッド
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	// name,height,speedのフィールド値を代入するメソッド
	public void setStatus(String status) {
		// 分割に用いる文字を指定
        String[] dataArray = status.split(":");
        
        // dataArray[0]の値をフィールド値nameに代入
        this.name = dataArray[0];
        
        // dataAttay[1]の値をString型からdouble型に変換し、変数dに代入
        double d = Double.parseDouble(dataArray[1]);
        // dをフィールド値heightに代入
        this.height = d; 
        
        // dataAttay[2]の値をString型からint型に変換し、変数iに代入
        int i = Integer.parseInt(dataArray[2]);
        // iをフィールド値speedに代入
        this.speed = i;
	}
	
	// name,height,speed,scientificNameのフィールド値を出力するメソッド
	public void getStatus() {
		System.out.println("動物名:" + this.name);
		System.out.println("体長：" + this.height + "kg");
		System.out.println("速度：" + this.speed + "km/h");
		System.out.println("学名：" + this.scientificName);
	}
	
	
  
}
