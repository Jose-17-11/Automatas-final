package validaciones;

import testeos.Testeos;

public class IP {
    public char estado = 'A';
    public String denegada = "";
    public boolean condicion = true;
//    a+b
    public String[][] validarExpresion(String entrada) {
    	Testeos er = new Testeos();
        char[] letras = entrada.toCharArray();
        String[][] array = new String[12][12];

        // Agregar valores vacíos al array
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                array[i][j] = "";
            }
        }

        array[0][0] = "Estado";
        array[0][1] = "0 - 9";
        array[0][2] = "0 - 9";
        array[0][3] = "0 - 9";
        array[0][4] = ".";
        array[0][5] = "0 - 9";
        array[0][6] = "0 - 9";
        array[0][7] = "0 - 9";
        array[0][8] = ".";
        array[0][9] = "0 - 9";
        array[0][10] = ".";
        array[0][11] = "0 - 9";

        array[1][0] = "A";
        array[2][0] = "B";
        array[3][0] = "C";
        array[4][0] = "D";
        array[5][0] = "E";
        array[6][0] = "F";
        array[7][0] = "G";
        array[8][0] = "H";
        array[9][0] = "I";
        array[10][0] = "J";
        array[11][0] = "K";

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
                            estado = 'L';
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
                            estado = 'L';
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
                            estado = 'L';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'D':
                    switch (letras[i]) {
                    case '.':
                        estado = 'E';
                        array[4][4] += " " + letras[i];
                        break;
                        default:
                            estado = 'L';
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
                        estado = 'F';
                        array[5][5] += " " + letras[i];
                        break;
                        default:
                            estado = 'L';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'F':
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
                            estado = 'G';
                            array[6][6] += " " + letras[i];
                            break;
                        default:
                            estado = 'L';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'G':
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
                        estado = 'H';
                        array[7][7] += " " + letras[i];
                        break;
                        default:
                            estado = 'L';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'H':
                    switch (letras[i]) {
                    case '.':
                        estado = 'I';
                        array[8][8] += " " + letras[i];
                        break;
                        default:
                            estado = 'L';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'I':
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
                        estado = 'J';
                        array[9][9] += " " + letras[i];
                        break;
                        default:
                            estado = 'L';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'J':
                    switch (letras[i]) {
                    case '.':
                        estado = 'K';
                        array[10][10] += " " + letras[i];
                        break;
                        default:
                            estado = 'L';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                    }
                    break;
                case 'K':
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
                        estado = 'K';
                        array[11][11] += " " + letras[i];
                        break;
                        default:
                            estado = 'L';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'L':
                    estado = 'L';
                    denegada += " " + letras[i];
                    condicion = false;
                    break;
            }
        }
        return array;
    }
}
