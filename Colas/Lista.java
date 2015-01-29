public class Lista{
	private Nodo primerNodo, ultimoNodo;

	public Lista(){
		this.primerNodo = this.ultimoNodo = null;
	}

	public boolean estaVacia(){
		return this.primerNodo == null;
	}

	// Insertar al inicio de la lista
	public void insertarInicio(Object d){
		if(estaVacia()){
			this.primerNodo = this.ultimoNodo = new Nodo(d);
		} else {
			this.primerNodo = new Nodo(d,this.primerNodo);
		}
	}

	// Insertar al final de la lista
	public void insertarFinal(Object d){
		if(estaVacia()){
			this.primerNodo = this.ultimoNodo = new Nodo(d);
		} else {
			this.ultimoNodo = this.ultimoNodo.siguienteNodo = new Nodo(d);
		}
	}

	// Imprimir el contenido de la lista
	public void imprimir(){
		if(estaVacia()){
			System.out.println("La lista está vacía");
		} else {
			Nodo actual = this.primerNodo;
			while(actual != null){
				System.out.println(actual.dato.toString());
				actual = actual.siguienteNodo;
			}
		}
	}

	public Object eliminarInicio() throws ExcepcionVacia{
		if(estaVacia()){
			throw new ExcepcionVacia("La lista está vacía.");
		}
		Object elementoEliminado = this.primerNodo.dato;
		if(this.primerNodo == this.ultimoNodo){
			this.primerNodo = this.ultimoNodo = null;
		} else {
			this.primerNodo = this.primerNodo.siguienteNodo;
		}
		return elementoEliminado;
	}

	public Object eliminarFinal() throws ExcepcionVacia{
		if(estaVacia()){
			throw new ExcepcionVacia("La lista está vacía.");
		}
		Object elementoEliminado = this.ultimoNodo.dato;
		if(this.primerNodo == this.ultimoNodo){
			this.primerNodo = this.ultimoNodo = null;
		} else {
			Nodo actual = this.primerNodo;
			while(actual.siguienteNodo != this.ultimoNodo){
				actual = actual.siguienteNodo;
			}
			actual.siguienteNodo = null;
			this.ultimoNodo = actual;
		}
		return elementoEliminado;
	}

}