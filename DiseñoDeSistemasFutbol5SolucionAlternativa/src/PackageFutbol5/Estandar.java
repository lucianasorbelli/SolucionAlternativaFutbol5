package PackageFutbol5;

public class Estandar implements TipoDeInscripcion {

	@Override
	public void inscribime(Persona persona, Partido partido) {

		Inscripcion inscripcion = new Inscripcion(persona);
		partido.inscribiloALista(inscripcion);

	}

	@Override
	public boolean esEstandar() {
		return true;
	}

}
