public class PruebaColaComposicion{
	public static void main(String... args){
		ColaComposicion Cola = new ColaComposicion();

		Boolean bool = Boolean.TRUE;
		Character caracter = new Character('$');
		Integer entero = new Integer(17);
		String cadena = "Cola Composicion";

		Cola.enqueue(bool);
		Cola.imprimir();
		System.out.println("=================");
		Cola.enqueue(caracter);
		Cola.imprimir();
		System.out.println("=================");
		Cola.enqueue(entero);
		Cola.imprimir();
		System.out.println("=================");
		Cola.enqueue(cadena);
		Cola.imprimir();
		System.out.println("=================");

		System.out.println("Proceso de eliminacion");

		Object eliminado;
		while(!Cola.estaVacia()){
			try{
				eliminado = Cola.dequeue();
				System.out.println(eliminado.toString()+" eliminado");
				System.out.println("=================");
				Cola.imprimir();
			} catch(ExcepcionVacia ev){
				System.out.println(ev.getMessage());
			}
		}
	}
}