import java.util.Scanner;

/**
 * Clase principal del programa. 
 * Contiene el método main para hacerlo ejecutable
 *  Es un ejercicio simple que pide dos numeros por consola y posteriormente
 *  realiza las cuatro operaciones básicas con ellos: suma, resta, multiplicacion
 *   y division
 * 
 * @author Jorge
 * @version 1
 * @since 23/04/2022
 */
public class Ejercicio {
	public static void main(String[] args) {
		// Variables para el ejercicio
		int num1 = 0;
		int num2 = 0;
		boolean valor1valido = false; // Para indicar que se cogio el numero correctamente
		boolean valor2valido = false; // Para indicar que se cogio el numero correctamente
		
		// Mostramos el inicio del programa
		System.out.println("Inicio del programa");
		
		// Cogemos el primer valor
		while(valor1valido == false) {
			Scanner teclado = new Scanner(System.in);	
			System.out.println("introduce un valor para el numero 1:");
			try {
				num1 = teclado.nextInt();
				if(num1 > 0) valor1valido = true;
				else System.out.println("Valor no valido: ");
			}
			catch(Exception e) {
				System.out.println("Valor no valido: " + e.getMessage());
			}			
		}
		
		// Cogemos el segundo valor
		while(valor2valido == false) {
			Scanner teclado = new Scanner(System.in);	
			System.out.println("introduce un valor para el numero 2:");
			try {
				num2 = teclado.nextInt();
				if(num2 > 0) valor2valido = true;
				else System.out.println("Valor no valido: ");
			}
			catch(Exception e) {
				System.out.println("Valor no valido: " + e.getMessage());
			}			
		}

		// Mostramos que vamos a trabajar con ambos números
		System.out.println("Vamos a trabajar con los numeros " + num1 + " y " + num2);
	
		// Realizamos las operaciones
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		float division = num1 / num2;
		
		// Mostramos en pantalla
		System.out.println("la suma de " + num1 + " mas " + num2 + " es "  + suma);
		System.out.println("la resta de " + num1 + " menos " + num2 + " es "  + resta);
		System.out.println("la multiplicacion de " + num1 + " por " + num2 + " es "  + multiplicacion);
		System.out.println("la division de " + num1 + " entre " + num2 + " es "  + division);
		
		// Mostramos un mensaje de final de programa
		System.out.println("Fin del programa");
	}
}
