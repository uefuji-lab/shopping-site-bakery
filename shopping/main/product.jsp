<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp" %>


<p>検索キーワードを入力してください。</p>
<form action="Product.action" method="post">
<input type="text" name="keyword">
<input type="submit" value="検索">
</form>
<hr>

<table style="border-collapse:separate;border-spacing:10px;">
<c:forEach var="product" items="${list}">
    <tr>
        <td>商品${product.id}</td>
        <td><img src="image/${product.id}.jpg" height="64"></td>
        <td>${product.name}</td>
        <td>${product.price}円</td>
        <td>
            数量
            <select onChange="location.href=value;">
            <option value="">数量選択</option>
                <c:forEach var="i" begin="1" end="30">
                    <option value="CartAdd.action?id=${product.id}&count=${i}&price=${product.price}">${i}</option>
                </c:forEach>
            </select>
        </td>
    </tr>
</c:forEach>
※プルダウン選択時、カートに追加します。
</table>

<%@include file="../footer.html" %>

<intput type="button" onclick="location.href='[遷移先]">


