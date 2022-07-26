<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isThreadSafe="false"%>
<%
try{
	System.out.println(Thread.currentThread().getName());
	Thread.sleep(1000);
	System.out.println(Thread.currentThread().getName());
	
}catch(Exception e){
	e.printStackTrace();
}
%>

