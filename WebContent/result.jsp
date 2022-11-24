<%--対戦結果画面 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>対戦結果</title>
</head>
<body>
	<main>
		<h1 class="result">対戦結果</h1>
		<div class="firstPlace">第1位
		</div>
		<div class="secondPlace">第2位
		</div>
		<div class="thirdPlace">第3位
		</div>
		<div class="lastPlace">第4位
		</div>
		
		<div style="display:inline-flex">
		<div class="btng">
		<form action="./ControllerServlet" method="post">
			<input type="submit" class="btn" value="再戦">
		</form>
		</div>
		
		<div class="title">タイトルへ
		
		</div>
		</div>
	</main>
</body>
</html>