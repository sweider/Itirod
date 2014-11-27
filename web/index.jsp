<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 11/25/14
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
  <head>
    <title>HI!</title>
  </head>
  <body>
  <p>aaaa</p>
    <c:choose>
      <c:when test="${contactsList == null}"> NUll</c:when>
      <c:when test="${contactsList.isEmpty()}">Empty!</c:when>
      <c:otherwise><p>size is: ${contactsList.size()}</p></c:otherwise>
    </c:choose>
  </body>
</html>
