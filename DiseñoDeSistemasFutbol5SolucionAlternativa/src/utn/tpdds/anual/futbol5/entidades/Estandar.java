package utn.tpdds.anual.futbol5.entidades;

public class Estandar implements TipoDeInscripcion {

	@SuppressWarnings("rawtypes")
	@Override
	public Class tipoDeInscripcion() {
		return this.getClass();
	}

	@Override
	public Integer getPrioridad() {
		return 1;
	}

}
