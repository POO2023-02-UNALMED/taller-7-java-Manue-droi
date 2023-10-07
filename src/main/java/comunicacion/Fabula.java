package comunicacion;

public class Fabula extends Escrito {
	String ensenanza;
	String interpretacion;

public Fabula(String ensenanza, String interpretacion, String origen, String titulo, String autor, int paginas) {
	super( origen,  titulo,  autor, paginas);
	this.ensenanza = ensenanza;
	this.interpretacion = interpretacion;
}

public String getEnsenanza() {
	return ensenanza;
}
public void setEnsenanza(String ensenanza){
	this.ensenanza = ensenanza;
}
public String getInterpretacion() {
	return interpretacion;
}
public void setInterpretacion(String interpretacion) {
	this.interpretacion = interpretacion;
}
	
public int palabrasTotales(int palabras) {
	this.palabrasTotales = palabras;
}
public String interpretacion() {
	return interpretacion;
}
public String toString() {
	
}
}