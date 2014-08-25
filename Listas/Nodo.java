public class Nodo{
	protected Object dato;
	protected Nodo siguienteNodo;

	public Nodo(Object d, Nodo s){
		this.dato = d;
		this.siguienteNodo = s;
	}

	public Nodo(Object d){
		this(d,null);
	}
}