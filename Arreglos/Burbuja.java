public class Burbuja{

	int a[] = {-1, 15, 32, 8,5,2, 85};

	public Burbuja(){
		System.out.println("Arreglo Original:");
		mostrar();
		System.out.println();
		ordenar();
		System.out.println("Arreglo Ordenado:");
		mostrar();
	}

	public void mostrar(){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}

	public void ordenar(){
		for(int pasadas=0; pasadas<a.length-1; pasadas++){
			for(int elemento=0; elemento<a.length-1; elemento++){
				if(a[elemento]>a[elemento+1]){
					/*int temporal = a[elemento];
					a[elemento] = a[elemento+1];
					a[elemento+1] = temporal;*/
					a[elemento] = a[elemento]+a[elemento+1]; 
					a[elemento+1] = a[elemento]-a[elemento+1];
					a[elemento] = a[elemento]-a[elemento+1]; 
				}
			}
		}
	}

	public static void main(String args[]){
		new Burbuja();
	}
}