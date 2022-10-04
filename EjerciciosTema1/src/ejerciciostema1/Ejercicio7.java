package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de variables.
		int mili; // Esta variable pertenece a la distancia medida en milímetros.
		int centi; // Esta variable pertenece a la distancia medida en centímetros.
		int metro; // Esta variable pertenece a la distancia medida en metros.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba un número entero para la primera distancia.
		System.out.println("Escriba la primera distancia medida en milímetros");
		// Asignamos a la variable mili el valor que ha escrito el usuario.
		mili= sc.nextInt();
		// Pedimos al usuario que escriba un número entero para la segunda distancia.
		System.out.println("Escriba la segunda distancia medida en centímetros");
		// Asignamos a la variable mili el valor que ha escrito el usuario.
		centi= sc.nextInt();
		// Pedimos al usuario que escriba un número entero para la tercera distancia.
		System.out.println("Escriba la tercera distancia medida en metros");
		// Asignamos a la variable mili el valor que ha escrito el usuario.
		metro= sc.nextInt();
		// Le sumamos a la variable centi la cantidad de milímetros pasados a cetímetros.
		centi+=(int)(mili/10);
		// Le restamos a la variable mili la cantidad transformada.
		mili%=10;
		// Le sumamos a la variable centi la cantidad de metros pasados a cetímetros.
		centi+=(int)(metro*10);
		// Vaciamos la variable metro puesto que no sobra nada de la transformación a centímetros.
		metro=0;
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("La suma de las tres distancias medidas en centímetros es " + centi);
		// Cerramos el escaner.
		sc.close();
	}

}
