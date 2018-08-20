<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("post")){
		request.setCharacterEncoding("utf-8");
	}

	String name = URLDecoder.decode(request.getParameter("name"),"utf-8");
	pageContext.setAttribute("name", name);
%>    

name : ${ param.name }
age : ${ param.age }