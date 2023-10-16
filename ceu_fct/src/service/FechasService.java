package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DaoFecha;
import modelo.Fechas;

public class FechasService {

	public List<Fechas> FechasCons() throws FctException {

		DaoFecha daoF = new DaoFecha();
		OpenConection con = new OpenConection();
		Connection conn = null;
		List<Fechas> lista = new ArrayList<Fechas>();
		try {
			
			conn = con.abrirConexion();
			lista = daoF.consultarFecha(conn);

			if (lista == null) {
				throw new FctException("la fecha no existe");
			}else {
				return lista;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new FctException("error en la base de datos");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
