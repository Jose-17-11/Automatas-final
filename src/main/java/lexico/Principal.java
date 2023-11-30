package lexico;

import java.io.File;

public class Principal {
	public static void main(String[] args) {
		String ruta = "/home/jose-manuel/eclipse-workspace/Automatas-final/src/main/java/implementacionesTests/Lexer.flex";
		generarLexer(ruta);
	}
	
	public static void generarLexer(String ruta) {
		File archivo = new File(ruta);
		jflex.Main.generate(archivo);
	}
}
