<%@page contentType="text/html; charset=UTF-8" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/style.css">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp" %>

<c:choose>
    <c:when test="${cart.size()>0}">
        <p>${cart.size()}種類の商品があります。</p>
        <p><a href="product.jsp">ショッピングを続ける</a></p>
        <hr>
    </c:when>
    <c:otherwise>
        <p>カートに商品がありません。</p>
    </c:otherwise>
</c:choose>

<table style="border-collapse:separate;border-spacing:10px;">
<c:forEach var="item" items="${cart}">
    <tr>
        <td>商品${item.product.id}</td>
        <td><img src="image/${item.product.id}.jpg" height="96"></td>
        <td>${item.product.name}</td>
        <td>${item.price}円</td>
        <td>数量:${item.count}</td>
        <td>
            <select onChange="location.href=value;">
                <option value="">数量変更</option>
                    <c:forEach var="i" begin="1" end="30">
                        <option value="CartChange.action?id=${item.product.id}&count=${i}&price=${item.product.price}">${i}</option>
                    </c:forEach>
            </select>
        </td>
        <td><a href="CartRemove.action?id=${item.product.id}">
            カートから削除</a></td>
    </tr>
</c:forEach>
</table>

<c:choose>
    <c:when test="${cart.size()>0}">
        <c:set var="priceTotal" value="${0}"/>
        <c:forEach var="item" items="${cart}">
            <c:set var="priceTotal" value="${priceTotal + item.price}"/>
        </c:forEach>
        合計金額 ${priceTotal}
        <hr>
    </c:when>
    <c:otherwise>
        <p></p>
    </c:otherwise>
</c:choose>

<%@include file="../footer.html" %>
