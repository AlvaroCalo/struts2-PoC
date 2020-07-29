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
			<h1>Servicio seleccionado</h1>
			<s:url var="urlServicios" action="cargarUnServicio2">
			<!--<s:param name="id"><s:property value="id"/></s:param>  retomar aquí -->
			<s:param name="id" value="%{id}"/>
			</s:url>
			
			<sjg:grid id="gridServicios" name="gridServicios"
				dataType="json" href="%{urlServicios}" gridModel="lista" width="1000"
				caption="Lista de servicios" pager="true" rowList="10,20,30">

				<sjg:gridColumn name="id" id="id" title="Código"
					sortable="true" width="50" align="center" />

				<sjg:gridColumn name="nombre" id="nombre"
					title="Nombre" sortable="true" align="center" />

				<sjg:gridColumn name="descripcion" id="descripcion"
					title="Descripcion" sortable="true" width="500" align="center" />

				<sjg:gridColumn name="precio" id="precio"
					title="Precio" sortable="true" align="center" />

			</sjg:grid>

		</div>
	</section>
	<!-- End Services Section -->
	<s:include value="/footer.jsp" />
	<script>
		
	</script>
	<s:include value="/scripts.jsp" />
</body>
</html>