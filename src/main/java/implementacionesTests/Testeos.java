package implementacionesTests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testeos {

	public boolean number(String ER, String cadena) {
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
	
	public boolean cp(String ER, String cadena) {
		String regex = ER;

		String texto = cadena;
		
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean mail(String ER, String cadena) {
		String regex = ER;

		String texto = cadena;

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean url(String ER, String cadena) {
		String regex = ER;

		String texto = cadena;

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean ip(String ER, String cadena) {
		String regex = ER;

		String texto = cadena;

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	/********************************************  Lenguaje Natural  **********************************************************/
	public boolean hola(String ER, String cadena) {
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
	
	public boolean adios(String ER, String cadena) {
		String regex = ER;

		String texto = cadena;
		
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean cuidate(String ER, String cadena) {
		String regex = ER;

		String texto = cadena;

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hastaLuego(String ER, String cadena) {
		String regex = ER;

		String texto = cadena;

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean comoEstas(String ER, String cadena) {
		String regex = ER;

		String texto = cadena;

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(texto);

		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Testeos er = new Testeos();
		System.out.println(er.number("^\\d{3}-\\d{3}-\\d{4}$", "123-456-7890"));
		System.out.println(er.cp("^\\d{5}(?:-\\d{4})?$", "12345"));
		System.out.println(er.mail("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", "usuario@example.com"));
		System.out.println(er.url("^(https?|ftp):\\/\\/[^\\s/$.?#].[^\\s]*$", "https://www.ejemplo.com"));
		System.out.println(er.ip("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$", "192.168.0.1"));
		
		System.out.println("\n");
		
		System.out.println(er.hola("^Hola$", "Hola"));
		System.out.println(er.adios("^adios!$", "adios!"));
		System.out.println(er.cuidate("^cuidate$", "cuidate"));
		System.out.println(er.hastaLuego("^hasta luego!$", "hasta luego!"));
		System.out.println(er.comoEstas("^¿como estas\\?$", "¿como estas?"));
	}
	
}
