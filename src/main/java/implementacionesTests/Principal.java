package implementacionesTests;

import java.io.File;

public class Principal {
	public static void main(String[] args) {
		String ruta = "C:\\Users\\Jose Manuel\\eclipse-workspace\\proyectoFinal\\src\\main\\java\\implementacionesTests\\Lexer.flex";
		generarLexer(ruta);
	}
	
	public static void generarLexer(String ruta) {
		File archivo = new File(ruta);
		jflex.Main.generate(archivo);
	}
}
