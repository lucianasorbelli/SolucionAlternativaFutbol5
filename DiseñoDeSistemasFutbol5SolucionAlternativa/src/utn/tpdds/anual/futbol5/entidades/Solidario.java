package utn.tpdds.anual.futbol5.entidades;

public class Solidario implements TipoDeInscripcion {

	
	

	@Override
	public Class tipoDeInscripcion() {
		// TODO Auto-generated method stub
		return this.getClass();
	}

	@Override
	public Integer getPrioridad() {
		return 2;
	}

}
