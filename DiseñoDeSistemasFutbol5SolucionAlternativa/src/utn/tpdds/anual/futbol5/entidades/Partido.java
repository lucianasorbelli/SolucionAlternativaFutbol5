package utn.tpdds.anual.futbol5.entidades;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import utn.tpdds.anual.futbol5.observer.Observable;
import utn.tpdds.anual.futbol5.strategy.Estandar;

public class Partido extends Observable {

	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private Set<Inscripcion> inscripcionesDePartido = new TreeSet<Inscripcion>();

	public Partido() {
		super();
	}

	public void inscribiloALista(Inscripcion inscripcion) {
		if (estaConfirmado()) {
			throw new RuntimeException();
		}
		inscripcionesDePartido.add(inscripcion);
		notificarObservadores();
	}

	private long cantidadEstandares() {
		return inscripcionesDePartido
				.stream()
				.filter(inscripcion -> inscripcion.getTipo().equals(
						Estandar.class)).count();
	}

	public Boolean estaConfirmado() {
		return cantidadEstandares() == 10;
	}

	public void generarPosiblesFormaciones() {
		/*
		 * ACA AGREGAR ALGO QUE ORDENE LA LISTA DE ACUERDO A SUS MULTIPLES
		 * CRITERIOS (AGREGARLOS A LA FUNCION compareTo() de Inscripcion)
		 */

		List<Inscripcion> hayEquipo = new LinkedList<Inscripcion>();

		for (int i = 0; i < 10; i++) {
			hayEquipo.add((Inscripcion) inscripcionesDePartido.toArray()[i]);
		}

		Collections.shuffle(hayEquipo);
		hayEquipo = hayEquipo.subList(0, 5);
		Equipo equipo = new Equipo();
		equipo.setIntegrantes(hayEquipo);
		equipoLocal = equipo;
		hayEquipo = hayEquipo.subList(5, 10);
		equipo = new Equipo();
		equipo.setIntegrantes(hayEquipo);
		equipoVisitante = equipo;

	}

	public void bajaJugador(Persona jugadorBaja, Persona jugadorReemplazo) {
		Inscripcion insc = buscarInscripcionPorPersona(jugadorBaja);
		if (jugadorReemplazo == null) {
			jugadorBaja.getInfracciones().add(
					new Infraccion(new Date(), "se bajo por colgado"));
			inscripcionesDePartido.remove(insc);
		} else {
			/*
			 * SI EL JUGADOR REEPLAZO DEBE SER UNO QUE YA ESTE INSCRIPTO
			 * DESCOMENTAR ESTA LINEA
			 */
			//
			// Inscripcion insc2 =
			// buscarInscripcionPorPersona(jugadorReemplazo);
			// inscripcionesDePartido.remove(insc2);

			insc.setInscripto(jugadorReemplazo);

		}
		notificarObservadores();
		
	}

	public void bajaJugador(Persona jugador) {
		bajaJugador(jugador, null);
	}

	private Inscripcion buscarInscripcionPorPersona(Persona persona) {
		return inscripcionesDePartido.stream()
				.filter(insc -> insc.getInscripto().equals(persona))
				.findFirst().get();
	}

	public void confirmarEquipos(Equipo equipoLoc, Equipo equipoVis) {
		if (equipoLoc.equals(equipoLocal)) {

		}

		if (equipoVis.equals(equipoVisitante)) {

		}
	}

	public Integer cantidadDeInscriptos() {
		return inscripcionesDePartido.size();
	}

}
