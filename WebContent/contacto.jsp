<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Contact us</title>
<s:include value="/head.jsp" />
</head>
<body>
	<s:include value="/header.jsp" />
	<!-- ======= Contact Section ======= -->
	<section id="contact" class="contact section-bg">
		<div class="container">

			<div class="section-title">
				<h2>Contact</h2>
				<p>Magnam dolores commodi suscipit. Necessitatibus eius
					consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit.
					Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit
					alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="info-box mb-4">
						<i class="bx bx-map"></i>
						<h3>Our Address</h3>
						<p>Paseo de Francia, 1 - Donostia</p>
					</div>
				</div>

				<div class="col-lg-3 col-md-6">
					<div class="info-box  mb-4">
						<i class="bx bx-envelope"></i>
						<h3>Email Us</h3>
						<p>contact@example.com</p>
					</div>
				</div>

				<div class="col-lg-3 col-md-6">
					<div class="info-box  mb-4">
						<i class="bx bx-phone-call"></i>
						<h3>Call Us</h3>
						<p>943 392 669 669</p>
					</div>
				</div>

			</div>

			<s:div class="row">

				<s:div cssClass="col-lg-6">
					<iframe class="mb-4 mb-lg-0"
						src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2902.6610765767955!2d-1.9790086850910715!3d43.32135388184444!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd51a55ac5d48469%3A0xc2ba7257fbeb191f!2sPaseo%20de%20Francia%2C%201%2C%2020012%20San%20Sebasti%C3%A1n%2C%20Guip%C3%BAzcoa!5e0!3m2!1ses!2ses!4v1592559807042!5m2!1ses!2ses"
						style="border: 0; width: 100%; height: 384px;"></iframe>
				</s:div>
				<!-- Here comes the magic form -->
				<s:div cssClass="col-lg-6">
					<s:form action="enviarEmail" method="POST" theme="simple"
						cssClass="php-email-form">
						<s:div cssClass="form-row">
							<s:div cssClass="col-md-6 form-group">
								<s:textfield name="correo.name" id="name"
									cssClass="form-control" placeholder="Your name" />
							</s:div>
							<s:div cssClass="col-md-6 form-group">
								<s:textfield name="correo.email" cssClass="form-control"
									id="email" placeholder="Your Email" />
							</s:div>
						</s:div>
						<s:div cssClass="form-row">
							<s:div cssClass="col-md-6 form-group">
								<s:textfield name="correo.tel" cssClass="form-control" id="tel"
									placeholder="Your phone number" />
							</s:div>
							<s:div cssClass="col-md-6 form-group">
								<s:url var="urlServicios" action="cargarServicios" />
								<sj:select cssClass="form-control" href="%{urlServicios}"
									id="lstServicios" name="correo.subject" listKey="nombre"
									listValue="nombre" list="lista" headerKey="-1"
									headerValue="- Select a service -" />
							</s:div>
						</s:div>
						<s:div class="form-group">
							<s:textarea name="correo.message" rows="5"
								cssClass="form-control" id="message" placeholder="Message" />
						</s:div>
						<s:div class="text-center">
							<s:submit value="Send Message" name="submit"
								cssClass="btn btn-info" />
						</s:div>
					</s:form>
				</s:div>

			</s:div>

		</div>
	</section>
	<!-- End Contact Section -->
	<s:include value="/footer.jsp" />
	<s:include value="/scripts.jsp" />
</body>
</html>