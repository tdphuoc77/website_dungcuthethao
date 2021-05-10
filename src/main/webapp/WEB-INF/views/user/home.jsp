<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<title>Trang chủ</title>
<body>
	<section id="slider">
		<!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0"
								class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>

						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1>
										<span>E</span>-SHOPPER
									</h1>
									<h2>Free E-Commerce Template</h2>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing
										elit, sed do eiusmod tempor incididunt ut labore et dolore
										magna aliqua.</p>
									<button type="button" class="btn btn-default get">Get
										it now</button>
								</div>
								<div class="col-sm-6">
									<img src="<c:url value="/resources/images/user/girl2.jpg"/>"
										class="girl img-responsive" alt="" /> <img
										src="images/home/pricing.png" class="pricing" alt="" />
								</div>
							</div>

						</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs"
							data-slide="prev"> <i class="fa fa-angle-left"></i>
						</a> <a href="#slider-carousel"
							class="right control-carousel hidden-xs" data-slide="next"> <i
							class="fa fa-angle-right"></i>
						</a>
					</div>

				</div>
			</div>
		</div>
	</section>
	<!--/slider-->

	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Danh mục</h2>
						<div class="panel-group category-products" id="accordian">
							<!--category-productsr-->
							<c:forEach items="${dsDanhMuc}" var="item">
								<div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#accordian"
												href="#${item.id}"> <span class="badge pull-right"><i
													class="fa fa-plus"></i></span> ${item.ten}
											</a>
										</h4>
									</div>
									<div id="${item.id}" class="panel-collapse collapse">
										<div class="panel-body">
											<ul>
												<li><a href="#">Nike </a></li>
												<li><a href="#">Under Armour </a></li>
												<li><a href="#">Adidas </a></li>
												<li><a href="#">Puma</a></li>
												<li><a href="#">ASICS </a></li>
											</ul>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
						<!--/category-products-->

						<div class="brands_products">
							<!--brands_products-->
							<h2>Thương hiệu</h2>
							<div class="brands-name">
								<ul class="nav nav-pills nav-stacked">
									<li><a href="#"> <span class="pull-right">(50)</span>Acne
									</a></li>
									<li><a href="#"> <span class="pull-right">(56)</span>Grüne
											Erde
									</a></li>
									<li><a href="#"> <span class="pull-right">(27)</span>Albiro
									</a></li>
									<li><a href="#"> <span class="pull-right">(32)</span>Ronhill
									</a></li>
									<li><a href="#"> <span class="pull-right">(5)</span>Oddmolly
									</a></li>
									<li><a href="#"> <span class="pull-right">(9)</span>Boudestijn
									</a></li>
									<li><a href="#"> <span class="pull-right">(4)</span>Rösch
											creative culture
									</a></li>
								</ul>
							</div>
						</div>
						<!--/brands_products-->

						<div class="price-range">
							<!--price-range-->
							<h2>Khoảng giá</h2>
							<div class="well text-center">
								<input type="text" class="span2" value="" data-slider-min="0"
									data-slider-max="600" data-slider-step="5"
									data-slider-value="[250,450]" id="sl2"><br /> <b
									class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
							</div>
						</div>
						<!--/price-range-->

						<div class="shipping text-center">
							<!--shipping-->
							<img src="images/home/shipping.jpg" alt="" />
						</div>
						<!--/shipping-->

					</div>
				</div>

				<div class="col-sm-9 padding-right">
					<div class="features_items">
						<!--features_items-->
						<h2 class="title text-center">Sản phẩm nổi bật</h2>
						<c:forEach items="${dsSanPham}" var="item">
							<div class="col-sm-4">
								<div class="product-image-wrapper">
									<div class="single-products">
										<div class="productinfo text-center">
											<img
												src=" <c:url value ="/resources/images/user/sanpham1.jpg"/> "
												alt="" />
											<h2>$${item.gia}</h2>
											<p>${item.ten}</p>
											<a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
										</div>
										<%-- <div class="product-overlay">
											<div class="overlay-content">
												<h2>$${item.gia}</h2>
												<p>${item.ten}</p>
												<a href="#" class="btn btn-default add-to-cart"><i
													class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
											</div>
										</div> --%>
									</div>
								</div>
							</div>
						</c:forEach>

					</div>
					<!--features_items-->

					<div class="recommended_items">
						<!--recommended_items-->
						<h2 class="title text-center">Gợi ý sản phẩm</h2>

						<div id="recommended-item-carousel" class="carousel slide"
							data-ride="carousel">
							<div class="carousel-inner">
								<div class="item active">
									<c:forEach items="${dsSanPham}" var="item">
										<div class="col-sm-4">
											<div class="product-image-wrapper">
												<div class="single-products">
													<div class="productinfo text-center">
														<img
															src=" <c:url value="/resources/images/user/recommend1.jpg"/>"
															alt="" />
														<h2>${item.gia}</h2>
														<p>${item.ten}</p>
														<a href="#" class="btn btn-default add-to-cart"><i
															class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
													</div>

												</div>
											</div>
										</div>
									</c:forEach>
								</div>
								<div class="item">
									<c:forEach items="${dsSanPham}" var="item">
										<div class="col-sm-4">
											<div class="product-image-wrapper">
												<div class="single-products">
													<div class="productinfo text-center">
														<img
															src=" <c:url value="/resources/images/user/recommend1.jpg"/>"
															alt="" />
														<h2>$56</h2>
														<p>Easy Polo Black Edition</p>
														<a href="#" class="btn btn-default add-to-cart"><i
															class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
													</div>

												</div>
											</div>
										</div>
									</c:forEach>

								</div>
							</div>
							<a class="left recommended-item-control"
								href="#recommended-item-carousel" data-slide="prev"> <i
								class="fa fa-angle-left"></i>
							</a> <a class="right recommended-item-control"
								href="#recommended-item-carousel" data-slide="next"> <i
								class="fa fa-angle-right"></i>
							</a>
						</div>
					</div>
					<!--/recommended_items-->

				</div>
			</div>
		</div>
	</section>
</body>
