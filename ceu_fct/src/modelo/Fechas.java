package modelo;

public class Fechas {

	private Integer año;
	private Integer evaluacion;
	private Boolean disponibilidad;

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public Integer getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(Integer evaluacion) {
		this.evaluacion = evaluacion;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	@Override
	public String toString() {
		return "fechas [año=" + año + ", evaluacion=" + evaluacion + ", disponibilidad=" + disponibilidad + "]";
	}

}
