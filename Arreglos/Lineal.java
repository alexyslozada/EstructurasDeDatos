import java.lang.Math;
import java.util.Scanner;

public class Lineal{

	int a[] = new int[100];
	Scanner sc = new Scanner(System.in);
	int numero, indice, contador;

	public Lineal(){
		poblar();
		mostrar();
		buscar();
	}

	public void buscar(){
		System.out.print("Digite el numero a buscar: ");
		numero = sc.nextInt();
		indice = busquedaLineal(numero);
		if(indice>=0){
			System.out.println("El numero se encuentra en: "+indice);
		} else {
			System.out.println("El numero No fue encontrado");
		}
		System.out.println("La cantidad de elementos recorridos fueron: "+contador);
	}

	public int busquedaLineal(int x){
		for(int i=0; i<a.length; i++){
			contador++;
			if(x==a[i]){
				return i;
			}
		}
		return -1;
	}

	public void mostrar(){
		for(int i=0;i<100;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}


	public void poblar(){
		for(int i=0; i<100; i++){
			a[i] = (int) (Math.random()*i); 
		}
	}

	public static void main(String[] args){
		new Lineal();
	}
}