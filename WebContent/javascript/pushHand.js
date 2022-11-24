
//var field = document.getElementsByClassName('field');
var test = document.getElementById('test');

function changeId(index){//カードをクリックするとカードのimgタグ内のIDタグ名が変わる関数
	var card = document.getElementById('card'+index);
	//動作確認用log
	console.log(card);
	//classに'active'に変更
	card.classList.add('active');
}

function pushCard() {//ボタンクリック時の対象カードのclassに'push'を追加する関数
    var active = document.getElementsByClassName('active');
    for(i=0;i < active.length;i++){
	    //動作確認用log
	    console.log(active);
	    //ID名'active'のclassに'push'を追加
	    active[i].classList.add('push');
	}
}

//以下はまだ手を付けていないため、完成していないコード
function pullCard() {
    var active = document.getElementsByClassName('active');

    var actImg;
    for(i = 0; i < active.length; i++) {
        actImg = active[i].getAttribute('src');
        console.log(actImg);
        test.innerHTML = `<img src="${actImg}">`;
    }
    
    /*動作について
    JS上で「カードを場に出す動作」を行っている。
    'active'の名前のついているimgタグの情報をフィールド上に出している。
    */

}