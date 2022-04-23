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
		
		// Mostramos el inicio del programa
		System.out.println("Inicio del programa");
		
		num1 = sacarNumero();
		num2 = sacarNumero();
		
		// Mostramos que vamos a trabajar con ambos números
		System.out.println("Vamos a trabajar con los numeros " + num1 + " y " + num2);
	
		// Realizamos las operaciones
		int suma = sumar(num1, num2);
		int resta = restar(num1, num2);
		int multiplicacion = multiplicar(num1, num2);
		float division = dividir(num1, num2);
		
		// Mostramos en pantalla
		mostrarResultados(num1, num2, suma, resta, multiplicacion, division);
		
		// Mostramos un mensaje de final de programa
		System.out.println("Fin del programa");
	}

	// Metodo para mostrar los resultados en pantalla
	private static void mostrarResultados(int num1, int num2, int suma, int resta, int multiplicacion, float division) {
		System.out.println("la suma de " + num1 + " mas " + num2 + " es "  + suma);
		System.out.println("la resta de " + num1 + " menos " + num2 + " es "  + resta);
		System.out.println("la multiplicacion de " + num1 + " por " + num2 + " es "  + multiplicacion);
		System.out.println("la division de " + num1 + " entre " + num2 + " es "  + division);
	}

	// Metodo para dividir dos numeros. Coge 2 enteros y devuelve un valor float
	private static float dividir(int num1, int num2) {
		float division = num1 / num2;
		return division;
	}

	// Metodo para multiplicar 2 enteros y devuelve un entero con el resultado
	private static int multiplicar(int num1, int num2) {
		int multiplicacion = num1 * num2;
		return multiplicacion;
	}

	// Metodo para restar 2 enteros y devuelve un entero con el resultado
	private static int restar(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}

	// Metodo para sumar 2 enteros y devuelve un entero con el resultado
	private static int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}

	// Metodo para pedir un numero entero positivo y devolverlo. En el caso de que sea
	//  un valor no válido, seguirá pidiendo valores hasta obtener uno válido
	private static int sacarNumero() {
		// Cogemos el primer valor
		boolean valido = false;
		int num =0;
		
		while(valido == false) {
			Scanner teclado = new Scanner(System.in);	
			System.out.println("introduce un valor para el numero 1:");
			try {
				num = teclado.nextInt();
				if(num > 0) valido = true;
				else System.out.println("Valor no valido: ");
			}
			catch(Exception e) {
				System.out.println("Valor no valido: " + e.getMessage());
			}			
		}
		return num;
	}
}
