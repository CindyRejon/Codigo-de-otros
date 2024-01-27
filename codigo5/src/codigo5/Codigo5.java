package codigo5; //se añadio package

import java.util.Scanner; // se importo la clase scanner, que se utiliza para leer la entrada del usuario desde la consola

public class Codigo5 {
	
	

	public static void main(String[] args) { // se añadio el modo público

		Scanner s = new Scanner(System.in); // se agrego un try
		System.out.print("Introduzca un número: "); // estaba mal la coma, ya se corrigio
		int ni = s.nextInt();

		int afo = 0; // se ingreso un numero afortunado
		int noAfo = 9;

		while (ni > 8 ) { // se cambio el ni por c
			int digito = ni % 10; // se quito el entero int y las comillas
			if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
				afo++;
			} else {
				noAfo++;
			}
			ni /= 10; //// se cambio el ni por c
		}

		if (afo > noAfo) {
			System.out.println("El " + ni + " es un número afortunado.");
		} else {
			System.out.println("El " + ni + " no es un número afortunado.");
		}
		s.close();
	}

}
