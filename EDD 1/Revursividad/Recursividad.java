package Revursividad;

public class Recursividad {
	private Integer x=0;
	
	public void imprimir(Integer x) {
		if(x<=5){
			System.out.print(x + "");
			imprimir(x+1);
		}
		
	}
}
