package character;

// Randomクラスをインポートする
import java.util.Random;

public class Status extends Name{
	
	// フィールド値abilityValueを宣言
	private int abilityValue;
	
	// Randomクラスを呼び出す
	Random rnd = new Random();

	// abilityValueを設定するコンストラクタ
	public int setStatus(){
		return this.abilityValue = rnd.nextInt(1000) + 1;
	}
	
	// フィールド値statusを取得するgetterメソッド
	public int getStatus() {
		return this.abilityValue;
	}
	
}



