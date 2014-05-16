package utn.tpdds.anual.futbol5.observer;

import org.apache.log4j.Logger;

abstract class Observador {
	protected static final Logger log = Logger.getLogger(ObservadorPartidoConfirmado.class);	
	public abstract void actualizar();
}
