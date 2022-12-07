package Arbol;

public class Nodo {
	private Nodo izquierdo,derecho;
	private int dato;
	public Nodo(int dato){
		this.dato=dato;
		this.izquierdo=null;
		this.derecho=null;
		
	}
	public Nodo(){
		this(0);
		 }
	public void setIzquierdo(Nodo izquierdo) {
		this.izquierdo = izquierdo;
	}
	public void setDerecho(Nodo derecho) {
		this.derecho = derecho;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getIzquierdo() {
		return izquierdo;
	}
	public Nodo getDerecho() {
		return derecho;
	}
	public int getDato() {
		return dato;
	}
}
