package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencia;
	private String interpretacion;
	
	public Tesis(String idea, String[] argumentos, String conclusion, String referencia, String interpretacion, String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencia = referencia;
		this.interpretacion = interpretacion;
	}
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String[] setArgumentos() {
		return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabrasTotales) {
		int resultado = super.getPaginas() * palabrasTotales * 5;
		return resultado;
	}
	public String interpretacion(){
		return interpretacion;
	}
	public String toString() {
		String mensaje = super.getOrigen() + "\n"; 
		mensaje += super.getTitulo() + "\n";
		mensaje += super.getAutor() + "\n"; 
		mensaje += super.getPaginas() + "\n";
		mensaje += this.idea + "\n";
		mensaje += Tesis.argumentos.length + "\n";
		mensaje += this.conclusion + "\n";
		mensaje += this.referencia;
		return mensaje;
	}
}
