package character;

// Objectsをインポート
import java.util.Objects;
// Randomをインポート
import java.util.Random;

public class Name {

	// フィールド値nameを宣言
	private String name;
	
	// フィールド値hpを宣言
	private int hp;
	
	// フィールド値mpを宣言
	private int mp;
	
	// フィールド値attackを宣言
	private int attack;
	
	// フィールド値speedを宣言
	private int speed;
	
	// フィールド値defenceを宣言
	private int defence;
	
	// Randomクラスを呼び出す
	Random rnd = new Random();
	
	// 各フィールド値の初期値をランダムに設定
	public Name(){
		this.hp = rnd.nextInt(1000) + 1;
		this.mp = rnd.nextInt(1000) + 1;
		this.attack = rnd.nextInt(1000) + 1;
		this.speed = rnd.nextInt(1000) + 1;
		this.defence = rnd.nextInt(1000) + 1;
	}
	
	// フィールド値nameを取得するgetterメソッド
	public String getName() {
		return this.name;
	}
	
	// フィールド値nameに値を代入するsetterメソッド
	public void setName(String name) {
		this.name = name;
	}
	
	public void outName() {
		if (Objects.nonNull(getName())) {
			//　コンソールに出力
			System.out.println("こんにちは「" + getName() + "」さん");
		} else {
			// 処理を停止
			System.exit(0); 
		}
	}
	
	// フィールド値hpを取得するgetterメソッド
	public int getHp() {
		return this.hp;
	}
	
	// フィールド値mpを取得するgetterメソッド
	public int getMp() {
		return this.mp;
	}
	
	// フィールド値attackを取得するgetterメソッド
	public int getAttack() {
		return this.attack;
	}	
	
	// フィールド値speedを取得するgetterメソッド
	public int getSpeed() {
		return this.speed;
	}
	
	// フィールド値defenceを取得するgetterメソッド
	public int getDefence() {
		return this.defence;
	}	
}