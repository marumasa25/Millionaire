<%--ホーム画面 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>大富豪</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body class="home">
	<main>
		<h1 class="home-name">大富豪</h1>
		<div class="btng">
		<form action="./ControllerServlet" method="post">
			<input type="submit" class="btn" value="対戦">
		</form>
		</div>
	</main>
</body>
</html>