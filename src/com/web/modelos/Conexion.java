package com.web.modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static Connection conn() {
		Connection dm = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			dm = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surfdonostia?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en la conexi�n");
		}

		return dm;
	}
}
