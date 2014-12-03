public class PruebaLista{
	public static void main(String... args){
		
		Lista lista = new Lista();

		Boolean bool = Boolean.TRUE;
		Character caracter = new Character('*');
		Integer entero = new Integer(50);
		String cadena = "Hola Mundo";

		System.out.println("Insertando objetos...");
		lista.insertarFinal(bool);
		lista.insertarFinal(caracter);
		lista.insertarFinal(entero);
		lista.insertarFinal(cadena);
		System.out.println("Fin de insertar objetos...");
		System.out.println();

		System.out.println("Mostrando la lista original...");
		System.out.println("==================================");		
		lista.imprimir();
		System.out.println("==================================");
		System.out.println();

		System.out.println("Eliminar al Final de la lista:");
		try{
			Object elemento = lista.eliminarFinal();
			System.out.println("El elemento eliminado fue: "+elemento.toString());
		} catch(ExcepcionVacia ev){
			System.out.println(ev.getMessage());
		}

		System.out.println();
		System.out.println("Mostrando la lista despues de eliminar al final:");
		System.out.println("==================================");
		lista.imprimir();
		System.out.println("==================================");
		System.out.println("Proceso terminado");
	}
}