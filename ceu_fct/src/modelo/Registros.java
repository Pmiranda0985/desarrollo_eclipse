package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Registros {

	private Integer id_registro;
	private Integer id_usuario;
	private LocalDate fecha;
	private BigDecimal num_horas;
	private String descripcion;

	public Integer getId_registro() {
		return id_registro;
	}

	public void setId_registro(Integer id_registro) {
		this.id_registro = id_registro;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getNum_horas() {
		return num_horas;
	}

	public void setNum_horas(BigDecimal num_horas) {
		this.num_horas = num_horas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "registros [id_registro=" + id_registro + ", id_usuario=" + id_usuario + ", fecha=" + fecha
				+ ", num_horas=" + num_horas + ", descripcion=" + descripcion + "]";
	}

}
