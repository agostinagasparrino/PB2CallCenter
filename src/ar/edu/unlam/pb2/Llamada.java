package ar.edu.unlam.pb2;

public class Llamada {
	
	private Boolean fueExitosa;
	private String observaciones;
	public Llamada(Boolean fueExitosa, String observaciones) {
		super();
		this.fueExitosa = fueExitosa;
		this.observaciones = observaciones;
	}
	public Boolean getFueExitosa() {
		return fueExitosa;
	}
	public void setFueExitosa(Boolean fueExitosa) {
		this.fueExitosa = fueExitosa;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	

}
