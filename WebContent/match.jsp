<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Hand,java.util.ArrayList"%>
<% 
	Hand play1 = (Hand) application.getAttribute("hand1");
	Hand play2 = (Hand) application.getAttribute("hand2");
	Hand play3 = (Hand) application.getAttribute("hand3");
	Hand play4 = (Hand) application.getAttribute("hand4");
	int index = 1;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>対戦</title>
<link rel="stylesheet" href="css/destyle.css">
<link rel="stylesheet" href="css/style.css">
<script type="text/javascript" src="javascript/pushHand.js"></script>
</head>
<body class="match-back">
	    <main>
        <div class="board">
       
            <div class="yourcard">
	                <div class="hand">
	                	<% for(String card:play1.getHand()){ %>
	                		<img id="card<%= index %>" src="images/<%= card %>" alt="" class="hand<%= index %>" onclick="changeId(<%= index %>)">
	                	<%index = index+1;
	                	} %>
	                </div>
	                <button onclick="pushCard(); pullCard();">卍解！</button>
	            </div>
	            <div class="rightcard">
	                <div class="hand">
	                    <img src="images/card.jpg" alt="" class="hand1"><img src="images/card.jpg" alt="" class="hand2"><img src="images/card.jpg" alt="" class="hand3"><img src="images/card.jpg" alt="" class="hand4"><img src="images/card.jpg" alt="" class="hand5"><img src="images/card.jpg" alt="" class="hand6"><img src="images/card.jpg" alt="" class="hand7"><img src="images/card.jpg" alt="" class="hand8"><img src="images/card.jpg" alt="" class="hand9"><img src="images/card.jpg" alt="" class="hand10"><img src="images/card.jpg" alt="" class="hand11"><img src="images/card.jpg" alt="" class="hand12"><img src="images/card.jpg" alt="" class="hand13">
	                </div>
	            </div>
	            <div class="facecard">
	                <div class="hand">
	                    <img src="images/card.jpg" alt="" class="hand1"><img src="images/card.jpg" alt="" class="hand2"><img src="images/card.jpg" alt="" class="hand3"><img src="images/card.jpg" alt="" class="hand4"><img src="images/card.jpg" alt="" class="hand5"><img src="images/card.jpg" alt="" class="hand6"><img src="images/card.jpg" alt="" class="hand7"><img src="images/card.jpg" alt="" class="hand8"><img src="images/card.jpg" alt="" class="hand9"><img src="images/card.jpg" alt="" class="hand10"><img src="images/card.jpg" alt="" class="hand11"><img src="images/card.jpg" alt="" class="hand12"><img src="images/card.jpg" alt="" class="hand13">
	                </div>
	            </div>
	            <div class="leftcard">
	                <div class="hand">
	                    <img src="images/card.jpg" alt="" class="hand1"><img src="images/card.jpg" alt="" class="hand2"><img src="images/card.jpg" alt="" class="hand3"><img src="images/card.jpg" alt="" class="hand4"><img src="images/card.jpg" alt="" class="hand5"><img src="images/card.jpg" alt="" class="hand6"><img src="images/card.jpg" alt="" class="hand7"><img src="images/card.jpg" alt="" class="hand8"><img src="images/card.jpg" alt="" class="hand9"><img src="images/card.jpg" alt="" class="hand10"><img src="images/card.jpg" alt="" class="hand11"><img src="images/card.jpg" alt="" class="hand12"><img src="images/card.jpg" alt="" class="hand13">
	                </div>
	            </div>
            
            <div class="field" id="test"></div>
        </div>
    </main>
</body>
</html>