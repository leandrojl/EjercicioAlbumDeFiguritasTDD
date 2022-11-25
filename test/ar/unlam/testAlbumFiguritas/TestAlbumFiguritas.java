package ar.unlam.testAlbumFiguritas;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import ar.unlam.Excepciones.CodigoExistenteException;
import ar.unlam.Excepciones.FiguritaRepetidaException;

public class TestAlbumFiguritas {
	
	@Test
	public void queSePuedaCrearUnaFigurita() {
		
		Figurita figurita =dadoQueTengoUnaFigurita();
		
		Boolean valorObtenido = cuandoConsultoSiSeCreoLaFigurita(figurita);
		entoncesSePudoCrearLaFigurita(valorObtenido);
		
		
	}
	
	@Test
	public void queSePuedaCrearUnAdministrator() {
		Usuario usuarioAdministrador = dadoQueTengoUnUsuarioAdministrador();
		Boolean valorObtenido = cuandoConsultoSiSeCreoUnUsuarioAdministrador(usuarioAdministrador);
		entonceSePudoCrearElAdministrador(valorObtenido);
		
	}
	
	@Test
	public void queSePuedaCrearUnUsuarioFinal() {
		Usuario usuarioFinal = dadoQueTengoUnUsuarioFinal();
		Boolean valorObtenido = cuandoConsultoSiSeCreoUnUsuarioFinal(usuarioFinal);
		entonceSePudoCrearElUsuarioFinal(valorObtenido);
	}
	
	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() {
		Usuario usuarioAdministrador = dadoQueTengoUnUsuarioAdministrador();
		Figurita figurita =dadoQueTengoUnaFigurita();
		try {
			cuandoAgregaUnaFiguritaASuStock(usuarioAdministrador, figurita);
		} catch (CodigoExistenteException e) {
			
			e.printStackTrace();
		}
		entoncesPudoAgregarUnaFiguritaASuStock(usuarioAdministrador, figurita);
		
	}
	
	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadasEnElUsuarioAdministrador() {
		Usuario usuarioAdministrador = dadoQueTengoUnUsuarioAdministrador();
		Figurita figu1 = new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Armani",21500.0);
		Figurita figu2 = new Figurita(new CodigoIdentificador("Belgica",7),7,"F","Belgica","De Bruyne",11500.0);
		Figurita figu3 = new Figurita(new CodigoIdentificador("Brasil",10),10,"G","Brasil","Neymar",15200.0);
		Figurita figu4 = new Figurita(new CodigoIdentificador("Ecuador",13),13,"A","Ecuador","Valencia",11500.0);
		Figurita figu5 = new Figurita(new CodigoIdentificador("Inglaterra",9),9,"B","Inglaterra","Lisandro Martinez",1500.0);
		Figurita figu6 = new Figurita(new CodigoIdentificador("Argentina",10),10,"C","Argentina","Messi",21500.0);
		Figurita figu7 = new Figurita(new CodigoIdentificador("Mexico",13),13,"C","Mexico","Ochoa",21500.0);
		Figurita figu8 = new Figurita(new CodigoIdentificador("Mexico",4),4,"C","Mexico","Alvarez",21500.0);
		Figurita figu9 = new Figurita(new CodigoIdentificador("Gales",11),11,"B","Gales","Bale",21500.0);
		
		try {
			usuarioAdministrador.agregarFigurita(figu9);
			usuarioAdministrador.agregarFigurita(figu7);
			usuarioAdministrador.agregarFigurita(figu5);
			usuarioAdministrador.agregarFigurita(figu4);
			usuarioAdministrador.agregarFigurita(figu2);
			usuarioAdministrador.agregarFigurita(figu8);
			usuarioAdministrador.agregarFigurita(figu3);
			usuarioAdministrador.agregarFigurita(figu1);
			usuarioAdministrador.agregarFigurita(figu6);
		} catch (CodigoExistenteException e) {
			
			e.printStackTrace();
		}
		
		/*
		for(Figurita s: ((Administrador)usuarioAdministrador).getStock() ) {
			System.out.println("Grupo: " + s.getGrupoQuePertenece() +" Seleccion: " + s.getPais() + " Jugador:" +s.getNombre()+" Numero Jugador: "+ s.getfiguritaNumero());}
		*/
		Figurita primeroEsperado = figu4;
		Figurita primeroObtenido = ((Administrador) usuarioAdministrador).getStock().first();
		Figurita ultimoEsperado = figu3;
		Figurita ultimoObtenido = ((Administrador) usuarioAdministrador).getStock().last();
		
		Assert.assertEquals(primeroEsperado, primeroObtenido);
		Assert.assertEquals(ultimoEsperado, ultimoObtenido);
		
	}
	
