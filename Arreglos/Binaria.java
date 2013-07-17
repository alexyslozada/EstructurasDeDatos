import java.util.Scanner;

public class Binaria{

	int a[] = {-9,-6,-3,-1,0,12,24,31,45,52,68,79,80,99};
	int numero,elemento,inicial,medio,ultimo,contador;
	Scanner sc;

	public Binaria(){
		sc = new Scanner(System.in);
		buscar();
	}

	public void buscar(){
		System.out.print("Digite el numero a buscar: ");
		numero = sc.nextInt();
		elemento = busqueda(numero);
		if(elemento>-1){
			System.out.println("El elemento esta en el indice: "+elemento);
			System.out.println("La posicion del elemento es: "+(elemento+1));
		} else {
			System.out.println("No se encontro el elemento.");
		}
		System.out.println("Comparaciones: "+contador);
	}

	public int busqueda(int x){
		inicial = 0;
		ultimo  = a.length-1;
		if(x<a[inicial] || x>a[ultimo]){
			return -1;
		}
		while(inicial<=ultimo){
			contador++;
			medio = (inicial+ultimo)/2;
			System.out.println(crearSalida(inicial,medio,ultimo));
			if(x==a[medio]){
				return medio;
			} else if(x<a[medio]){
				ultimo=medio-1;
			} else {
				inicial=medio+1;
			}
		}
		return -1;
	}

	public String crearSalida(int i, int m, int u){
		String salida = "";
		// Se recorre el arreglo
		for(int j=0; j<a.length; j++){
			// Si el intervalo está fuera del conjunto actual
			// se agregan espacios en la salida
			if(j<i || j>u){
				salida += "     ";
			// Si es el elemento del medio, se agrega un * y espacios
			} else if(j==m){
				salida += a[j]+"*  ";
			// De lo contrario, solo anexar el elemento con espacios
			} else {
				salida += a[j]+"   ";
			}
		}
		return salida;
	}

	public static void main(String... args){
		new Binaria();
	}
}