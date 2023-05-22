package ar.edu.unlam.pb2;

public class Contacto {

	private String nombre;
	private String apellido;
	private String celular;
	private String email;
	private Integer cp;
	private Provincia provincia;
	private Boolean esCliente;
	private Boolean deseaSerLlamado;
	private Llamada llamadasRecibidas[];
	private final Integer CANTIDAD_MAXIMA_DE_LLAMADAS;
	private Integer cantidadDeLlamadasRecibidas;

	public Contacto() {
		this.CANTIDAD_MAXIMA_DE_LLAMADAS = 100;
		this.cantidadDeLlamadasRecibidas = 0;
		this.esCliente = false;
		this.deseaSerLlamado = true;
	}

	public Contacto(String nombre, String apellido, String celular, String email, Integer cp, Provincia provincia,
			Boolean esCliente, Boolean deseaSerLlamado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.email = email;
		this.cp = cp;
		this.provincia = provincia;
		this.esCliente = esCliente;
		this.deseaSerLlamado = deseaSerLlamado;
		CANTIDAD_MAXIMA_DE_LLAMADAS = 100;
		cantidadDeLlamadasRecibidas = 0;
		llamadasRecibidas = new Llamada[CANTIDAD_MAXIMA_DE_LLAMADAS];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Boolean getEsCliente() {
		return false;
	}

	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public Boolean getDeseaSerLlamado() {
		return true;
	}

	public void setDeseaSerLlamado(Boolean deseaSerLlamado) {
		this.deseaSerLlamado = deseaSerLlamado;
	}

	public void llamar(Llamada nueva) {
		llamadasRecibidas[cantidadDeLlamadasRecibidas++] = nueva;

	}

	public Integer getCantidadDeLlamadasRecibidas() {
		return cantidadDeLlamadasRecibidas;
	}

	public Boolean esUnEmailValido(String emailIngresado) {
		if (emailIngresado.contains("@") && emailIngresado.contains(".")) {
			return true;
		} else {
			return false;
		}
	}
}
