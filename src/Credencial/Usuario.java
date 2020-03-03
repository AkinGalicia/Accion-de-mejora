package Credencial;

public class Usuario {

	private int id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String dimicilio;
    private String claveElector;
    private String curp;
    private int añoRegistro;
    private int estado;
    private int municipio;
    private int seccion;
    private int localidad;
    private int emision;
    private int vigencia;
    
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getDimicilio() {
		return dimicilio;
	}
	public void setDimicilio(String dimicilio) {
		this.dimicilio = dimicilio;
	}
	public String getClaveElector() {
		return claveElector;
	}
	public void setClaveElector(String claveElector) {
		this.claveElector = claveElector;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public int getAñoRegistro() {
		return añoRegistro;
	}
	public void setAñoRegistro(int añoRegistro) {
		this.añoRegistro = añoRegistro;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getMunicipio() {
		return municipio;
	}
	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}
	public int getSeccion() {
		return seccion;
	}
	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}
	public int getLocalidad() {
		return localidad;
	}
	public void setLocalidad(int localidad) {
		this.localidad = localidad;
	}
	public int getEmision() {
		return emision;
	}
	public void setEmision(int emision) {
		this.emision = emision;
	}
	public int getVigencia() {
		return vigencia;
	}
	public void setVigencia(int vigencia) {
		this.vigencia = vigencia;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM
				+ ", dimicilio=" + dimicilio + ", claveElector=" + claveElector + ", curp=" + curp + ", añoRegistro="
				+ añoRegistro + ", estado=" + estado + ", municipio=" + municipio + ", seccion=" + seccion
				+ ", localidad=" + localidad + ", emision=" + emision + ", vigencia=" + vigencia + "]";
	}
 
    
}
