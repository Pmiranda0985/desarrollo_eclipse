package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Usuarios;

public class Dao1 {

	public Usuarios consultarUsuarios(Connection conn, String correo) throws SQLException {

		Statement stmt = null;
		ResultSet rs = null;
		Usuarios a = new Usuarios();

		try {
			String sql = "select * from usuarios when email = '" + correo + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) { // usamos if por que solo vamos a consultar 1 usuario a la vez

				a.setId_usuario(rs.getInt("id_usuario"));
				a.setEmail(rs.getString("email"));
				a.setPassword(rs.getString("password"));
				a.setNombre(rs.getString("nombre"));
				a.setApellidos(rs.getString("apellidos"));
				a.setCiclo(rs.getString("ciclo"));
				a.setActivo(rs.getBoolean("activo"));
			} else {
				return null;
			}

			return a;

		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}

		}
	}

	public void InsertarUsuario(Connection conn, Usuarios usu) throws SQLException {

		PreparedStatement stmt = null;

		try {
			stmt = conn.prepareStatement("Insert into usuarios values (?,?,?,?,?,?,?)");

			stmt.setInt(1, usu.getId_usuario());
			stmt.setString(2, usu.getEmail());
			stmt.setString(3, usu.getPassword());
			stmt.setString(4, usu.getNombre());
			stmt.setString(5, usu.getApellidos());
			stmt.setString(6, usu.getCiclo());
			stmt.setBoolean(7, usu.getActivo());
			stmt.executeUpdate();

		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}

	}

}
