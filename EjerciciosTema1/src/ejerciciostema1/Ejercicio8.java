package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de variables.
		double entradasInfantiles; // Esta variable es la cantidad de entradas infantiles vendidas.
		double entradasAdultos; // Esta variable es la cantidad de entradas de adultos vendidas.
		double importe; // Esta variable pertenece a la suma total de ventas entre los dos tipos de entradas.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca una cantidad de ventas pertenecientes a las entradas infantiles.
		System.out.println("Introduzca la cantidad de entradas infantiles que se han comprado");
		// Asignamos a la variable entradasInfantiles la cantidad elegida por el usuario.
		entradasInfantiles= sc.nextDouble();
		// Pedimos al usuario que introduzca una cantidad de ventas pertenecientes a las entradas infantiles.
		System.out.println("Introduzca la cantidad de entradas de adultos que se han comprado");
		// Asignamos a la variable entradasAdultos la cantidad elegida por el usuario.
		entradasAdultos=sc.nextDouble();
		// Calculamos las ventas totales de las entradas infantiles.
		entradasInfantiles*=15.50;
		// Calculamos las ventas totales de las entradas de adultos.
		entradasAdultos*=20;
		// Asignamos a importe la suma de ventas que se han generado entre las entradas infantiles y las de adultos.
		importe = entradasInfantiles+entradasAdultos;
		// Si el impporte es inferior a 100 le dejamos el mismo valor y si no es así le descontamos el 5%.
		importe = importe<100? importe : (importe-(importe*5/100));
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El importe total por la compra de ambas entradas es " + importe);
		// Cerramos el escaner.
		sc.close();
	}

}
