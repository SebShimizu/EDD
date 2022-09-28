package Revursividad;

public class Camiones {
	static int contador;
	public static void main(String[] args) {
		    Caja(30, 4);
			System.out.println(contador);
	}
	public static void Caja(Integer cajas,Integer tope) 
	{
		if( cajas> tope) {
			int division;
			division= cajas/(2);
			if(division%2==0) 
			{Caja(division,tope);
			 Caja(division,tope);
			}else {Caja(division+1,tope);
				   Caja(division,tope);
			}
		} else {
		contador++;
		}
	}
}
