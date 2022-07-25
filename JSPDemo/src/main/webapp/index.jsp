<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%!
   int a=4,b=8;
   int c;
   %>
   
   <%c = a+b; %>
   <%=c %>
</body>
</html>
<%@ include file="footer.jsp"%>