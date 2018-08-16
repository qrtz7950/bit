<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equals("POST")){
		request.setCharacterEncoding("utf-8");
	}
%>
name = ${ param.name }