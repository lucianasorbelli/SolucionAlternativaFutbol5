package utn.tpdds.anual.futbol5.entidades;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private List<Inscripcion> integrantes;

	public List<Inscripcion> getIntegrantes() {
		if (integrantes == null) {
			integrantes = new ArrayList<Inscripcion>(5);
		}
		return integrantes;
	}

	public void setIntegrantes(List<Inscripcion> integrantes) {
		if (integrantes.size() > 5) {
			throw new RuntimeException();
		}
		this.integrantes = integrantes;
	}

	@Override
	public boolean equals(Object arg0) {
		Equipo eq = (Equipo) arg0;
		return eq.getIntegrantes().containsAll(integrantes);

	}

}
