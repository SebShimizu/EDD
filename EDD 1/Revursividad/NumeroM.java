package Revursividad;

public class NumeroM {

	public static void main(String[] args) {
		int[] numeros= {6,5,4,15,2,23,27};
		System.out.println(Minimo(numeros,0, numeros[0]));

	}
	public static int Minimo(int[] numeros,int indice,int min) 
	{
		if( indice != numeros.length) {
			if(numeros[indice] < min) {
				min=Minimo(numeros,indice + 1,numeros[indice]);
			}else {
				min=Minimo(numeros,indice + 1,min);
			}
		}
		return min;
	}
	public static int Minimo2(int[] numeros,int indice) {
		int min= Integer.MAX_VALUE;
		if (indice != numeros.length) {
			min= Math.min(numeros[indice], Minimo2(numeros,indice+1));
		}
		return min;
		
	}
}
