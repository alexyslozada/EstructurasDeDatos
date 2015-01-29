public class ExcepcionVacia extends RuntimeException{
	
	public ExcepcionVacia(){
		this("La lista está vacia");
	}

	public ExcepcionVacia(String texto){
		super(texto);
	}
}