	@Test
	public void queLasFiguritasAgregadasDeFormaDesordenadaQuedenOrdenadasEnElUsuarioFinal() {
		UsuarioFinal usuarioFinal = new UsuarioFinal();
		Figurita figu1 = new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Armani",21500.0);
		Figurita figu2 = new Figurita(new CodigoIdentificador("Belgica",7),7,"F","Belgica","De Bruyne",11500.0);
		Figurita figu3 = new Figurita(new CodigoIdentificador("Brasil",10),10,"G","Brasil","Neymar",15200.0);
		Figurita figu4 = new Figurita(new CodigoIdentificador("Ecuador",13),13,"A","Ecuador","Valencia",11500.0);
		Figurita figu5 = new Figurita(new CodigoIdentificador("Inglaterra",9),9,"B","Inglaterra","Lisandro Martinez",1500.0);
		Figurita figu6 = new Figurita(new CodigoIdentificador("Argentina",10),10,"C","Argentina","Messi",21500.0);
		Figurita figu7 = new Figurita(new CodigoIdentificador("Mexico",13),13,"C","Mexico","Ochoa",21500.0);
		Figurita figu8 = new Figurita(new CodigoIdentificador("Mexico",4),4,"C","Mexico","Alvarez",21500.0);
		Figurita figu9 = new Figurita(new CodigoIdentificador("Gales",11),11,"B","Gales","Bale",21500.0);
		
		usuarioFinal.agregarFigurita(figu9);
		usuarioFinal.agregarFigurita(figu7);
		usuarioFinal.agregarFigurita(figu5);
		usuarioFinal.agregarFigurita(figu4);
		usuarioFinal.agregarFigurita(figu2);
		usuarioFinal.agregarFigurita(figu8);
		usuarioFinal.agregarFigurita(figu3);
		usuarioFinal.agregarFigurita(figu1);
		usuarioFinal.agregarFigurita(figu6);
		Collections.sort(usuarioFinal.getStock());
		/*
		for(Figurita s: usuarioFinal.getStock() ) {
			System.out.println("Grupo: " + s.getGrupoQuePertenece() +" Seleccion: " + s.getPais() + " Jugador:" +s.getNombre()+" Numero Jugador: "+ s.getfiguritaNumero());}
		*/
		
		Figurita primeroEsperado = figu4;
		Figurita primeroObtenido = usuarioFinal.getStock().get(0);
		Figurita ultimoEsperado = figu3;
		Figurita ultimoObtenido = usuarioFinal.getStock().get(7);
		
		Assert.assertEquals(primeroEsperado, primeroObtenido);
		Assert.assertEquals(ultimoEsperado, ultimoObtenido);
		
	}
	
	
	
	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {
		Usuario usuarioFinal = dadoQueTengoUnUsuarioFinal();
		Figurita figu1 = new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Franco Armani",1500.0);
		cuandoElUsuarioFinalQuiereAgregarUnaFiguritaASuStock(usuarioFinal, figu1);
		entoncesTieneLaFiguritaEnSuStock(usuarioFinal, figu1);
	}
	
	@Test
	public void queUnUsuarioFinalPuedaPegarUnaFigurita() throws FiguritaRepetidaException {
		
		UsuarioFinal usuarioFinal = (UsuarioFinal) dadoQueTengoUnUsuarioFinal();
		Figurita figu1 = new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Franco Armani",1500.0);
		cuandoQuieroPegarUnaFigurita(usuarioFinal, figu1);
		entoncesConsultoSiTengoLaFigurita(usuarioFinal, figu1);
		
	}
	
	@Test(expected=FiguritaRepetidaException.class)
	public void queUnUsuarioFinalNoPuedaPegarLaMismaFiguritaDosVeces() throws FiguritaRepetidaException{
		UsuarioFinal usuarioFinal = (UsuarioFinal) dadoQueTengoUnUsuarioFinal();
		Figurita figu1 = new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Franco Armani",1500.0);
		cuandoQuieroPegarUnaFigurita(usuarioFinal, figu1);
		cuandoQuieroPegarUnaFigurita(usuarioFinal, figu1);
		
	
			System.out.println("El album tiene"+ usuarioFinal.getAlbum().size() +"figuritas");
		
		
	}
	
