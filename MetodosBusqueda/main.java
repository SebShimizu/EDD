package MetodosBusqueda;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList array = new ArrayList <Integer>() ;//crea un array dew 10 elementos
		array.add(new Integer(15));
		array.add(25);
		array.add("30");
		
		int cantidad = array.size();
		for(int x=0; x< cantidad; x++)
		{
			System.out.println(array.get(x));
		}
		
		
	}

}

