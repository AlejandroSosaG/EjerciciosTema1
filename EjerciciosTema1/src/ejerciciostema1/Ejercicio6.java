package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundos; // Esta variable es la cantidad de segundos que pediremos al usuario.
		int minutos; // Esta variable es la cantidad de minutos que obtendremos de los segundos.
		int horas; // Esta variable es la cantidad de horas que obtendremos de los segundos.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba la cantidad de segundos.
		System.out.println("Introduzca la cantidad de segundos que desea transformar");
		// Asignamos el valor de segundos que ha escrito el usuario.
		segundos= sc.nextInt();
		// Asignamos a la variable minutos el valor de minutos que obtenemos de los segundos mendiante un cáculo.
		minutos = (int)segundos/60;
		// Reducimos la cantidad de segundos despues de tranformarlos en minutos.
		segundos=segundos%60;
		// Asignamos a la variable horas el valor de horas que obtenemos de los minutos obtenidos mendiante un cáculo.
		horas= (int)minutos/60;
		// Reducimos la cantidad de minutos despues de transformarlos en horas.
		minutos= minutos%60;
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("La cantidad de horas minutos y segundo obtenidos es " + horas + " h "+ minutos + " min " + segundos + " s");
		// Cerramos el escaner.
		sc.close();
	}

}
