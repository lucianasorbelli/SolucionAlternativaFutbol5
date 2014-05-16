package utn.tpdds.anual.futbol5.entidades;

import utn.tpdds.anual.futbol5.strategy.TipoDeInscripcion;

public class Inscripcion implements Comparable<Inscripcion> {

	private Persona inscripto;
	private TipoDeInscripcion tipo;
	private Boolean presencia;

	public Inscripcion(Persona persona, TipoDeInscripcion tipo) {
		inscripto = persona;
		this.tipo = tipo;
	}

	public void inscribirme(Partido part) {
		part.inscribiloALista(this);
	}

	public Persona getInscripto() {
		return inscripto;
	}

	public void setInscripto(Persona inscripto) {
		this.inscripto = inscripto;
	}

	@SuppressWarnings("rawtypes")
	public Class getTipo() {
		return tipo.tipoDeInscripcion();
	}

	@Override
	public int compareTo(Inscripcion arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Boolean getPresencia() {
		return presencia;
	}

	public void setPresencia(Boolean presencia) {
		this.presencia = presencia;
	}

	@Override
	public boolean equals(Object arg0) {
		Inscripcion insc2 = (Inscripcion) arg0;
		return insc2.getInscripto().equals(inscripto);
	}

}
