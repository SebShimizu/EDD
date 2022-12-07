package loteria;

import java.util.*;

public class jugador {

	LinkedList<Carta> tarjeta;

	public jugador() {
		tarjeta = new LinkedList<Carta>();
		// int num=(int)(Math.random()*54)+1;
	}

	public void llenar(Stack<Carta> baraja) {
		for (int i = 0; i < 16; i++) {
			boolean encontrado = false;
			int num = (int) (Math.random() * 54);
			for (int j = 0; j < i; j++) {
				if (tarjeta.get(j).id == baraja.get(num).id) {
					encontrado = true;
				}
			}
			if (!encontrado) {
				tarjeta.add(baraja.elementAt(num));
			} else {
				i--;
			}
		}
	}

	public void modificar(Stack<Carta> baraja) {
		Scanner leer = new Scanner(System.in);
		System.out.println("---------------------------------------");
		System.out.println("         Tu tarjeta:");
		mostrar();
		System.out.println(" ");

		boolean cambiado = false;
		do {
			int cambiar = 0;
			do {
				System.out.println("Seleccione el id de la carta a modificar:");
				cambiar = leer.nextInt();
				if (cambiar < 1 || cambiar > 54) {
					System.out.println("id no valido vuelva a ingresar");
				}
			} while (cambiar < 1 || cambiar > 54);

			int nuevo = 0;
			for (int i = 0; i < tarjeta.size(); i++) {
				if (tarjeta.get(i).id == cambiar) {
					do {
						System.out.println("Seleccione el nuevo id :");
						nuevo = leer.nextInt();
						for (int j = 0; j < tarjeta.size(); j++) {
							if (tarjeta.get(j).id == nuevo) {
								nuevo = -1;
								break;
							}
						}
						if (nuevo < 1 || nuevo > 54) {
							System.out.println("id no valido vuelva a ingresar");
						}
					} while (nuevo < 1 || nuevo > 54);
					tarjeta.set(i, baraja.get(nuevo - 1));
					cambiado = true;
					break;
				}
			}

			if (cambiado == false) {
				System.out.println("Fallo en seleccionar repetir proceso");
			}

			int eleccion = 0;
			do {
				System.out.println("¿Quiere seguir modificando?si=1 no=2");
				eleccion = leer.nextInt();
				if (eleccion > 2 || eleccion < 1) {
					System.out.println("eleccion invalida ingrese de nuevo");
				}
				if (eleccion == 1) {
					cambiado = false;
				} else if (eleccion == 2) {
					cambiado = true;
				}
			} while (eleccion > 2 || eleccion < 1);

		} while (cambiado == false);

		System.out.println("---------------------------------------");
		System.out.println("         Tu tarjeta:");
		mostrar();

	}

	public void mostrar() {
		System.out.println("---------------------------------------");
		for (Carta carta : tarjeta) {
			System.out.println(carta.id + "  " + carta.getNombre());	
		}
		System.out.println("---------------------------------------");
	}

	
}
