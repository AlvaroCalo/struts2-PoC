<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Services</title>
<s:include value="/head.jsp" />
</head>
<body>
	<s:include value="/header.jsp" />
	<!-- ======= Services Section ======= -->
	<section id="services" class="services">
		<div class="container">

			<div class="section-title">
				<h2>CAMBIAR Services</h2>
				<p>Magnam dolores commodi suscipit. Necessitatibus eius
					consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit.
					Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit
					alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
			</div>

			<s:url var="urlServicios" action="cargarServicios" />

			<sjg:grid cssClass="row" id="gridServicios" name="gridServicios"
				dataType="json" href="%{urlServicios}" gridModel="lista"
				caption="Lista de productos" pager="true" rowList="10,20,30">

				<sjg:gridColumn cssClass="col" name="id" id="id" title="Código"
					sortable="true" width="200" align="center" />

				<sjg:gridColumn cssClass="col" name="nombre" id="nombre"
					title="Nombre" sortable="true" width="200" align="center" />

				<sjg:gridColumn cssClass="col" name="descripcion" id="Descripcion"
					title="Descripcion" sortable="true" width="200" align="center" />

				<sjg:gridColumn cssClass="col" name="precio" id="precio"
					title="Precio" sortable="true" width="200" align="center" />

			</sjg:grid>
			
			<div class="row">
				<div class="col">
					<s:form action="cambiarServicio" method="POST" theme="simple"
						cssClass="php-email-form p-3">

						<fieldset>
							<legend>Update service</legend>
							
							<s:div cssClass="col-md-6 form-group">
								<label for="serviceid">Id to change</label>
								<sj:textfield id="serviceid" name="serviceid"
									cssClass="form-control" />
							</s:div>
							
							<s:div cssClass="col-md-6 form-group">
								<label for="servicename">Service name</label>
								<sj:textfield id="servicename" name="servicename"
									cssClass="form-control" />
							</s:div>

							<s:div cssClass="col-md-6 form-group">
								<label for="servicedesc">Service description</label>
								<sj:textfield id="servicedesc" name="servicedesc"
									cssClass="form-control" />
							</s:div>

							<s:div cssClass="col-md-6 form-group">
								<label for="serviceprice">Service price</label>
								<sj:textfield id="serviceprice" name="serviceprice"
									cssClass="form-control" />
							</s:div>

							<s:div cssClass="col-md-6 form-group">
								<button id="btnAdd" class="btn btn-primary m-2">Update!</button>
							</s:div>

						</fieldset>

					</s:form>
				</div>
			</div>

		</div>
	</section>
	<!-- End Services Section -->
	<s:include value="/footer.jsp" />
	<s:include value="/scripts.jsp" />
</body>
</html>