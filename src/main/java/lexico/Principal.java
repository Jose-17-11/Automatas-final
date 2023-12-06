package lexico;

import java.io.File;

import jflex.exceptions.SilentExit;

public class Principal {
	public static void main(String[] args) throws SilentExit {
		String ruta = "/home/jose-manuel/eclipse-workspace/Automatas-final/src/main/java/lexico/Lexer.flex";
		generarLexer(ruta);
	}
	
	public static void generarLexer(String ruta) throws SilentExit {
	    String[] opciones = { ruta };
	    jflex.Main.generate(opciones);
	}

}
