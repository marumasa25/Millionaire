
//var field = document.getElementsByClassName('field');
var test = document.getElementById('test');

function changeId(index){//カードをクリックするとカードのimgタグ内のIDタグ名が変わる関数
	var card = document.getElementById('card'+index);
	//動作確認用log
	console.log(card);
	//classに'active'に変更
	card.classList.add('active');
	/*if(card.classList.contains('active')){
		card.classList.remove('active');
	}else{
		card.classList.add('active');
	}*/
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
    var sourceImage = document.createElement(`img`),
        imgContainer = document.getElementById("test");
    // sourceImage.src = "images/card.jpg";
    // imgContainer.appendChild(sourceImage);
    var active = document.getElementsByClassName('active');
    for(i = 0; i < active.length; i++) {
        sourceImage.src = active[i].getAttribute(`src`);
        imgContainer.appendChild(sourceImage.cloneNode(true));
        active[i].classList.add(`push`)
    };
}