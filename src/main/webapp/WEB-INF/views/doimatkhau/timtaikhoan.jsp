<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>Đăng nhập</title>
<body class="bg-primary">
	<div id="layoutAuthentication">
		<div id="layoutAuthentication_content">
			
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-lg-5">
							<div class="card-body">
								<form:form action="tim-tai-khaon" method="post">
									<div class="form-group">
									<form:label cssClass="small mb-1" path="">Tên tài khoản</form:label>
					
										<form:input cssClass="form-control py-4" id="inputEmailAddress"
											type="text" placeholder="Nhập tài khoản" path="tenDangNhap" />
									</div>
									<div
										class="form-group d-flex align-items-center justify-content-between mt-4 mb-0">
										<button type="submit" class="btn btn-primary">Tìm tài khoản</button>
									</div>
								</form:form>
							</div>
							<div class="card-footer text-center">
								<div class="small">
									<a href='<c:url value="dangky"/>'>Chưa có tài khoản? Đăng
										ký ngay!</a>
								</div>
							</div>
						</div>
					</div>
				</div>
		</div>
		
	</div>
	<div id="layoutAuthentication_footer">
		<footer class="py-4 bg-light mt-auto">
			<div class="container-fluid">
				<div class="d-flex align-items-center justify-content-between small">
					<div class="text-muted">Copyright &copy; Your Website 2021</div>
					<div>
						<a href="#">Privacy Policy</a> &middot; <a href="#">Terms
							&amp; Conditions</a>
					</div>
				</div>
			</div>
		</footer>
	</div>
	</div>
</body>
</html>