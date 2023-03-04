<%-- 
    Document   : process
    Created on : 15 Apr, 2021, 6:47:12 PM
    Author     : Smit
--%>

<%@page import="bean.RegisterDao"%>  
<jsp:useBean id="obj" class="bean.User"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
    int status=RegisterDao.register(obj);  
    if(status>0)  
    out.print("You are successfully registered");  
%>  