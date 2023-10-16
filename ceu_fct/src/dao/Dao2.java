package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Registros;

public class Dao2 {

	public List<Registros> consultarRegistros(Connection conn, Integer id) throws SQLException {

		Statement stmt = null;
		ResultSet rs = null;
		
		List<Registros> res = new ArrayList<Registros>();

		try {
			String sql = "select * from registros where id_usuario = " + id;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Registros a = new Registros();
				a.setId_registro(rs.getInt("id_registro"));
				a.setId_usuario(rs.getInt("id_usuario"));
				a.setFecha(rs.getDate("fecha").toLocalDate());// LAS FECHAS CON TO LOCAL DATE AL FINAL
				a.setNum_horas(rs.getBigDecimal("num_horas"));
				a.setDescripcion(rs.getString("descripcion"));
				res.add(a);
			}
			return res;

		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}

		}
	}
	
	
	
	public Registros consultarReg(Connection conn, LocalDate fecha, Integer id) throws SQLException {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		Registros a = new Registros();

		try {
			String sql = "select * from registros where fecha = ? and id_usuario = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setDate(1, Date.valueOf(fecha));
			stmt.setInt(2, id);
			rs = stmt.executeQuery();
			while (rs.next()) {

				a.setId_registro(rs.getInt("id_registro"));
				a.setId_usuario(rs.getInt("id_usuario"));
				a.setFecha(rs.getDate("fecha").toLocalDate());// LAS FECHAS CON TO LOCAL DATE AL FINAL
				a.setNum_horas(rs.getBigDecimal("num_horas"));
				a.setDescripcion(rs.getString("descripcion"));
				return a;
			}
			return null;

		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}

		}
	}
	
	
	public void InsertarRegistro(Connection conn, Registros res) throws SQLException {

		PreparedStatement stmt = null;

		try {
			stmt = conn.prepareStatement("Insert into registros (id_usuario, fecha, num_horas, descripcion) values (?,?,?,?)");

		
			stmt.setInt(1, res.getId_usuario());
			stmt.setDate(2, Date.valueOf(res.getFecha())); //PARA INSERTAR LOCALDATE(FECHAS)
			stmt.setBigDecimal(3, res.getNum_horas());
			stmt.setString(4, res.getDescripcion());
			stmt.execute();

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
