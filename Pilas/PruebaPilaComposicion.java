public class PruebaPilaComposicion{
	public static void main(String... args){
		PilaComposicion pila = new PilaComposicion();

		Boolean bool = Boolean.TRUE;
		Character caracter = new Character('$');
		Integer entero = new Integer(17);
		String cadena = "Pila Herencia";

		pila.push(bool);
		pila.imprimir();
		System.out.println("=================");
		pila.push(caracter);
		pila.imprimir();
		System.out.println("=================");
		pila.push(entero);
		pila.imprimir();
		System.out.println("=================");
		pila.push(cadena);
		pila.imprimir();
		System.out.println("=================");
		pila.insertarFinal(entero);

		Object eliminado;
		while(!pila.estaVacia()){
			try{
				eliminado = pila.pop();
				System.out.println(eliminado.toString()+" eliminado");
				System.out.println("=================");
				pila.imprimir();
			} catch(ExcepcionVacia ev){
				System.out.println(ev.getMessage());
			}
		}
	}
}