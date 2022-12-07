package Revursividad;

public class Digito {

	public static void main(String[] args) {
		System.out.println(digito(323,0));
		
	}
	public static int digito(Integer numero,Integer retorno) {
		if (numero == 1) {numero=1;
			return numero;
		}
		if(numero >=2) {
			int producto= numero % 2;
			if(producto==1) 
			{
				return producto;
			}else
			{
				int division= producto/2;
			
			return division;
		}
	}
		return numero;
	}
}

