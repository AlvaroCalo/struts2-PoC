<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- ======= Header ======= -->
<header id="header" class="header-transparent">
	<div class="container d-flex align-items-center">

		<div class="logo mr-auto">
			<h1 class="text-light">
				<a href="index.html"><span style="color: black;">SurfDonostia</span></a>
			</h1>
			<!-- Uncomment below if you prefer to use an image logo -->
			<!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
		</div>

		<nav class="nav-menu d-none d-lg-block">
			<ul>
				<li class="active"><a href="<s:url value="inicio"/>">Home</a></li>
				<li><a href="<s:url value="quien"/>">About Us</a></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Services</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="<s:url value="servicios"/>">Learn more</a>
						<a class="dropdown-item" href="<s:url value="anadirServicios"/>">Add services</a>
					</div>
					</li>

				<li><a href="<s:url value="contacto"/>">Contact us</a></li>
			</ul>
		</nav>
		<!-- .nav-menu -->

	</div>
</header>
<!-- End Header -->