package ar.unlam.testAlbumFiguritas;

import java.util.Objects;

public class CodigoIdentificador {

	private String seleccion;
	private Integer numeroFigurita;
		
	public CodigoIdentificador(String seleccion, Integer numeroFigurita) {
		super();
		this.seleccion = seleccion;
		this.numeroFigurita = numeroFigurita;
	}
	public String getSeleccion() {
		return seleccion;
	}
	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}
	public Integer getNumeroFigurita() {
		return numeroFigurita;
	}
	public void setNumeroFigurita(Integer numeroFigurita) {
		this.numeroFigurita = numeroFigurita;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numeroFigurita, seleccion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodigoIdentificador other = (CodigoIdentificador) obj;
		return Objects.equals(numeroFigurita, other.numeroFigurita) && Objects.equals(seleccion, other.seleccion);
	}
	
	
	
}
