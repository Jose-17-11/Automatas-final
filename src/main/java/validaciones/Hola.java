package validaciones;

import testeos.Testeos;

public class Hola {
    public char estado = 'A';
    public String denegada = "";
    public boolean condicion = true;
//    a+b
    public String[][] validarExpresion(String entrada) {
    	Testeos er = new Testeos();
        char[] letras = entrada.toCharArray();
        String[][] array = new String[5][5];

        // Agregar valores vacíos al array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = "";
            }
        }

        array[0][0] = "Estado";
        array[0][1] = "H";
        array[0][2] = "o";
        array[0][3] = "l";
        array[0][4] = "a";

        array[1][0] = "A";
        array[2][0] = "B";
        array[3][0] = "C";
        array[4][0] = "D";

        estado = 'A';
        for (int i = 0; i < letras.length; i++) {
            switch (estado) {
                case 'A':
                    switch (letras[i]) {
                        case 'H':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        default:
                            estado = 'E';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'B':
                    switch (letras[i]) {
                    case 'o':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                        default:
                            estado = 'E';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'C':
                    switch (letras[i]) {
                    case 'l':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                        default:
                            estado = 'E';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'D':
                    switch (letras[i]) {
                    case 'a':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                        default:
                            estado = 'E';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                    }
                    break;
                case 'E':
                    estado = 'E';
                    denegada += " " + letras[i];
                    condicion = false;
                    break;
            }
        }
        return array;
    }
}
