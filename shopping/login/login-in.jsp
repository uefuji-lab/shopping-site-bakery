<%@page contentType="text/html; charset=UTF-8"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style.css">
<%@include file="../header.html"%>
<%@include file="../main/menu.jsp"%>

<form action="Login.action" method="post">
<p>ログイン名<input type="text" name="login"></p>
<p>パスワード<input type="password" name="password"></p>
<p><input type="submit" value="ログイン"></p>
</form>

<%@include file="../footer.html"%>