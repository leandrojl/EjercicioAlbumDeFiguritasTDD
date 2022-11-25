package ar.unlam.testAlbumFiguritas;

import java.util.Comparator;
import java.util.Objects;

public class Figurita implements Comparable<Figurita>{
	
	private CodigoIdentificador codigoIdentificadorNumeroDeFiguritaYSeleccion;
	private Integer figuritaNumero;
	private String grupoQuePertenece;
	private String pais;
	private String nombre;
	private Double valorDelJugador;

	public Figurita(CodigoIdentificador codigoIdentificadorNumeroDeFiguritaYSeleccion, Integer figuritaNumero, String grupoQuePertenece, String pais, String nombre, Double valorDelJugador) {
		this.codigoIdentificadorNumeroDeFiguritaYSeleccion = codigoIdentificadorNumeroDeFiguritaYSeleccion;
		this.figuritaNumero = figuritaNumero;
		this.grupoQuePertenece = grupoQuePertenece;
		this.pais = pais;
		this.nombre = nombre;
		this.valorDelJugador = valorDelJugador;
	}
	
	

	public CodigoIdentificador getCodigoIdentificadorNumeroDeFiguritaYSeleccion() {
		return codigoIdentificadorNumeroDeFiguritaYSeleccion;
	}



	public void setCodigoIdentificadorNumeroDeFiguritaYSeleccion(
			CodigoIdentificador codigoIdentificadorNumeroDeFiguritaYSeleccion) {
		this.codigoIdentificadorNumeroDeFiguritaYSeleccion = codigoIdentificadorNumeroDeFiguritaYSeleccion;
	}



	public Integer getFiguritaNumero() {
		return figuritaNumero;
	}



	public void setFiguritaNumero(Integer figuritaNumero) {
		this.figuritaNumero = figuritaNumero;
	}



	public Integer getfiguritaNumero() {
		return figuritaNumero;
	}

	public void setCodigoIdentificatorio(Integer figuritaNumero) {
		this.figuritaNumero = figuritaNumero;
	}

	public String getGrupoQuePertenece() {
		return grupoQuePertenece;
	}

	public void setGrupoQuePertenece(String grupoQuePertenece) {
		this.grupoQuePertenece = grupoQuePertenece;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getValorDelJugador() {
		return valorDelJugador;
	}

	public void setValorDelJugador(Double valorDelJugador) {
		this.valorDelJugador = valorDelJugador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(figuritaNumero, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(figuritaNumero, other.figuritaNumero) && Objects.equals(pais, other.pais);
	}
	/*
	@Override
	public int compareTo(Figurita o) {
		// TODO Auto-generated method stub
		return this.getfiguritaNumero() - o.getfiguritaNumero();
	}

	*/
	/*
	@Override
	public int compareTo(Figurita f){
	    return Comparator.comparing((Figurita f)-> f.getGrupoQuePertenece())
	    		.thenComparing(f -> f.getPais())
	    		.thenComparingInt(f-> f.getfiguritaNumero());
	}



	@Override
	public int compare(Figurita o1, Figurita o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	*/



	@Override
	public int compareTo(Figurita o) {
		// TODO Auto-generated method stub
		return Comparator.comparing(Figurita::getGrupoQuePertenece)
	              .thenComparing(Figurita::getPais)
	              .thenComparingInt(Figurita::getfiguritaNumero)
	              .compare(this, o);
	}
	
	
	
	

}
