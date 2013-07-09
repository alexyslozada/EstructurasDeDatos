public class Arreglos{
	// Declaración de arreglos

	int a[] = new int[3];
	int b[] = new int[3], c[] = new int[3];
	int d[];
	int f[] = {1,2,3};

	public Arreglos(){
		//poblarA();
		//mostrarA();
		//poblarByC();
		//mostrarByC();
		poblarD();
		mostrarD();
	}

	public void poblarD(){
		d = new int[5];
		d[0] = 8;
		d[1] = 5;
		d[2] = 10;
		d[3] = 11;
		d[4] = 3;
	}

	public void mostrarD(){
		System.out.println("Pos\tValor\tBarra");
		for(int i=0; i<d.length; i++){
			System.out.print((i+1)+"\t"+d[i]+"\t");
			for(int j=0; j<d[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void poblarByC(){
		for(int i=1; i<=3; i++){
			b[i-1] = i;
			c[i-1] = i*2;
		}
	}

	public void mostrarByC(){
		for(int i=0; i<b.length; i++){
			System.out.println("Arreglo b, El elemento "+(i+1)+" de indice "+i+" es: "+b[i]);
			System.out.println("Arreglo c, El elemento "+(i+1)+" de indice "+i+" es: "+c[i]);
		}
	}

	public void poblarA(){
		a[0] = 4;
		a[1] = 7;
		a[2] = -2;
	}

	public void mostrarA(){
		System.out.println("El elemento 1 de indice 0 es: "+a[0]);
		System.out.println("El elemento 2 de indice 1 es: "+a[1]);
		System.out.println("El elemento 3 de indice 2 es: "+a[2]);
	}

	public static void main(String args[]){
		new Arreglos();
	}
}