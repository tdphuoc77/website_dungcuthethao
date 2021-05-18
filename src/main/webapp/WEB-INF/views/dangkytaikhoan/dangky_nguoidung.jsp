<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
		<div class="wrapper wrapper--w680">
			<div class="card card-4">
				<div class="card-body">
					<h2 class="title">Đăng Ký</h2>
					<form:form method="post" action="dangkytaikhoan"
						modelAttribute="nguoiDungDTONew">
						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">

									<form:label path="" class="label">Họ</form:label>
									<form:input cssClass="input--style-4" type="text" path="ho" />
								</div>
							</div>
							<div class="col-2">
								<div class="input-group">
									<form:label path="" class="label">Tên</form:label>
									<form:input cssClass="input--style-4" type="text" path="ten" />
								</div>
							</div>
						</div>

						<div class="col-4">
							<div class="input-group">
								<form:label class="label" path="">Tên đăng nhập</form:label>
								<form:input cssClass="input--style-4" type="text"
									path="tenDangNhap" />
							</div>
						</div>

						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">
									<form:label path="" class="label">Ngày sinh</form:label>
									<div class="input-group-icon">
										<form:input cssClass="input--style-4 js-datepicker"
											type="text" path="ngaySinh" />
										<i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
									</div>
								</div>
							</div>
							<div class="col-2">
								<div class="input-group">
									<form:label path="" class="label">Giới tính</form:label>
									<div class="p-t-10">
										<form:label path="" class="radio-container">Nam 
										<form:radiobutton value="true" path="gioiTinh" />
											<span Class="checkmark"></span>
										</form:label>
										<form:label path="" class="radio-container">Nữ 
										<form:radiobutton value="false" path="gioiTinh" />
											<span Class="checkmark"></span>
										</form:label>
									</div>
								</div>
							</div>
						</div>
						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">
									<form:label path="" class="label">Email</form:label>
									<form:input cssClass="input--style-4" type="email" path="email" />
								</div>
							</div>
							<div class="col-2">
								<div class="input-group">
									<form:label path="" class="label">Số điện thoại</form:label>
									<form:input cssClass="input--style-4" type="text"
										path="soDienThoai" />
								</div>
							</div>

						</div>


						<div class="col-4">
							<div class="input-group">
								<form:label path="" class="label">Địa chỉ</form:label>
								<form:input cssClass="input--style-4" type="text"
									path="dsDiaChi" />
							</div>
						</div>
						
						<div class="col-4">
							<div class="input-group">
								<form:label path="" class="label">Mật khẩu</form:label>
								<form:password cssClass="input--style-4" path="matKhau" />
							</div>
						</div>
						<div class="col-4">
							<div class="input-group">
								<form:label path="" class="label">Mật khẩu</form:label>
								<form:password cssClass="input--style-4" path="matKhau" />
							</div>
						</div>

						<div class="p-t-15">
							<button class="btn btn--radius-2 btn--blue" type="submit">Đăng
								ký</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>