package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
	super(origen, titulo, autor,  paginas);
	this.fecha = fecha;
	this.primicia = primicia;
	this.interpretacion = interpretacion;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrimicia() {
		return primicia;
	}
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public int palabrasTotales(int palabrasTotales) {
		int resultado = super.getPaginas() * palabrasTotales * 10;
		return resultado;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {	
		String mensaje = super.getOrigen() + "\n";
				mensaje +=super.getTitulo() + "\n";
				mensaje +=super.getAutor() + "\n";
				mensaje +=super.getPaginas() + "\n";
				mensaje +=this.fecha + "\n";
				mensaje +=this.primicia + "\n";
		return mensaje;
	}
}