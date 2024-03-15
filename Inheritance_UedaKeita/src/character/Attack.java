package character;

public class Attack extends Status{

	// Attackクラスのコンストラクタ
	public Attack(){
		super();
		System.out.println("攻撃力:" + getStatus());
	}
}