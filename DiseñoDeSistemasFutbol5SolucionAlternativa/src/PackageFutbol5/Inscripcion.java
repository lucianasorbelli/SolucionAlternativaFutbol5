package PackageFutbol5;

public class Inscripcion {

	private Persona inscripto;
	private TipoDeInscripcion tipo;

	public Inscripcion(Persona persona) {
		this.inscripto= persona;
	}

	public boolean esEstandar() {
		return tipo.esEstandar();
	}

	
	
}
