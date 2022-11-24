package model;

import java.util.ArrayList;

public class Hand {
	
	//カードを格納するリスト
	private ArrayList<String> hand = new ArrayList<String>();

	//手札にカードを格納するセッター
	public void setHand(String card) {
		hand.add(card);
	}
	
	//手札のカードを全て取得するゲッター
	public ArrayList<String> getHand(){
		return hand;
	}
	
	//手札の中から取得したいデータだけを取得するゲッターのオーバーロード
	public ArrayList<String> getHand(String[] words){
		ArrayList<String> searchHand = new ArrayList<String>();
		
		//引数と同じ文字列をhandの中から取得し、searchHandに格納するループ処理
		for(int i=0,index=0;i<words.length;i++) {
			//引数と同じデータをhandリストの中から探索し、インデックスをindex変数に格納する
			index = hand.indexOf(words[i]);
			//indexの値が-1(handリスト内に該当のデータなし)の場合は処理しない
			if(index != -1) {
				//serchHandの中にhandのindexに対応した内容を格納する処理
				searchHand.add(
					hand.get(index));
				//index変数を初期化する処理
				index = -1;
			}
		}
		return searchHand;
	}
}

