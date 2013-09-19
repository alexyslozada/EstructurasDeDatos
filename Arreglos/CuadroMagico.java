public class CuadroMagico{
	int NIVEL = 5;
	int arreglo[][];

	public CuadroMagico(){
		arreglo = new int[NIVEL][NIVEL];
		generar();
	}

	public void generar(){
		int mitad = NIVEL/2;
		int ubicacionC = mitad;
		int ubicacionF = 0;

		arreglo[ubicacionF][ubicacionC] = 1;

		int ubicacionFActual = ubicacionF;
		int ubicacionCActual = ubicacionC;

		for(int i=2; i<=(Math.pow(arreglo.length,2)); i++){
			ubicacionF--;
			ubicacionC--;
			if(ubicacionF<0){
				ubicacionF = arreglo.length-1;
			}
			if(ubicacionC<0){
				ubicacionC = arreglo.length-1;
			}
			if(arreglo[ubicacionF][ubicacionC]==0){
				arreglo[ubicacionF][ubicacionC]=i;
			} else {
				ubicacionF = ubicacionFActual+1;
				ubicacionC = ubicacionCActual;
				arreglo[ubicacionF][ubicacionC]=i;
			}
			ubicacionFActual = ubicacionF;
			ubicacionCActual = ubicacionC;
		}
		mostrarArreglo();
	}

	public void mostrarArreglo(){
		for(int i=0; i<arreglo.length; i++){
			for(int j=0; j<arreglo.length; j++){
				System.out.print(arreglo[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String... args){
		new CuadroMagico();
	}
}