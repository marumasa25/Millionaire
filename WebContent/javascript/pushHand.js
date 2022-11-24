
var field = document.getElementsByClassName('field');

function changeId(index){//カードをクリックするとカードのimgタグ内のIDタグ名が変わる関数
	var card = document.getElementById('card'+index);
	//動作確認用log
	console.log(card);
	//getElementで取ってきたIDタグ名を'active'に変更
	card.id = 'active';
}	
//念のため残しているだけ
	/*var card = document.getElementsByClassName('card'+index);
	//classに'active'に変更
	card.classList.toggle('active');*/

	/*for(var　i = 0; i < card.length; i++) {
	    card[i].addEventListener("click", function() {
	    	this.classList.toggle('active');
	    });
	}*/
//ここまで

function pushCard() {//ボタンクリック時の対象カードのclassに'push'を追加する関数
    var active = document.getElementById('active');
    
    //動作確認用log
    console.log(active);
    //ID名'active'のclassに'push'を追加
    active.classList.add('push');
	
	
	/*動作について
	imgタグ内のカードのclassタグが"hand1 push"となることで、cssが適用されてカードが見えなくなる。
	ただし、HTML上ではimgタグが残ったままなので、今回の状態だと一番左側のカードのみがこの処理を受け続ける。
	このため、for文などで対象のカード全てにclassタグ'push'を付与できるようにする必要があると思う。
	*/
}

//以下はまだ手を付けていないため、完成していないコード
function pullCard() {
    var active = document.getElementsByClassName('active');

    var actImg = [];
    for(i = 0; i < active.length; i++) {
        actImg[i] = active.getAttribute('src');
        field.getElementById("test").innerHTML += "<img src='actImg[i]'>";
    }
    
    /*動作について
    JS上で「カードを場に出す動作」を行っている。
    'active'の名前のついているimgタグの情報をフィールド上に出している。
    */

}