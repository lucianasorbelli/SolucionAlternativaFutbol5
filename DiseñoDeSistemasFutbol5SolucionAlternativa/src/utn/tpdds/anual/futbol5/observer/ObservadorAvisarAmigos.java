package utn.tpdds.anual.futbol5.observer;

import utn.tpdds.anual.futbol5.entidades.Persona;

public class ObservadorAvisarAmigos extends Observador {
	private Persona persona;

	@Override
	public void actualizar() {
		for (Persona amigo : persona.getAmigos()) {
			// ACA HAY QUE HACER ALGO Y NO SABEMOS MUY BIEN QUE
		}

	}

}
