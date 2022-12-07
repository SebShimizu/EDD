package loteria;

import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Loteria loteria = new Loteria();
		jugador j1 = new jugador();
		jugador j2 = new jugador();
		j1.llenar(loteria.baraja);
		j2.llenar(loteria.baraja);
		// loteria.mostrar();
		int elegir = 0;
		do {
			System.out.println("Menu de J1" + "\n" + "1-. modificar tu tarjeta" + "\n" + "2-. mostrar tarjeta" + "\n"
					+ "3-. continuar juego");

			do {
				System.out.println("Elegir opcion:");
				elegir = leer.nextInt();
				if (elegir > 3 || elegir < 1) {
					System.out.println("Opcion invalida eliga una opcion valida");
				}
			} while (elegir > 3 || elegir < 1);
			switch (elegir) {
			case 1:
				j1.modificar(loteria.baraja);
				break;
			case 2:
				j1.mostrar();
				break;
			case 3:
				System.out.println("Continuando menu jugador 2");
				break;
			default:
				break;
			}
		} while (elegir != 3);
	
		for (int i = 0; i < 75; ++i) System.out.println();

		elegir = 0;
		System.out.println("-----------------------------------------------------");
		do {

			System.out.println("Menu de J2" + "\n" + "1-. modificar tu tarjeta" + "\n" + "2-. mostrar tarjeta" + "\n"
					+ "3-. continuar juego");

			do {
				System.out.println("Elegir opcion:");
				elegir = leer.nextInt();
				if (elegir > 3 || elegir < 1) {
					System.out.println("Opcion invalida eliga una opcion valida");
				}
			} while (elegir > 3 || elegir < 1);
			switch (elegir) {
			case 1:
				j2.modificar(loteria.baraja);
				break;
			case 2:
				j2.mostrar();
				break;
			case 3:
				System.out.println("Continuando menu de juego");
				break;
			default:
				break;
			}
		} while (elegir != 3);
			
		for (int i = 0; i < 75; ++i) System.out.println();
		
		loteria.barajear();
		System.out.println("-----------------------------------------------------");
		loteria.barajear();
		int cont1 = 0;
		int cont2 = 0;
		boolean ganador=false;
		do {
			loteria.jugado.add(loteria.baraja.pop());
			System.out.println("Carta jugada: " + loteria.jugado.peek().nombre+" id:"+loteria.jugado.peek().id);
			cont1 = loteria.contador(j1.tarjeta, cont1, loteria.jugado.peek(), 1);
			cont2 = loteria.contador(j2.tarjeta, cont2, loteria.jugado.peek(), 2);
			if(cont1==16) {
				ganador=true;
			}
			if(cont2==16) {
				ganador=true;
			}
			System.out.println("-----------------------------------------------------");
		} while (ganador==false);
		
		if(cont1==16&&cont2==16) {
			System.out.println("Empate");
		}
		if(cont1==16) {
		System.out.println("Ganador jugador 1");
		}
		if(cont2==16) {
			System.out.println("Ganador jugador 2");
			}
		
	}
	
	

}
