package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContacto {

	@Test
	public void queSePuedaCrearUnContacto() {
		Contacto contacto = new Contacto("agostina", "gasparrino", "+5491135925567", "agostinagasparrino01@gmail.com",
				1712, Provincia.BSAS, false, true);
		final Boolean es_cliente = false;
		final Boolean desea_ser_llamado = true;

		assertNotNull(contacto);
		assertFalse(contacto.getEsCliente());
		assertEquals(desea_ser_llamado, contacto.getDeseaSerLlamado());
	}

	@Test
	public void queLosDatosDelContactoSeGuardenCorrectamente() {
		Contacto contacto = new Contacto("agostina", "gasparrino", "+5491135925567", "agostinagasparrino01@gmail.com",
				1712, Provincia.SANJUAN, false, true);
		assertNotNull(contacto);

	}

	@Test
	public void queSePuedaRegistrarUnaLlamadaExitosa() {
		Contacto contacto = new Contacto("agostina", "gasparrino", "+5491135925567", "agostinagasparrino01@gmail.com",
				1712, Provincia.SANJUAN, false, true);

		final Boolean valorEsperado = true;
		final String observacionEsperada = "se realizo la llamada";
		final Integer cantidadLlamadasRecibidasEsperadas = 1;

		Llamada nueva = new Llamada(valorEsperado, observacionEsperada);
		contacto.llamar(nueva);

		assertEquals(cantidadLlamadasRecibidasEsperadas, contacto.getCantidadDeLlamadasRecibidas());
	}

	@Test
	public void queSeValideElCorrectamenteElEmail() {
		Contacto contacto = new Contacto();
		
		final String email_correcto = "agostinagasparrino01@gmail.com";
		assertTrue(contacto.esUnEmailValido(email_correcto));
		
		final String email_incorrecto = "agostinagasparrino01gmailcom";
		assertFalse(contacto.esUnEmailValido(email_incorrecto));

	}

}
