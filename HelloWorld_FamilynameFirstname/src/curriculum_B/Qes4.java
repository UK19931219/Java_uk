package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 九九の計算
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                // 変数mに掛け算の結果を代入
            	int m = i * j;
            	
            	//計算式を出力する。それぞれ２桁で出力。足りない分は０で埋める
            	System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", m));
            	
            	//もしｍが９より小さい場合、||を出力
            	if(j < 9) {
            		System.out.print(" || ");
            	}
            }
	    // 改行
	    System.out.println();
        }
		
	}

}
