package app;

import java.math.BigDecimal;
import java.time.LocalDate;

import modelo.Fechas;
import modelo.Registros;
import modelo.Usuarios;
import service.FctException;
import service.FechasService;
import service.LoginException;
import service.RegistroService;
import service.UsuarioService;

public class prueba {

	public static void main(String[] args) throws LoginException, FctException {

		Fechas fecha = new Fechas();
		Usuarios usuario = new Usuarios();
		Registros regis = new Registros();

		UsuarioService usu = new UsuarioService();
		RegistroService re = new RegistroService();
		FechasService fe = new FechasService();

		usuario.setId_usuario(6);
		usuario.setActivo(true);
		usuario.setEmail("pat");
		usuario.setNombre("Patri");
		usuario.setApellidos("miranda");
		usuario.setCiclo("DAM");
		usuario.setPassword("12345");
		usu.alta(usuario);

		regis.setDescripcion("hola");
		regis.setId_registro(5);
		regis.setId_usuario(6);
		regis.setNum_horas(BigDecimal.valueOf(2));
		regis.setFecha(LocalDate.of(2023, 9, 15));
		re.nuevoRegistro(regis);

		fecha.setAño(2023);
		fecha.setDisponibilidad(true);
		fecha.setEvaluacion(1);

		System.out.println(usu.Login(usuario.getEmail(), usuario.getPassword()));
		System.out.println(re.consultarRegistro(1));
		System.out.println(fe.FechasCons());

	}

}
