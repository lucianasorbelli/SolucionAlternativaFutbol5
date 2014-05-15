package PackageFutbol5;

import java.util.HashSet;
import java.util.Set;

public class Partido {

	private Set<Inscripcion> inscripcionesDePartido = new HashSet<Inscripcion>();

	public void inscribiloALista(Inscripcion inscripcion) {
		if (this.cantidadEstandares() > 10)
			throw new RuntimeException();
		inscripcionesDePartido.add(inscripcion);

	}

	private long cantidadEstandares() {
		return inscripcionesDePartido.stream()
				.filter(inscripcion -> inscripcion.esEstandar()).count();
	}

}
