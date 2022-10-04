package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base; // Esta variable es la base del triángulo que pediremos al usuario.
		double altura; // Esta variable es la altura del triángulo que pediremos al usuario.
		double area; // Esta variable es el área del triángulo.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba la base del triángulo.
		System.out.println("Introduzca la base del triángulo que desea");
		// Asignamos el valor de la base que ha escrito el usuario.
		base= sc.nextDouble();
		// Pedimos al usuario que escriba el valor de la altura del triángulo.
		System.out.println("Introduzca la altura del triángulo que desea");
		// Asignamos el valor de la altura que ha escrito el usuario.
		altura= sc.nextDouble();
		// Asignamos a la variable area el valor del área del triángulo mendiante un cáculo.
		area = (base*altura/2);
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El área del triángulo es " + area);
		// Cerramos el escaner.
		sc.close();
	}

}
