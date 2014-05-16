package utn.tpdds.anual.futbol5.observer;

import utn.tpdds.anual.futbol5.entidades.Partido;


public class ObservadorPartidoConfirmado extends Observador {
	private Partido partido;

	public ObservadorPartidoConfirmado(Partido partido) {
		this.partido = partido;
	}

	@Override
	public void actualizar() {
		if (partido.estaConfirmado()) {
			log.info("El partido tiene 10 jugadores confirmados");
		}

	}
}
