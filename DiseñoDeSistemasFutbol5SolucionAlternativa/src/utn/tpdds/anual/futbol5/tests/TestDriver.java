package utn.tpdds.anual.futbol5.tests;

import org.junit.Before;
import org.junit.Test;

import utn.tpdds.anual.futbol5.entidades.Estandar;
import utn.tpdds.anual.futbol5.entidades.Partido;
import utn.tpdds.anual.futbol5.entidades.Persona;
import utn.tpdds.anual.futbol5.entidades.Solidario;
import utn.tpdds.anual.futbol5.entidades.TipoDeInscripcion;

public class TestDriver {
	Partido partido;
	TipoDeInscripcion modoEstandar;

	@Before
	public void init() {
		partido = new Partido();
		modoEstandar = new Estandar();

		for (int i = 0; i < 10; i++) {
			Persona persona = new Persona();
			persona.inscribite(partido, modoEstandar);
		}

	}

	@Test
	public void test() {
		Persona persona = new Persona();
		Partido partido = new Partido();
		TipoDeInscripcion modo = new Estandar();
		persona.inscribite(partido, modo);

	}

	@Test
	public void NoSePuedeAGregarSOlidarioCOn10Estandares() {

		Persona persona = new Persona();

		TipoDeInscripcion modoSolidario = new Solidario();
		persona.inscribite(partido, modoSolidario);

	}

	@Test
	public void ehloco(){
		partido.generarPosiblesFormaciones();
		
	}

}
