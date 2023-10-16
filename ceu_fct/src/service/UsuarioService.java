package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.Dao1;
import modelo.Usuarios;

public class UsuarioService {

	public Usuarios Login(String email, String contra) throws LoginException, FctException {

		Dao1 usu = new Dao1();
		OpenConection con = new OpenConection();
		Connection conn = null;
		Usuarios usuarioLogin = new Usuarios();
		try {
			conn = con.abrirConexion();
			usuarioLogin = usu.consultarUsuarios(conn, email);

			if (usuarioLogin == null) {
				throw new LoginException("el usuario no exite");
			} else if (!(usuarioLogin.getPassword().equals(contra))) {
				throw new LoginException("la contraseña no existe");
			} else {
				return usuarioLogin;
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
	public void alta(Usuarios usuario) throws FctException {

		Dao1 usuario1 = new Dao1();
		OpenConection con = new OpenConection();
		Connection conn = null;
		Usuarios nn = new Usuarios();
		try {
			conn = con.abrirConexion();
			nn = usuario1.consultarUsuarios(conn, usuario.getEmail());

			if (nn == null) {
				usuario1.InsertarUsuario(conn, usuario);

			} else {
				throw new FctException("hay un usuario con el mismo email");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			usuario1.InsertarUsuario(conn, usuario);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
