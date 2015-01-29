public class ColaComposicion{
	private Lista listaCola;
	public ColaComposicion(){
		listaCola = new Lista();
	}

	public void enqueue(Object objeto){
		listaCola.insertarFinal(objeto);
	}

	public Object dequeue() throws ExcepcionVacia{
		return listaCola.eliminarInicio();
	}

	public boolean estaVacia(){
		return listaCola.estaVacia();
	}

	public void imprimir(){
		 listaCola.imprimir();
	}
}