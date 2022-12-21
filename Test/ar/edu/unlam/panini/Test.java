package ar.edu.unlam.panini;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSePuedaCrearUnaFigurita() {
		
		Figurita figurita = new Figurita (1,"A","Argentina","Lionel Messi", 80000000);
		
		Integer valorEsperado=1;
		
		assertEquals(valorEsperado, figurita.getCodigoIdentificatorio());
		
	}
	
	@org.junit.Test
	public void queSePuedaCrearUnUsuarioAdministrador() {
		
		Usuario Admin = new Administrador (40378915, "Lucas Barreiro");
		
		Integer valorEsperado=40378915;
		
		assertEquals(valorEsperado, Admin.getDni());
		
	}
	
	@org.junit.Test
	public void queSePuedaCrearUnUsuarioFinal() {
		
		Usuario UsuarioFinal = new UsuarioFinal (40378915, "Lucas Barreiro");
		
		Integer valorEsperado=40378915;
		
		assertEquals(valorEsperado, UsuarioFinal.getDni());
		
	}
	
	
	
	
	
}
