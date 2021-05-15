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
<title><decorator:title /></title>

<link rel="icon" type="image/png" href="images/favicon.png">
<!-- Web Font -->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap"
	rel="stylesheet">

<!-- StyleSheet -->

<!-- Bootstrap -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/bootstrap.css"/>">
<!-- Magnific Popup -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/magnific-popup.min.css"/>">
<!-- Font Awesome -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/font-awesome.css"/>">
<!-- Fancybox -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/jquery.fancybox.min.css"/>">
<!-- Themify Icons -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/themify-icons.css"/>">
<!-- Nice Select CSS -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/niceselect.css"/>">
<!-- Animate CSS -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/animate.css"/>">
<!-- Flex Slider CSS -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/flex-slider.min.css"/>">
<!-- Owl Carousel -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/owl-carousel.css"/>">
<!-- Slicknav -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/slicknav.min.css"/>">

<!-- Eshop StyleSheet -->
<link rel="stylesheet" href="<c:url value="/resources/user/css/reset.css"/>">

<link rel="stylesheet" href="<c:url value="/resources/user/css/responsive.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/user/style.css"/>">
</head>
<!--/head-->
<body>
	<%@include file="/WEB-INF/views/layouts/nguoidung/header.jsp"%>

	<decorator:body />

	<%@include file="/WEB-INF/views/layouts/nguoidung/footer.jsp"%>

	<!-- Jquery -->
	<script src="<c:url value="/resources/user/js/jquery.min.js"/>"></script>
	<script src="<c:url value="/resources/user/js/jquery-migrate-3.0.0.js"/>"></script>
	<script src="<c:url value="/resources/user/js/jquery-ui.min.js"/>"></script>
	<!-- Popper JS -->
	<script src="<c:url value="/resources/user/js/popper.min.js"/>"></script>
	<!-- Bootstrap JS -->
	<script src="<c:url value="/resources/user/js/bootstrap.min.js"/>"></script>
	<!-- Color JS -->
	<script src="<c:url value="/resources/user/js/colors.js"/>"></script>
	<!-- Slicknav JS -->
	<script src="<c:url value="/resources/user/js/slicknav.min.js"/>"></script>
	<!-- Owl Carousel JS -->
	<script src="<c:url value="/resources/user/js/owl-carousel.js"/>"></script>
	<!-- Magnific Popup JS -->
	<script src="<c:url value="/resources/user/js/magnific-popup.js"/>"></script>
	<!-- Waypoints JS -->
	<script src="<c:url value="/resources/user/js/waypoints.min.js"/>"></script>
	<!-- Countdown JS -->
	<script src="<c:url value="/resources/user/js/finalcountdown.min.js"/>"></script>
	<!-- Nice Select JS -->
	<script src="<c:url value="/resources/user/js/nicesellect.js"/>"></script>
	<!-- Flex Slider JS -->
	<script src="<c:url value="/resources/user/js/flex-slider.js"/>"></script>
	<!-- ScrollUp JS -->
	<script src="<c:url value="/resources/user/js/scrollup.js"/>"></script>
	<!-- Onepage Nav JS -->
	<script src="<c:url value="/resources/user/js/onepage-nav.min.js"/>"></script>
	<!-- Easing JS -->
	<script src="<c:url value="/resources/user/js/easing.js"/>"></script>
	<!-- Active JS -->
	<script src="<c:url value="/resources/user/js/active.js"/>"></script>
</body>
</html>
