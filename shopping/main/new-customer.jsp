<%@page contentType="text/html; charset=UTF-8"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../header.html"%>
<%@include file="menu.jsp"%>

<h2>ベーカリーアカウントの作成</h2>
<hr>

<p>以下の情報を入力してください。</p>

<form action="Customer.action" method="post">
    <p>おなまえ <input type="text" name="name"></p>
    <p>ご住所 <input type="text" name="address"></p>
    <p>電話番号 <input type="text" name="number"></p>
    <p>ログイン名 <input type="text" name="login"></p>
    <p>パスワード <input type="password" name="password"></p>
    <p><input type="submit" value="作成する"></p>
</form>

<%@include file="../footer.html"%>