package utn.tpdds.anual.futbol5.entidades;

import java.util.Date;

public class Infraccion {
	private Date fecha;
	private String motivo;

	public Infraccion(Date fecha, String motivo) {
		this.setFecha(fecha);
		this.setMotivo(motivo);
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
