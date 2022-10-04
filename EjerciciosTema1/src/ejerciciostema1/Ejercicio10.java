package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num; // Esta variable pertenece a la longitud del lanzamiento medida en metros.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba la longitud medida en metros.
		System.out.println("Introduzca la longitud del lanzamiento en metros");
		// Asignamos a la variable num el valor elegido por el usuario.
		num = sc.nextDouble();
		// Pasamos a centímetros la variable num multiplicando su valor por 100.
		num *= 100;
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("La parte entera de la longitud del lanzamiento medida en centímetros es " + (int)num);
		// Cerramos el escaner.
		sc.close();
	}

}
