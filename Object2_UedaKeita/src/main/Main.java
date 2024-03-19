package main;

// Prefectureクラスのインポート
import prefecture.Prefecture;
// Stream APIのインポート
import java.util.stream.Stream;
// Arraysをインポートする
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Prefectureクラスを呼び出す
		Prefecture p = new Prefecture();
			
		// 配列dataを宣言し、データを代入
		String[][] data = { {"0", "北海道:札幌市:83424"},
				{"1", "青森県:青森市:9646"},
				{"2", "岩手県:盛岡市:15275"},
				{"3", "宮城県:仙台市:7282"},
				{"4", "秋田県:秋田市:11638"},
				{"5", "山形県:山形市:9323"},
				{"6", "福島県:福島市:13784"},
				{"7", "茨城県:水戸市:6097"},
				{"8", "栃木県:宇都宮市:6408"},
				{"9", "群馬県:前橋市:6362"},
				{"10", "埼玉県:さいたま市:3798"} };
		
		// コンソールに出力
		System.out.println("コンソールに数字を入力してください（例：7,5,8....）");
		
		// コンソールに数字を入力
		String number = new java.util.Scanner(System.in).nextLine();
		
        // 分割に用いる文字を指定,分割後に配列dataArrayに代入
        String[] dataArray = number.split(",");		
		
        // String型配列 を int型配列 に変換
        int[] intArray = Stream.of(dataArray).mapToInt(Integer::parseInt).toArray();
        
        // コンソールに出力
     	System.out.print("昇順もしくは降順と入力してください：");
		
     	// コンソールに昇順、降順を入力
     	String order = new java.util.Scanner(System.in).nextLine();     	
     	
     	//　昇順と入力された場合
     	if(order == "昇順") {
     		// 配列intArrayを昇順に並べ替える
     		Arrays.sort(intArray);
     	}
     	
     	// 降順と入力された場合
     	if(order == "降順") {
     		Arrays.sort(intArray);
     		for (int f = 0, l = intArray.length - 1; f < l; f++, l--){
     			int temp = intArray[f];
     			intArray[f]  = intArray[l];
     			intArray[l] = temp;
     		}
     	}
     	
     	//改行
     	System.out.println("");
        
        
        // 都道府県のデータを出力する
        for(int i = 0; i < intArray.length; i++) {
        	// 都道府県の番号を入力
        	p.setNum(data[intArray[i]][0]);
        	// 都道府県のデータを入力
        	p.setData(data[intArray[i]][1]);
        	// 入力したデータを出力
        	p.getData();
        	// 改行
        	System.out.println("");
        }
	}
}

/*
	
0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/
