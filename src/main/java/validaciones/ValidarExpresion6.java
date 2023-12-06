package validaciones;

import testeos.Testeos;

public class ValidarExpresion6 {
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
            for (int j = 0; j < 5; j++) {
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
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '1':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '2':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '3':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '4':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '5':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '6':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '7':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '8':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '9':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        default:
                            estado = 'C';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'B':
                    switch (letras[i]) {
                    case '0':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '1':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '2':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '3':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '4':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '5':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '6':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '7':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '8':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                    case '9':
                        estado = 'C';
                        array[2][2] += " " + letras[i];
                        break;
                        default:
                            estado = 'D';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'C':
                    switch (letras[i]) {
                    case '0':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '1':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '2':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '3':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '4':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '5':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '6':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '7':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '8':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                    case '9':
                        estado = 'D';
                        array[3][3] += " " + letras[i];
                        break;
                        default:
                            estado = 'D';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                    }
                    break;
                case 'D':
                    switch (letras[i]) {
                    case '0':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '1':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '2':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '3':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '4':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '5':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '6':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '7':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '8':
                        estado = 'D';
                        array[4][4] += " " + letras[i];
                        break;
                    case '9':
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
                    switch (letras[i]) {
                    case '0':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                    case '1':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                    case '2':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                    case '3':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                    case '4':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                    case '5':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                    case '6':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                    case '7':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
                    case '8':
                        estado = 'E';
                        array[5][5] += " " + letras[i];
                        break;
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
