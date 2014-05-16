package utn.tpdds.anual.futbol5.entidades;

public class Condicional implements TipoDeInscripcion {

	Condicion cond;

	@Override
	public Class tipoDeInscripcion() {
		// TODO Auto-generated method stub
		return this.getClass();
	}

	@Override
	public Integer getPrioridad() {
		return 3;
	}

}
