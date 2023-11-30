package testeos;

import java.util.Scanner;

public class Sintactico {

    public String sintactico(String cadena) {
        Scanner scanner = new Scanner(System.in);

        return verificarCadena(cadena);
    }

    private static String verificarCadena(String cadena) {
        String palabraSimilar = encontrarPalabraSimilar(cadena);

        if (palabraSimilar != null) {
            if (cadena.equalsIgnoreCase(palabraSimilar)) {
                return "La cadena ingresada es igual a '" + palabraSimilar + "'.";
            } else {
                String diferencia = obtenerDiferencia(palabraSimilar, cadena);
                System.out.println("La cadena ingresada es similar a '" + palabraSimilar + "'.");
                return "Caracteres que faltan para que sea igual: " + diferencia;
            }
        } else {
            return "La cadena no coincide con ninguna palabra conocida.";
        }
    }

    public static String obtenerDiferencia(String cadenaCompleta, String palabraSimilar) {
        StringBuilder letrasFaltantes = new StringBuilder();

        for (int i = 0; i < cadenaCompleta.length(); i++) {
            char letra = cadenaCompleta.charAt(i);
            if (palabraSimilar.indexOf(letra) == -1) {
                letrasFaltantes.append(letra);
            }
        }

        return letrasFaltantes.toString();
    }


    private static boolean verificarHola(String cadena) {
        return verificarSecuencia(cadena, "Hola");
    }

    private static boolean verificarAdios(String cadena) {
        return verificarSecuencia(cadena, "adios");
    }

    private static boolean verificarCuidate(String cadena) {
        return verificarSecuencia(cadena, "cuidate");
    }

    private static boolean verificarHastaLuego(String cadena) {
        return verificarSecuencia(cadena, "hasta luego");
    }

    private static boolean verificarComoEstas(String cadena) {
        return verificarSecuencia(cadena, "¿como estas?");
    }

    private static boolean verificarNumeroTelefono(String cadena) {
        return cadena.matches("^\\d{3}-\\d{3}-\\d{4}$");
    }

    private static boolean verificarCodigoPostal(String cadena) {
        return cadena.matches("^\\d{5}(?:-\\d{4})?$");
    }

    private static boolean verificarCorreoElectronico(String cadena) {
        return cadena.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    private static boolean verificarURL(String cadena) {
        return cadena.matches("^(https?|ftp):\\/\\/[^\\s/$.?#].[^\\s]*$");
    }

    private static boolean verificarDireccionIP(String cadena) {
        return cadena.matches("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
    }

    private static boolean verificarOperacionMatematica(String cadena) {
        return cadena.matches("^[a-zA-Z0-9]+([-+*/][a-zA-Z0-9]+)*$");
    }

    private static boolean verificarSecuencia(String cadena, String palabra) {
        String palabraSimilar = encontrarPalabraSimilar(cadena);
        if (palabraSimilar != null) {
            System.out.println("La cadena ingresada es similar a '" + palabraSimilar + "'.");
            return true;
        } else {
            System.out.println("La cadena no coincide con ninguna palabra conocida.");
            return false;
        }
    }

    private static String encontrarPalabraSimilar(String cadena) {
        String[] palabras = {
                "Hola",
                "adios",
                "cuidate",
                "hasta luego",
                "¿como estas?",
                "123-456-7890",
                "12345",
                "usuario@example.com",
                "https://www.ejemplo.com",
                "192.168.0.1",
                "a+b",
                "a-b",
                "a*b",
                "a/b",
                "a+b-c"
        };

        int distanciaMinima = Integer.MAX_VALUE;
        String palabraSimilar = null;

        for (String palabra : palabras) {
            int distancia = calcularDistanciaLevenshtein(cadena.toLowerCase(), palabra.toLowerCase());
            if (distancia < distanciaMinima) {
                distanciaMinima = distancia;
                palabraSimilar = palabra;
            }
        }

        if (distanciaMinima <= 3) {
            return palabraSimilar;
        } else {
            return null;
        }
    }

    private static int calcularDistanciaLevenshtein(String s1, String s2) {
        int[][] distancia = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            distancia[i][0] = i;
        }

        for (int j = 0; j <= s2.length(); j++) {
            distancia[0][j] = j;
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                int costo = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                distancia[i][j] = Math.min(Math.min(distancia[i - 1][j] + 1, distancia[i][j - 1] + 1), distancia[i - 1][j - 1] + costo);
            }
        }

        return distancia[s1.length()][s2.length()];
    }
}
