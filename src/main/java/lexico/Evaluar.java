package lexico;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class Evaluar {
    public static void main (String args[]) throws IOException {
    	String cadena = "Hola";
        // Configura el analizador léxico
        Lexer lexer = new Lexer(null);

        // Crea un StringReader desde la cadena ingresada
        StringReader reader = new StringReader(cadena);

        // Configura el StringReader para el analizador léxico
        lexer.yyreset(reader);

        // Llama al método yylex para analizar la cadena
        try {
            Tokens token;
            while ((token = lexer.yylex()) != null) {
                System.out.println("Token: " + token + ", Lexema: " + lexer.lexeme);
            }
//        	return true;
        } catch (Error e) {
            // Captura la excepción y muestra el mensaje en la consola
            System.out.println("La cadena ingresada no es valida: ");
//        	return false;
        }
    }
}
