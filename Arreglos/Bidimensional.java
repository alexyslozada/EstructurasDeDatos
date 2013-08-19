class Bidimensional{
	public static void main(String[] args){
		int a[][] = {{4,7},{3,4}};
		int b[][] = {{2,5,6},{8,5,2}};
		int c[][] = {{2,8,9},{0},{3,5,1,1}};
		mostrar(c);
	}

	static void mostrar(int[][] arreglo){
		for(int fila=0; fila<arreglo.length; fila++){
			for(int columna=0; columna<arreglo[fila].length; columna++){
				System.out.print(arreglo[fila][columna]+"\t");
			}
			System.out.println();
		}
	}
}