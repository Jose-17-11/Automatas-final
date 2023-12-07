package validaciones;

import testeos.Testeos;

public class CodigoPostal {
    public char estado = 'A';
    public String denegada = "";
    public boolean condicion = true;
//    a+b
    public String[][] validarExpresion(String entrada) {
    	Testeos er = new Testeos();
        char[] letras = entrada.toCharArray();
        String[][] array = new String[6][6];

        // Agregar valores vacíos al array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = "";
            }
        }

        array[0][0] = "Estado";
        array[0][1] = "0 - 9";
        array[0][2] = "0 - 9";
        array[0][3] = "0 - 9";
        array[0][4] = "0 - 9";
        array[0][5] = "0 - 9";

        array[1][0] = "A";
        array[2][0] = "B";
        array[3][0] = "C";
        array[4][0] = "D";
        array[5][0] = "E";

        estado = 'A';
        for (int i = 0; i < letras.length; i++) {
            switch (estado) {
                case 'A':
                    switch (letras[i]) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        default:
                            estado = 'F';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'B':
                    switch (letras[i]) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                        default:
                            estado = 'F';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'C':
                    switch (letras[i]) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                        default:
                            estado = 'F';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'D':
                    switch (letras[i]) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        estado = 'E';
                        array[4][4] += " " + letras[i];
                        break;
                        default:
                            estado = 'F';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'E':
                    switch (letras[i]) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                        default:
                            estado = 'F';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                    }
                    break;
                case 'F':
                    estado = 'F';
                    denegada += " " + letras[i];
                    condicion = false;
                    break;
            }
        }
        return array;
    }
}
