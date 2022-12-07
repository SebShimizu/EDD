package Arbol;

public class ABB {
	private Nodo raiz;
	public ABB(Nodo raiz){
		this.raiz=raiz;
	}
	
	public void agregar(Nodo n){
			agregar(raiz,n);
	}
	
	private  void agregar(Nodo actual,Nodo n){
		if(this.raiz == null){
			this.raiz=n;
		}else{
			if(n.getDato() < actual.getDato())
		{
			if(actual.getIzquierdo()== null){
			actual.setIzquierdo(n);
			}else{
				agregar(actual.getIzquierdo(),n);
			}
		}else{
			if(actual.getDerecho()== null){
			actual.setDerecho(n);	
			}else{
				agregar(actual.getDerecho(),n);
			}
		}
		}
	}
	
	public void mostrar(){
		mostrar(raiz);
	}
	
	private void mostrar(Nodo n){
		if(n!=null){
		System.out.println(n.getDato());
		mostrar(n.getIzquierdo());
		mostrar(n.getDerecho());
		
		
		}
	}
	

	public void buscar(int dato){
		Nodo actual=raiz;
		while(actual!=null&&actual.getDato()!=dato){
			if(dato<actual.getDato()){
				actual=actual.getIzquierdo();
			}else{
				actual=actual.getDerecho();
			}
		}
		
		System.out.println(actual.getDato());
		
	}
	
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	public Nodo getRaiz() {
		return raiz;
	}
	
}
