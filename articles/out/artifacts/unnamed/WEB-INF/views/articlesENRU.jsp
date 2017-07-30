<%--
 Отчет: Список ноостей и кол-во официальных и английских текстов, связанных с ними
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Отчет по статьям</title>
</head>
<body>
<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<style>
    body {
        padding-top: 1em;
    }
</style>
    <table class="list-table">
        <thead>
           <th style="width: 3%">НАЗВАНИЕ СТАТЬИ</th>
           <th style="width: 3%">КОЛ-ВО ОФИЦИАЛЬНЫХ ТЕКСТОВ</th>
           <th style="width: 3%">КОЛ-ВО АНГЛИЙСКИХ ТЕКСТОВ</th>
        </thead>
        <tbody>
        <c:forEach items="${articlesENRUList}" var="lists" step="1" varStatus="loopStatus">
            <tr class="${loopStatus.index % 2 == 0 ? 'alt' : ''}">
                <td><c:out value="${lists.articlesNameENRU}"/></td>
                <td><c:out value="${lists.countArticlesRu}"/></td>
                <td><c:out value="${lists.countArticlesEN}"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>


</html>
