package character;

// Randomクラスをインポートする
import java.util.Random;

public class Status{
	
	// フィールド値abilityValueを宣言
	private int abilityValue;
	
	// Randomクラスを呼び出す
	Random rnd = new Random();
	
	// Statusクラスのコンストラクタ
	public Status(){
		this.abilityValue = rnd.nextInt(1000) + 1;
	}
	
	// abilityValueを設定するコンストラクタ
	public int setStatus(){
		return this.abilityValue = rnd.nextInt(1000) + 1;
	}
	
	// フィールド値statusを取得するgetterメソッド
	public int getStatus() {
		return this.abilityValue;
	}
}



