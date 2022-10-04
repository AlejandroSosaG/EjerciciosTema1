package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; // Esta es la variable a que pediremos al usuario.
		int b; // Esta es la variable b que pediremos al usuario.
		int c; // Esta es la variable c que pediremos al usuario.
		int x; // Esta es la variable x que pediremos al usuario.
		int y; // Esta es la variable y cuyo valor calcularemos a partir de las otras 3 variables.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba el valor de la primera variable.
		System.out.println("Introduzca el valor de a");
		// Asignamos el valor de la primera variable que ha escrito el usuario.
		a= sc.nextInt();
		// Pedimos al usuario que escriba el valor de la segunda variable.
		System.out.println("Introduzca el valor de b");
		// Asignamos el valor de la segunda variable que ha escrito el usuario.
		b= sc.nextInt();
		// Pedimos al usuario que escriba el valor de la tercera variable.
		System.out.println("Introduzca el valor de c");
		// Asignamos el valor de la tercera variable que ha escrito el usuario.
		c= sc.nextInt();
		// Pedimos al usuario que escriba el valor de la cuarta variable.
		System.out.println("Introduzca el valor de x");
		// Asignamos el valor de la cuarta variable que ha escrito el usuario.
		x= sc.nextInt();
		// Calculamos el valor de la incógnita utilizando las otras 3 variables.
		y = ((a*x*x)+(b*x)+c);
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El valor de y es " + y);
		// Cerramos el escaner.
		sc.close();
	}

}
