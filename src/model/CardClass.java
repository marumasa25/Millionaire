package model;
//トランプの定義、操作を行うクラス

import model.Hand;

public class CardClass {
	//カードを二次元配列で宣言｜書式 → card[カードの数値][カードのマーク]
	private final String[][] card = {
			{"clover","daia","spade","heart"},//A
			{"clover","daia","spade","heart"},//2
			{"clover","daia","spade","heart"},//3
			{"clover","daia","spade","heart"},//4
			{"clover","daia","spade","heart"},//5
			{"clover","daia","spade","heart"},//6
			{"clover","daia","spade","heart"},//7
			{"clover","daia","spade","heart"},//8
			{"clover","daia","spade","heart"},//9
			{"clover","daia","spade","heart"},//10
			{"clover","daia","spade","heart"},//J
			{"clover","daia","spade","heart"},//Q
			{"clover","daia","spade","heart"},//K
			{"black","red"}//joker
	};
	
	public Hand[] handCreate(){
		Hand[] hand = {
				new Hand(),
				new Hand(),
				new Hand(),
				new Hand()
		};
		return hand;
	}

