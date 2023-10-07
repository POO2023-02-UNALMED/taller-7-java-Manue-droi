package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencia;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencia, String interpretacion) {
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
	public String[] getArgumentos() {
		return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencia;
	}
	public void setReferencias(String referencia) {
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
		String mensaje = super.getOrigen() + "\n" +
		 super.getTitulo() + "\n"+
		 super.getAutor() + "\n" +
		 super.getPaginas() + "\n"+
		 this.idea + "\n"+
		 Tesis.argumentos.length + "\n"+
		 this.conclusion + "\n"+
		 this.referencia;
		return mensaje;
	}
}
