package utn.tpdds.anual.futbol5.observer;

import utn.tpdds.anual.futbol5.entidades.Partido;

public class ObservadorSePudrioTodo extends Observador {
	private int ultimoEstado = 0;
	private Partido partido;

	public ObservadorSePudrioTodo(Partido part) {
		partido = part;
	}

	@Override
	public void actualizar() {
		if (ultimoEstado == 10 && partido.cantidadDeInscriptos() == 9) {
			log.info("Se pudrio todo, no se juega el partido porque no hay suficientes inscriptos");
		}
		ultimoEstado = partido.cantidadDeInscriptos();

	}

}
