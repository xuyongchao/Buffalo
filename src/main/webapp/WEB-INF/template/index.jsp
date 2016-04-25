<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Java Web在线IDE-JideOnline</title>
		<jsp:include page="include.jsp"></jsp:include>
	</head>
	<body class="easyui-layout">
		<div data-options="region:'north'" style="height:68px">
			<jsp:include page="menu.jsp"></jsp:include>
			<jsp:include page="tool.jsp"></jsp:include>
		</div>
		<div data-options="region:'south',title:'输出',split:true" style="height:160px;"></div>
		<div data-options="region:'east',title:'大纲',split:true" style="width:200px;"></div>
		<div data-options="region:'west',title:'项目浏览器',split:true" style="width:200px;"></div>
		<div data-options="region:'center'" style="border: none;">
			<jsp:include page="file_explorer.jsp"></jsp:include>
		</div>
	</body>
</html>