package utn.tpdds.anual.futbol5.entidades;

import java.util.List;

import utn.tpdds.anual.futbol5.observer.Observable;

public class Persona extends Observable {

	private List<Persona> amigos;
	private List<Infraccion> infracciones;
	public Persona() {
		super();
	}

	public void inscribite(Partido partido, TipoDeInscripcion modo) {
		Inscripcion insc = new Inscripcion(this, modo);
		insc.inscribirme(partido);

	}

	public List<Persona> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Persona> amigos) {
		this.amigos = amigos;
	}

	public List<Infraccion> getInfracciones() {
		return infracciones;
	}

	public void setInfracciones(List<Infraccion> infracciones) {
		this.infracciones = infracciones;
	}

}
