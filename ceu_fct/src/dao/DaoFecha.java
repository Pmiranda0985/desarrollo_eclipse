package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Fechas;

public class DaoFecha {

	public List<Fechas> consultarFecha(Connection conn) throws SQLException {

		List<Fechas> lista = new ArrayList<Fechas>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from fechas where año = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, LocalDate.now().getYear());
			rs = stmt.executeQuery();
			while (rs.next()) {

				Fechas fecha = new Fechas();
				fecha.setAño(rs.getInt("año"));
				fecha.setEvaluacion(rs.getInt("evaluacion"));
				fecha.setDisponibilidad(rs.getBoolean("disponibilidad"));
				lista.add(fecha);
				return lista;
			}
			return null;

		} finally {
			try {
				stmt.close();
			} catch (Exception e) {
			}

		}
	}

}
