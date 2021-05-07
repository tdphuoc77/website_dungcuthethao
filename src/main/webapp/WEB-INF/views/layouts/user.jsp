<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title><decorator:title/></title>
<link href='<c:url value="/resources/user/css/bootstrap.min.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/user/css/font-awesome.min.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/user/css/prettyPhoto.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/user/css/price-range.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/user/css/animate.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/user/css/main.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/user/css/responsive.css"/>' rel="stylesheet">
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    
<link rel="shortcut icon" href='<c:url value="/resources/user/images/ico/favicon.ico"/>'>
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="images/ico/apple-touch-icon-57-precomposed.png">
</head>
<!--/head-->
<body>
	<%@include file="/WEB-INF/views/layouts/user/header.jsp"%>
	
	<decorator:body/>

	<%@include file="/WEB-INF/views/layouts/user/footer.jsp"%>
	
	<script src=" <c:url value="/resources/user/js/jquery.js"/> "></script>
	<script src=" <c:url value="/resources/user/js/price-range.js"/> "></script>
	<script src=" <c:url value="/resources/user/js/jquery.scrollUp.min.js"/> "></script>
	<script src=" <c:url value="/resources/user/js/bootstrap.min.js"/> "></script>
	<script src=" <c:url value="/resources/user/js/jquery.prettyPhoto.js"/> "></script>
	<script src=" <c:url value="/resources/user/js/main.js"/> "></script>
</body>
</html>
