<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Đăng nhập</title>
<body class="bg-primary">
	<div id="layoutAuthentication">
		<div id="layoutAuthentication_content">
			<main>
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-5">
						<c:if test="${param.incorrectAccount != null}">
							<div class="alert alert-danger">Tên đăng nhập hoặc mật khẩu
								không hợp lệ</div>
						</c:if>
						<c:if test="${param.accessDenied != null}">
							<div class="alert alert-danger">you Not authorize</div>
						</c:if>
						<div class="card shadow-lg border-0 rounded-lg mt-5">
							<div class="card-header">
								<h3 class="text-center font-weight-light my-4">Đăng nhập</h3>
							</div>
							<div class="card-body">
								<form action="j_spring_security_check" method="post">
									<div class="form-group">
										<label class="small mb-1" for="inputEmailAddress">Tài
											khoản</label> <input class="form-control py-4" id="inputEmailAddress"
											type="text" placeholder="Nhập tài khoản" name="j_username" />
									</div>
									<div class="form-group">
										<label class="small mb-1" for="inputPassword">Mật Khẩu</label>
										<input class="form-control py-4" id="inputPassword"
											type="password" placeholder="Nhập mật khẩu" name="j_password" />
									</div>
									<!-- <div class="form-group">
										<div class="custom-control custom-checkbox">
											<input class="custom-control-input"
												id="rememberPasswordCheck" type="checkbox" /> <label
												class="custom-control-label" for="rememberPasswordCheck">Nhớ
												tài khoản</label>
										</div>
									</div> -->
									<div
										class="form-group d-flex align-items-center justify-content-between mt-4 mb-0">
										<a class="small" href='<c:url value="tim-tai-khoan"/>'>Quyên mật khẩu?</a>
										<button type="submit" class="btn btn-primary">Đăng nhập</button>
									</div>
								</form>
							</div>
							<div class="card-footer text-center">
								<div class="small">
									<a href='<c:url value="dangky"/>'>Chưa có tài khoản? Đăng ký ngay!</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			</main>
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