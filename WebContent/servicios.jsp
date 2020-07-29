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
				<h2>Services</h2>
				<p>Magnam dolores commodi suscipit. Necessitatibus eius
					consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit.
					Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit
					alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
			</div>

			<s:url var="urlServicios" action="cargarServicios" />

			<sjg:grid id="gridServicios" name="gridServicios" dataType="json"
				href="%{urlServicios}" gridModel="lista" width="1000"
				caption="Lista de productos" pager="true" rowList="10,20,30">

				<sjg:gridColumn name="id" id="id" title="Código" sortable="true" width="50"
					align="center" />

				<sjg:gridColumn name="nombre" id="nombre" title="Nombre"
					sortable="true" align="center" />

				<sjg:gridColumn name="descripcion" id="Descripcion"
					title="Descripcion" sortable="true" align="center" width="500"/>

				<sjg:gridColumn name="precio" id="precio" title="Precio"
					sortable="true" align="center" />

				<sjg:gridColumn name="botonera" id="botonera" title="Acciones"
					align="center" formatter="formatlink" width="220" />

			</sjg:grid>

		</div>
	</section>
	<!-- End Services Section -->
	<s:include value="/footer.jsp" />
	<script>
		function formatlink(cellvalue, options, rowObject) {
			var html = '<a href="#" class="btn btn-warning" title="Ver" onclick="javascript:ver('
					+ rowObject.id + ')">Ver</a> ';
			html += '<a href="#" class="btn btn-success" title="Editar" onclick="javascript:editar('
					+ rowObject.id + ')">Editar</a> ';
			html += '<a href="#" class="btn btn-danger" title="Borrar" onclick="javascript:borrar('
					+ rowObject.id + ')">Borrar</a> ';
			return html;
		}

		function ver(id) {
			console.log(id);
			window.location = "cargarUnServicio.action?id=" + id;
		}

		function borrar(id) {
			console.log(id);
			if (window.confirm("¿Seguro que quieres eliminar el produco" + id
					+ "?"))
				window.location = "eliminarServicio.action?ideliminar=" + id;
		}

		function editar(id) {
			console.log(id);
			window.location = "datosServicio.action?serviceid=" + id;
		}
	</script>
	<s:include value="/scripts.jsp" />
</body>
</html>