import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean valor1valido = false;
		boolean valor2valido = false;
		
		System.out.println("Inicio del programa");
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

		System.out.println("Vamos a trabajar con los numeros " + num1 + " y " + num2);
	
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		float division = num1 / num2;
		
		System.out.println("la suma de " + num1 + " mas " + num2 + " es "  + suma);
		System.out.println("la resta de " + num1 + " menos " + num2 + " es "  + resta);
		System.out.println("la multiplicacion de " + num1 + " por " + num2 + " es "  + multiplicacion);
		System.out.println("la division de " + num1 + " entre " + num2 + " es "  + division);
		
		
		System.out.println("Fin del programa");
	}
}
