package model;
//トランプの定義、操作を行うクラス

import model.Hand;

public class CardClass {
	//カードを二次元配列で宣言｜書式 → card[カードの数値][カードのマーク]
	private final String[][] card = {
			{"c-a.png","d-a.png","s-a.png","h-a.png"},//A
			{"c-2.png","d-2.png","s-2.png","h-2.png"},//2
			{"c-3.png","d-3.png","s-3.png","h-3.png"},//3
			{"c-4.png","d-4.png","s-4.png","h-4.png"},//4
			{"c-5.png","d-5.png","s-5.png","h-5.png"},//5
			{"c-6.png","d-6.png","s-6.png","h-6.png"},//6
			{"c-7.png","d-7.png","s-7.png","h-7.png"},//7
			{"c-8.png","d-8.png","s-8.png","h-8.png"},//8
			{"c-9.png","d-9.png","s-9.png","h-9.png"},//9
			{"c-10.png","d-10.png","s-10.png","h-10.png"},//10
			{"c-j.png","d-j.png","s-j.png","h-j.png"},//J
			{"c-q.png","d-q.png","s-q.png","h-q.png"},//Q
			{"c-k.png","d-k.png","s-k.png","h-k.png"},//K
			{"jorker.png"}//joker
	};
	
	//Handクラスで４人分の手札を生成するメソッド
	public Hand[] handCreate(){
		
		//４人分の手札配列
		Hand[] hand = {
				new Hand(),
				new Hand(),
				new Hand(),
				new Hand()
		};
		
		//手札を順番に格納
		for(int x=0,y=0;y < card.length;y++) {
			for(x=0;x < card[y].length;x++) {
				//hand配列にカードを順に格納
				hand[x].setHand(card[y][x]);
			}
		}
		return hand;
	}
	
	//引数のcard引数と同じ文字列を引数のHandクラス内から削除する処理
	public void CardPush(Hand hand,String[] card) {
		hand.delHand(card);
	} 
}

