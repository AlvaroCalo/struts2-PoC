package com.web.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ServiciosDAO {

	public ArrayList<Servicios> listadoServiciosDAO() {

		ArrayList<Servicios> services = new ArrayList<Servicios>();

		// Variables de conexión
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// Llamada a la conexion
		conn = Conexion.conn();

		String sql = "SELECT codigo, nombre, descripcion, precio FROM servicios";
		try {
			pstmt = conn.prepareStatement(sql);
			// si estuviese ?? irian aquí los parámetros
			rs = pstmt.executeQuery();
			// recorreriendo
			while (rs.next()) {
				Servicios servi = new Servicios();
				servi.setId(rs.getInt(1)); // o el nombre o la posicion
				servi.setNombre(rs.getString(2));
				servi.setDescripcion(rs.getString(3));
				servi.setPrecio(rs.getDouble(4));

				services.add(servi);
			}

			if (rs != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
			if (pstmt != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
			if (pstmt != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
		}

		return services;

	}

	public boolean eliminarServiciosDAO(int id) {

		boolean exito = false;

		// Variables de conexion
		Connection conn = null;
		PreparedStatement pstmt = null;

		// llamo a la conexion
		conn = Conexion.conn();
		String sql = "DELETE FROM servicios WHERE Codigo=?";

		try {
			pstmt = conn.prepareStatement(sql);
			// parametros
			pstmt.setInt(1, id);

			if (pstmt.executeUpdate() > 0) // Insert, delete y update
				exito = true;

			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException logIgnore) {
				}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);

		} finally {

			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException logIgnore) {
				}
		}
		return exito;
	}

	public boolean anadirServiciosDAO(String nombre, String desc, double pre) {

		boolean exito = false;

		// Variables de conexion
		Connection conn = null;
		PreparedStatement pstmt = null;

		// llamo a la conexion
		conn = Conexion.conn();
		String sql = "INSERT INTO servicios (Nombre, Descripcion, Precio) VALUES (?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			// parametros
			pstmt.setString(1, nombre);
			pstmt.setString(2, desc);
			pstmt.setDouble(3, pre);

			if (pstmt.executeUpdate() > 0) // Insert, delete y update
				exito = true;

			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException logIgnore) {
				}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);

		} finally {

			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException logIgnore) {
				}
		}
		return exito;
	}

	public boolean cambiarServiciosDAO(int id, String nombre, String desc, double pre) {
		boolean exito = false;

		// Variables de conexion
		Connection conn = null;
		PreparedStatement pstmt = null;

		// llamo a la conexion
		conn = Conexion.conn();
		String sql = "UPDATE servicios SET Nombre=?, Descripcion=?, Precio=? WHERE Codigo=?";

		try {
			pstmt = conn.prepareStatement(sql);
			// parametros
			pstmt.setString(1, nombre);
			pstmt.setString(2, desc);
			pstmt.setDouble(3, pre);
			pstmt.setInt(4, id);

			if (pstmt.executeUpdate() > 0) // Insert, delete y update
				exito = true;

			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException logIgnore) {
				}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);

		} finally {

			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException logIgnore) {
				}
		}
		return exito;
	}

	public Servicios cargarUnServicioDAO(int id) {

		Servicios service = new Servicios();

		// Variables de conexión
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// Llamada a la conexion
		conn = Conexion.conn();

		String sql = "SELECT Codigo, Nombre, Descripcion, Precio FROM servicios WHERE Codigo=?";
		try {
			pstmt = conn.prepareStatement(sql);
			// si estuviese ?? irian aquí los parámetros
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			// recorreriendo
			while (rs.next()) {
				service.setId(rs.getInt(1)); // o el nombre o la posicion
				service.setNombre(rs.getString(2));
				service.setDescripcion(rs.getString(3));
				service.setPrecio(rs.getDouble(4));

			}

			if (rs != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
			if (pstmt != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
			if (pstmt != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
			if (conn != null)
				try {
					rs.close();
				} catch (SQLException logIgnore) {
				}
		}

		return service;

	}
}
