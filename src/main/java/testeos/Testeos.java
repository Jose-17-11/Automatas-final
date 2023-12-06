package testeos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testeos {

	public boolean expresion(String ER, String cadena) {
		// Expresión regular
		String regex = ER;

		// Cadena de texto a verificar
		String texto = cadena;

		// Compilar la expresión regular en un patrón
		Pattern pattern = Pattern.compile(regex);

		// Crear un objeto Matcher para la cadena de texto
		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
//			System.out.println("La cadena cumple con la expresión regular.");
		} else {
			return false;
//			System.out.println("La cadena NO cumple con la expresión regular.");
		}
	}

	public static void main(String[] args) {
		Testeos er = new Testeos();
		System.out.println(er.expresion("^\\d{3}-\\d{3}-\\d{4}$", "123-456-7890"));
		System.out.println(er.expresion("^\\d{5}(?:-\\d{4})?$", "12345"));
		System.out.println(er.expresion("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", "usuario@example.com"));
		System.out.println(er.expresion("^(https?|ftp):\\/\\/[^\\s/$.?#].[^\\s]*$", "https://www.ejemplo.com"));
		System.out.println(er.expresion("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$", "192.168.0.1"));
		
		System.out.println("\n");
		
		System.out.println(er.expresion("^Hola$", "Hola"));
		System.out.println(er.expresion("^adios!$", "adios!"));
		System.out.println(er.expresion("^cuidate$", "cuidate"));
		System.out.println(er.expresion("^hasta luego!$", "hasta luego!"));
		System.out.println(er.expresion("^¿como estas\\?$", "¿como estas?"));
		
		System.out.println("\n");
		
		System.out.println(er.expresion("^a+b$", "a+b"));
		System.out.println(er.expresion("^a-b$", "a-b"));
		System.out.println(er.expresion("^a*b$", "a*b"));
		System.out.println(er.expresion("^a/b$", "a/b"));
		System.out.println(er.expresion("^a+b-c$", "a+b-c"));
//		
//		System.out.println(er.expresion("^\\d{3}-\\d{3}-\\d{4}$", "123-456-7890"));
//		System.out.println(er.expresion("^\\d{5}(?:-\\d{4})?$", "12345"));
//		System.out.println(er.expresion("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", "usuario@example.com"));
//		System.out.println(er.expresion("^(https?|ftp):\\/\\/[^\\s/$.?#].[^\\s]*$", "https://www.ejemplo.com"));
//		System.out.println(er.expresion("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$", "192.168.0.1"));
		
		System.out.println("\n");
		
//		Hola
//		adios
//		cuidate
//		hasta luego
//		¿como estas?
//		
//		123-456-7890
//		12345
//		usuario@example.com
//		https://www.ejemplo.com
//		192.168.0.1
//		
//		a+b
//		a-b
//		a*b
//		a/b
//		a+b-c
		
		
	}
	
}
