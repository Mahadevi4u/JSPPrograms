<%@ page import="java.util.Date,java.util.ArrayList" %>
<%! 
Date d = null;
String date="";
ArrayList<Integer> al = new ArrayList<>();
%>

<% d = new Date();
  date = d.toString();
  al.add(20);
  al.add(40);
  al.add(46);
  al.add(56);
  %>
  <html>
  <head>
  <body>
      <h1>The Date is : <%= date %></h1>
      <h2>The Array Elements are : <%=al %></h2>
  </body>
  </head>
  </html>