package prefecture;

public class Prefecture {

	// フィールド値prefectureNumを宣言
	private int prefectureNum;
	
	// フィールド値prefectureNameを宣言
	private String prefectureName;
	
	// フィールド値preCapを宣言
	private String preCap;
	
	// フィールド値prefectureAreaを宣言
	private double prefectureArea;
	
	//　フィールド値prefectureNumに値を代入するメソッド
	public void setNum(String number) {
		// dataAttay[2]の値をString型からint型に変換し、変数iに代入
        int i = Integer.parseInt(number);
        // 変数iの値をprefectureNumに代入する
		this.prefectureNum = i;
	}
	
	public void setData(String data) {
		// 分割に用いる文字を指定
        String[] dataArray = data.split(":");
        
        // dataArray[0]の値をフィールド値prefectureNameに代入
        this.prefectureName = dataArray[0];
        
        // dataArray[1]の値をフィールド値preCapに代入
        this.preCap = dataArray[1];
        
        // dataAttay[2]の値をString型からdouble型に変換し、変数dに代入
        double d = Double.parseDouble(dataArray[2]);
        // dをフィールド値heightに代入
        this.prefectureArea = d;
	}
	
	// フィールド値を出力するメソッド
	public void getData() {
		System.out.println("都道府県名:" + this.prefectureName);
		System.out.println("県庁所在地：" + this.preCap);
		System.out.println("面積：" + this.prefectureArea + "km2");
	}
	
}
