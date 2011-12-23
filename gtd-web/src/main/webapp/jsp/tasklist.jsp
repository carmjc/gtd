<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<s:url value="/css/base.css"/>">
<title>Task List</title>
</head>
<body>
<ul>
	<s:iterator value="stuffs" var="stuff">
		<li>
			<s:iterator value="#stuff.tags" var="tag"><span class="tag"><s:property value="#tag.name" /></span> </s:iterator>
			<span class="stuff"><s:property value="#stuff.name" /></span>
		</li>	
	</s:iterator>
</ul>
</body>
</html>