package utn.tpdds.anual.futbol5.observer;

import java.util.ArrayList;

public abstract class Observable {
	public Observable() {
		observadores = new ArrayList<Observador>();
	}

	public void agregarObservador(Observador o) {
		observadores.add(o);
	}

	public void eliminarObservador(Observador o) {
		observadores.remove(o);
	}

	public void notificarObservadores() {
		for (Observador o : observadores) {
			o.actualizar();
		}
	}

	private ArrayList<Observador> observadores;

}
