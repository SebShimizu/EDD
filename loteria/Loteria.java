package loteria;

import java.util.*;

public class Loteria {

	Stack<Carta> baraja;
	Stack<Carta> jugado;

	public Loteria() {
		baraja = new Stack<Carta>();
		jugado = new Stack<Carta>();
		agregarCartas();
		// mostrar();
		// repartir();
	}

	private void repartir() {
		int cont;
		while (!baraja.isEmpty()) {
			System.out.println("Salio: " + baraja.pop().getNombre());
		}
	}

	public void mostrar() {
		for (Carta carta : baraja) {
			System.out.println(carta.getNombre());
		}
	}

	public  int contador(LinkedList<Carta> j, int cont, Carta c1,int jugador) {
		for (Carta carta : j) {
			if (carta.id == c1.id) {
				cont++;
				System.out.println("Carta encontrada en jugador: j"+jugador+" Cartas restantes: "+cont);
				
			}
		}
		return cont;
	}

	private void agregarCartas() {
		baraja.add(new Carta("El gallo", 1));
		baraja.add(new Carta("El diablo", 2));
		baraja.add(new Carta("La dama", 3));
		baraja.add(new Carta("El catrin", 4));
		baraja.add(new Carta("El paraguas", 5));
		baraja.add(new Carta("La sirena", 6));
		baraja.add(new Carta("La escalera", 7));
		baraja.add(new Carta("La botella", 8));
		baraja.add(new Carta("El barril", 9));
		baraja.add(new Carta("El arbol", 10));
		baraja.add(new Carta("El melon", 11));
		baraja.add(new Carta("El valiente", 12));
		baraja.add(new Carta("El gorrito", 13));
		baraja.add(new Carta("La muerte", 14));
		baraja.add(new Carta("La pera", 15));
		baraja.add(new Carta("La bandera", 16));
		baraja.add(new Carta("El bandolon", 17));
		baraja.add(new Carta("El violoncello", 18));
		baraja.add(new Carta("La garza", 19));
		baraja.add(new Carta("El pajaro", 20));
		baraja.add(new Carta("La mano", 21));
		baraja.add(new Carta("La bota", 22));
		baraja.add(new Carta("La luna", 23));
		baraja.add(new Carta("El cotorro", 24));
		baraja.add(new Carta("El borracho", 25));
		baraja.add(new Carta("El negrito", 26));
		baraja.add(new Carta("El corazon", 27));
		baraja.add(new Carta("La sandia", 28));
		baraja.add(new Carta("El tambor", 29));
		baraja.add(new Carta("El camaron", 30));
		baraja.add(new Carta("las jaras", 31));
		baraja.add(new Carta("El musico", 32));
		baraja.add(new Carta("La ara�a", 33));
		baraja.add(new Carta("El soldado", 34));
		baraja.add(new Carta("La estrella", 35));
		baraja.add(new Carta("El caso", 36));
		baraja.add(new Carta("El mundo", 37));
		baraja.add(new Carta("El apache", 38));
		baraja.add(new Carta("El nopal", 39));
		baraja.add(new Carta("El alacran", 40));
		baraja.add(new Carta("La rosa", 41));
		baraja.add(new Carta("La calavera", 42));
		baraja.add(new Carta("La campana", 43));
		baraja.add(new Carta("El cantarito", 44));
		baraja.add(new Carta("El venado", 45));
		baraja.add(new Carta("El sol", 46));
		baraja.add(new Carta("La corona", 47));
		baraja.add(new Carta("La chalupa", 48));
		baraja.add(new Carta("El pino", 49));
		baraja.add(new Carta("El pescado", 50));
		baraja.add(new Carta("La palma", 51));
		baraja.add(new Carta("La maseta", 52));
		baraja.add(new Carta("El arpa", 53));
		baraja.add(new Carta("La rana", 54));

	}

	public void barajear() {
		Collections.shuffle(baraja);
	}
}
