package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1; // Esta variable es el número entero que pediremos al usuario.
		int num2; // Esta variable es de la que será múltiplo el primer número.
		int resto; // Esta variable la usaremos para calcular cuanto hay que sumarle al número para que se múltiplo de 7.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba un número entero.
		System.out.println("Introduzca un número entero");
		// Asignamos el valor del número que ha escrito el usuario.
		num1 = sc.nextInt();
		// Pedimos al usuario que escriba el valor del segundo número.
		System.out.println("Introduzca un número entero del que será múltiplo el primero");
		// Asignamos el valor del número que ha escrito el usuario.
		num2= sc.nextInt();
		// Asignamos a la variable resto el valor de la cantidad necesaria que debe sumarse al primer número para que sea múltiplo del segundo.
		resto = num2-(num1%num2);
		// Si el resto es 0 asignamos a la variable resto el valor 0 y si no es así le asignamos el valor del segundo número menos el resto
		resto = resto==0 ? 0 : num2-resto;
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("La cantidad que hay que sumarle al primer número para que sea múltiplo de " + num2 + " es " + resto);
		// Cerramos el escaner.
		sc.close();
	}

}
