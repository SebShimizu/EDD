package Arbol;

public class Main {

	public static void main(String[] args) {	
		ABB arbol=new ABB(new Nodo(8));
		arbol.agregar(new Nodo(3));
		arbol.agregar(new Nodo(9));
		arbol.agregar(new Nodo(5));
		arbol.agregar(new Nodo(4));
		arbol.agregar(new Nodo(6));
		arbol.agregar(new Nodo(11));
		arbol.agregar(new Nodo(20));
		arbol.agregar(new Nodo(10));
		arbol.mostrar();
		arbol.buscar(11);
		System.out.println("FIN....");
	}

}
