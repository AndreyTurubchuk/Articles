<%--
 Форма поиска из таблицы: Types
 На экран выводится список типов статей ы форме комбобокса
 Поиск по названию типа Статьи
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Статьи</title>
    </head>
<body>
<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<style>
    body {
        padding-top: 1em;
    }
</style>

<div class="container">
  <sf:form method="post" id="articleForm" action="/search">
     <div class="form-group">
        <label for="inputType" class="control-label col-sm-3">Тип статьи</label>
        <div class="col-sm-8">
            <select name="articlesTypeId" id="inputType" class="form-control">
                <c:forEach items="${articlesTypesList}" var="articleType">
                    <option value="${articleType.typeId}">
                        <c:out value="${articleType.typeName}"/>
                    </option>
                </c:forEach>
            </select>
        </div>
     </div>

     <div class="container">
         <a href="#" onclick="document.forms['articleForm'].submit();" class="btn-save pull-left">ПОИСК</a>

     </div>
  </sf:form>
</div>
</body>
</html>
