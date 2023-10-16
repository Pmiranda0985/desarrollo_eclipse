package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Dao2;
import modelo.Registros;

public class RegistroService {

	public void nuevoRegistro(Registros res) throws FctException {

		Dao2 usu = new Dao2();
		OpenConection con = new OpenConection();
		Connection conn = null;
		Registros registro = new Registros();
		try {
			conn = con.abrirConexion();
			registro = usu.consultarReg(conn, res.getFecha(), res.getId_usuario());

			if (registro == null) {
				usu.InsertarRegistro(conn, res);
			} else {
				throw new FctException("Hay un registro de este usuario ese dia");
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

	public List<Registros> consultarRegistro(Integer id_usu) throws FctException {

		Dao2 daoRes = new Dao2();
		OpenConection con = new OpenConection();
		Connection conn = null;
		List<Registros> lista = new ArrayList<Registros>();

		try {
			conn = con.abrirConexion();
			lista = daoRes.consultarRegistros(conn, id_usu);

			if (lista == null) {
				throw new FctException("el registro no existe");
			} else {
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
