package ar.unlam.testAlbumFiguritas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ar.unlam.Excepciones.FiguritaRepetidaException;

public class UsuarioFinal extends Usuario {
	
	private ArrayList<Figurita> stock = new ArrayList<Figurita>();
	private Map<CodigoIdentificador, Figurita> album = new HashMap<CodigoIdentificador, Figurita>();
	
	@Override
	protected void agregarFigurita(Figurita figurita) {
		stock.add(figurita);
		
	}

	
	
	public Map<CodigoIdentificador, Figurita> getAlbum() {
		return album;
	}



	public void setAlbum(Map<CodigoIdentificador, Figurita> album) {
		this.album = album;
	}



	public ArrayList<Figurita> getStock() {
		return stock;
	}

	public void setStock(ArrayList<Figurita> stock) {
		this.stock = stock;
	}

	public void pegarUnaFigurita(Figurita figu1) throws FiguritaRepetidaException{
		if(album.containsKey(figu1.getCodigoIdentificadorNumeroDeFiguritaYSeleccion())) {
			throw new FiguritaRepetidaException("figu repetida");
			
		}else {
			album.put(figu1.getCodigoIdentificadorNumeroDeFiguritaYSeleccion(), figu1);
		}
		
		
	}



	
	
	

}
