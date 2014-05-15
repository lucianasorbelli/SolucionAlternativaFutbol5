package PackageFutbol5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDriver {

	@Test
	public void test() {
		Persona persona = new Persona();
		Partido partido = new Partido();
		TipoDeInscripcion modo = new Estandar();
		persona.inscribite(partido, modo);

	}

	@Test (expected= RuntimeException.class)
	public void NoSePuedeAGregarSOlidarioCOn10Estandares() {
		Partido partido = new Partido();
		TipoDeInscripcion modoEstandar = new Estandar();

		for (int i = 0; i < 10; i++) {
			Persona persona = new Persona();
			persona.inscribite(partido, modoEstandar);
		}
		Persona persona = new Persona();

		TipoDeInscripcion modoSolidario = new Solidario();
		persona.inscribite(partido, modoSolidario);
		
	}

}
