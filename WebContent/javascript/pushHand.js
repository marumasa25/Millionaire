/**
 * 
 */

var field = document.getElementsByClassName('field');
//カードをクリックするとカードのタグ名が変わる
function changeId(){
	var card = document.getElementById('card');
	card.id = 'active';
}
/*for(var　i = 0; i < card.length; i++) {
    card[i].addEventListener("click", function() {
    	this.classList.toggle('active');
    });
}*/
function pushCard() {
    var active = document.getElementById('active');
    for(i = 0; i < active.length; i++) {
        active[i].classList.add('push');
    };
}
function pullCard() {
    var active = document.getElementById('active');
    var actImg = [];
    for(i = 0; i < active.length; i++) {
        actImg[i] = active.getAttribute('src');
        field.getElementById("test").innerHTML += "<img src='actImg[i]'>";
    }
}