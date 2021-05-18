<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title><decorator:title /></title>

    <!-- Icons font CSS-->
   <link href="<c:url value="/resources/dangky/vendor/mdi-font/css/material-design-iconic-font.min.css"/>" rel="stylesheet" media="all">
     <link href="<c:url value="/resources/dangky/vendor/font-awesome-4.7/css/font-awesome.min.css"/>" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="<c:url value="/resources/dangky/vendor/select2/select2.min.css"/>" rel="stylesheet" media="all">
	<link href="<c:url value="/resources/dangky/vendor/datepicker/daterangepicker.css"/>" rel="stylesheet" media="all">
    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">
	<link href="<c:url value="/resources/dangky/css/main.css"/>" rel="stylesheet" media="all">

</head>
<body>

	<decorator:body />
	
<!-- Jquery JS-->
    <script src="<c:url value="/resources/dangky/vendor/jquery/jquery.min.js"/>"></script>
    <!-- Vendor JS-->
    <script src="<c:url value="/resources/dangky/vendor/select2/select2.min.js"/>"></script>

    <script src="<c:url value="/resources/dangky/vendor/datepicker/moment.min.js"/>"></script>

    <script src="<c:url value="/resources/dangky/vendor/datepicker/daterangepicker.js"/>"></script>

    <!-- Main JS-->

    <script src="<c:url value="/resources/dangky/js/global.js"/>"></script>
</body>
</html>