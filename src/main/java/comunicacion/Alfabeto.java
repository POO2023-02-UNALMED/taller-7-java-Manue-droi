package comunicacion;

public class Alfabeto extends Pictograma {
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String[] letras, String interpretacion,String origen ) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public int cantidadLetras() {
		return Alfabeto.letras.length;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String mensaje = "";
		for (int i=0; i<Alfabeto.letras.length;i++) {
			if (i< Alfabeto.letras.length-1) {
				mensaje += Alfabeto.letras[i] + ", ";
			}
			else {
				mensaje += Alfabeto.letras[i];
			}
		}
		return mensaje;
	}
}
