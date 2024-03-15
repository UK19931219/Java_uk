package character;

// Objectsをインポート
import java.util.Objects;


public class Name {

	// フィールド値nameを宣言
	private String name;
	
	// フィールド値nameを取得するgetterメソッド
	public String getName() {
		return this.name;
	}
	
	// フィールド値nameに値を代入するsetterメソッド
	public void setName(String name) {
		this.name = name;
	}
	
	// 内容を出力するoutNameメソッド
	public void outName() {
		if (Objects.nonNull(getName())) {
			//　コンソールに出力
			System.out.println("こんにちは「" + getName() + "」さん");
		} else {
			// 処理を停止
			System.exit(0); 
		}
	}
	
}