package es.studium.anyo2030;

import java.util.Scanner;

public class anyo2030 {

	public static void main(String[] args) 
	{
		String nombre;
		int anyo;
		
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
																
		System.out.println("�C�al es t� nombre?");
		nombre = teclado.next();
																	
		System.out.println("�C�al es t� a�o nacimiento?");
		anyo = teclado.nextInt();
		
		System.out.println("Hola "+nombre+", en el a�o 2030 tendras "+(2030-anyo)+" a�os");
		
		teclado.close();

	}

}
