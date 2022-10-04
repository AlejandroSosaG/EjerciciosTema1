package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // Esta variable es el número entero que pediremos al usuario.
		int resto; // Esta variable la usaremos para calcular cuanto hay que sumarle al número para que se múltiplo de 7.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba un número entero.
		System.out.println("Introduzca un número entero");
		// Asignamos el valor del número que ha escrito el usuario.
		num = sc.nextInt();
		// Asignamos a la variable resto el valor de la cantidad necesaria que debe sumarse al número para que sea múltiplo de 7.
		resto = (num%7);
		// Si el resto es 0 asignamos a la variable resto el valor 0 y si no es así le asignamos el valor de 7 menos el resto
		resto = resto==0 ? 0 : 7-resto;
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("La cantidad que hay que sumar para que el número sea múltiplo de 7 es " + resto);
		// Cerramos el escaner.
		sc.close();
	}

}
