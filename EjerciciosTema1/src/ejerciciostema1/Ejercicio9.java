package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de variables.
		int num; // Esta variable pertenece al primer número.
		int num2; // Esta variable pertenece al segundo número.
		boolean iguales; // Esta variable nos dirá si ambos números son iguales o no.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba el valor del primer número.
		System.out.println("Introduzca el primer número");
		// Asignamos a num el valor elegido por el usuario.
		num= sc.nextInt();
		// Pedimos al usuario que escriba el valor del segundo número.
		System.out.println("Introduzca el segundo número");
		// Asignamos a num2 el valor elegido por el usuario.
		num2= sc.nextInt();
		// Si los números son iguales asignamos a la variable iguales el valor true, en caso contrario asignamos false.
		iguales = num==num2? true : false;		
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("Ambos números son iguales? " + iguales);
		// Cerramos el escaner.
		sc.close();
	}

}