	@Test (expected=CodigoExistenteException.class)
	public void queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() throws CodigoExistenteException{
		Administrador usuarioAdministrador = new Administrador();
		Figurita figu1 = new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Armani",21500.0);
		cuandoAgregoLaFiguritaAlStockDelAdministrador(figu1, usuarioAdministrador);
		cuandoAgregoLaFiguritaAlStockDelAdministrador(figu1, usuarioAdministrador);
		//System.out.println("El stock de figuritas del Adminitrador es de "+ usuarioAdministrador.getStock().size());
		
	}
	
	@Test
	public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() {
		Usuario usuarioFinal = dadoQueTengoUnUsuarioFinal();
		
		Figurita figu1 = new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Franco Armani",1500.0);
		Figurita figu2 = new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Franco Armani",1500.0);
		
		cuandoAgregoLaFiguritaAlStockDelUsuarioFinal(usuarioFinal,figu1);
		cuandoAgregoLaFiguritaAlStockDelUsuarioFinal(usuarioFinal,figu2);
		
		entoncesElStockDelUsuarioFinalTieneDosFiguritas(usuarioFinal);
	}
	
	@Test
	public void queUnUsuarioFinalNoPuedaPegarUnaFiguritaRepetida() {
		
	}

	private void entoncesElStockDelUsuarioFinalTieneDosFiguritas(Usuario usuarioFinal) {
		Assert.assertEquals(2, ((UsuarioFinal)usuarioFinal).getStock().size());
		
	}

	private void cuandoAgregoLaFiguritaAlStockDelUsuarioFinal(Usuario usuarioFinal, Figurita figu1) {
		try {
			usuarioFinal.agregarFigurita(figu1);
		} catch (CodigoExistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void cuandoAgregoLaFiguritaAlStockDelAdministrador(Figurita figu1, Usuario usuarioAdministrador) throws CodigoExistenteException {
		usuarioAdministrador.agregarFigurita(figu1);
		
	}

	private void entoncesConsultoSiTengoLaFigurita(UsuarioFinal usuarioFinal, Figurita figu1) {
		Assert.assertTrue(usuarioFinal.getAlbum().containsKey(figu1.getCodigoIdentificadorNumeroDeFiguritaYSeleccion()));
		
	}

	private void cuandoQuieroPegarUnaFigurita(UsuarioFinal usuarioFinal, Figurita figu1) throws FiguritaRepetidaException {
		usuarioFinal.pegarUnaFigurita(figu1);
		
	}

	private void entoncesTieneLaFiguritaEnSuStock(Usuario usuarioFinal, Figurita figu) {
		Assert.assertTrue(((UsuarioFinal)usuarioFinal).getStock().contains(figu));
		
	}

	private void cuandoElUsuarioFinalQuiereAgregarUnaFiguritaASuStock(Usuario usuarioFinal, Figurita figu1) {
		((UsuarioFinal)usuarioFinal).agregarFigurita(figu1);
		
	}

	private void entoncesPudoAgregarUnaFiguritaASuStock(Usuario usuarioAdministrador, Figurita figurita) {
		Assert.assertTrue(((Administrador) usuarioAdministrador).getStock().contains(figurita));

}

	private void cuandoAgregaUnaFiguritaASuStock(Usuario usuarioAdministrador, Figurita figurita) throws CodigoExistenteException {
		usuarioAdministrador.agregarFigurita(figurita);
		
	}

	private void entonceSePudoCrearElUsuarioFinal(Boolean valorObtenido) {
		Assert.assertTrue(valorObtenido);
		
	}

	private Boolean cuandoConsultoSiSeCreoUnUsuarioFinal(Usuario usuarioFinal) {
	
		return usuarioFinal != null;
	}

	private Usuario dadoQueTengoUnUsuarioFinal() {
		
		return new UsuarioFinal();
	}

	private void entonceSePudoCrearElAdministrador(Boolean valorObtenido) {
		Assert.assertTrue(valorObtenido);
		
	}

	private Boolean cuandoConsultoSiSeCreoUnUsuarioAdministrador(Usuario usuarioAdministrador) {
		
		return usuarioAdministrador != null;
	}

	private Usuario dadoQueTengoUnUsuarioAdministrador() {
		
		return new Administrador();
	}

	private void entoncesSePudoCrearLaFigurita(Boolean valorObtenido) {
		Assert.assertTrue(valorObtenido);
		
	}

	private Boolean cuandoConsultoSiSeCreoLaFigurita(Figurita figurita) {
		return figurita != null;
		
	}

	private Figurita dadoQueTengoUnaFigurita() {
		return new Figurita(new CodigoIdentificador("Argentina",1),1,"C","Argentina","Franco Armani",1500.0);
		
	}

}
