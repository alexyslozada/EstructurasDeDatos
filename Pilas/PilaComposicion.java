public class PilaComposicion{
	private Lista listaPila;
	public PilaComposicion(){
		listaPila = new Lista();
	}

	public void push(Object objeto){
		listaPila.insertarInicio(objeto);
	}

	public Object pop() throws ExcepcionVacia{
		return listaPila.eliminarInicio();
	}

	public boolean estaVacia(){
		return listaPila.estaVacia();
	}

	public void imprimir(){
		 listaPila.imprimir();
	}
}