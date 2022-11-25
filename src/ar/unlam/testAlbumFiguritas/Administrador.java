package ar.unlam.testAlbumFiguritas;

import java.util.TreeMap;
import java.util.TreeSet;

import ar.unlam.Excepciones.CodigoExistenteException;

public class Administrador extends Usuario {
	
	private TreeSet<Figurita> stock=new TreeSet<Figurita>();
	
	public Administrador() {
		
	}

	@Override
	protected void agregarFigurita(Figurita figurita) throws CodigoExistenteException {
		if(this.stock.contains(figurita)) {
			throw new CodigoExistenteException("Esa figurita ya existe");
		}else {
			this.stock.add(figurita);
		}
		
		
	}

	

	public TreeSet<Figurita> getStock() {
		return stock;
	}

	public void setStock(TreeSet<Figurita> stock) {
		this.stock = stock;
	}
	
	

}
