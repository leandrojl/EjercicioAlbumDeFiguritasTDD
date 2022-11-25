package ar.unlam.testAlbumFiguritas;

import java.util.ArrayList;

import ar.unlam.Excepciones.CodigoExistenteException;

public abstract class Usuario {
	
	
	
	public Usuario() {
		
	}

	protected abstract void agregarFigurita(Figurita figurita) throws CodigoExistenteException;

}
