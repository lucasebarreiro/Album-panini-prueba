package ar.edu.unlam.panini;

public class Figurita {
	
	private Integer codigoIdentificatorio;
	private String letraDeGrupo;
	private String seleccion;
	private String nombreJugador;
	private Integer valorMercado;
	
	
	public Figurita(Integer codigoIdentificatorio, String letraDeGrupo, String seleccion, String nombreJugador,
			Integer valorMercado) {
		super();
		this.codigoIdentificatorio = codigoIdentificatorio;
		this.letraDeGrupo = letraDeGrupo;
		this.seleccion = seleccion;
		this.nombreJugador = nombreJugador;
		this.valorMercado = valorMercado;
	}


	public Integer getCodigoIdentificatorio() {
		return codigoIdentificatorio;
	}


	public void setCodigoIdentificatorio(Integer codigoIdentificatorio) {
		this.codigoIdentificatorio = codigoIdentificatorio;
	}


	public String getLetraDeGrupo() {
		return letraDeGrupo;
	}


	public void setLetraDeGrupo(String letraDeGrupo) {
		this.letraDeGrupo = letraDeGrupo;
	}


	public String getSeleccion() {
		return seleccion;
	}


	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}


	public String getNombreJugador() {
		return nombreJugador;
	}


	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}


	public Integer getValorMercado() {
		return valorMercado;
	}


	public void setValorMercado(Integer valorMercado) {
		this.valorMercado = valorMercado;
	}
	
	
	
	

}
