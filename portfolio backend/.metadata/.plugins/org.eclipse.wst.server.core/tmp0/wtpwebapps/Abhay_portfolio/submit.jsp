

<%@page import="com.files.SaveRecords2"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%--  <jsp:bean id="recived" class="com.files.entites.recivedPersistenet"/> --%>
     <jsp:useBean id="recived" class="com.files.entites.recivedPersistenet"/>
     <jsp:setProperty  name="recived" property="*"/>
   
     
 <%
     PrintWriter pw=response.getWriter();
/*  pw.print(recived);
 System.out.println(recived); */
     
     SaveRecords2 sr=new SaveRecords2();
     int status=sr.data(recived);
     response.setContentType("text/html");
    
     
     if(status!=0){
    	 pw.print("Feedback saved Successfully!!");
    	 request.getRequestDispatcher("index.jsp").include(request,response);
    	 %>
    	 <br>
    	 <%
     }
     else if(status==0)
    		pw.print("record does not saved!!");
    	%>
    	<br>
    	<% 
    	    request.getRequestDispatcher("index.jsp").include(request, response);
    	%>

</body>
</html>