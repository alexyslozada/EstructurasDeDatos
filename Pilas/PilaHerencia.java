public class PilaHerencia extends Lista{
	public PilaHerencia(){}

	public void push(Object objeto){
		insertarInicio(objeto);
	}

	public Object pop() throws ExcepcionVacia{
		return eliminarInicio();
	}
}