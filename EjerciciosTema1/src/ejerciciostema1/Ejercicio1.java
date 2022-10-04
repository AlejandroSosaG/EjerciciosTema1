package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num; // Esta variable nos dirá el número con decimales que elija el usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba un número con decimales.
		System.out.println("Introduzca un número con decimales");
		// Asignamos el valor al número sumandole 0,5.
		num = sc.nextDouble() + 0.5;
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El número redondeado es " + (int)num);
		// Cerramos el escaner.
		sc.close();
	}
}
