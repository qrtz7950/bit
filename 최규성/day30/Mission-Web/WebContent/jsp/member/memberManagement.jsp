<%@page import="util.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] memberList = request.getParameterValues("member");
	String type = request.getParameter("manage");
	
	MemberDAO dao = new MemberDAO();
	
	switch (type) {
	case "삭제" :
		for(int i = 0; i<memberList.length; i++) {
			dao.deleteMember(memberList[i]);
		}
	break;
	
	case "등업" :
		for(int i = 0; i<memberList.length; i++) {
			dao.promoteMember(memberList[i]);
		}
	break;
	
	case "강등" :
		for(int i = 0; i<memberList.length; i++) {
			dao.demotionMember(memberList[i]);
		}	
	break;
}
%>
<script>
	location.href="memberlist.jsp";
</script>
