package validaciones;


public class Adios {
    public char estado = 'A';
    public String denegada = "";
    public boolean condicion = true;
//    a+b
    public String[][] validarExpresion(String entrada) {
        char[] letras = entrada.toCharArray();
        String[][] array = new String[7][7];

        // Agregar valores vacíos al array
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = "";
            }
        }

        array[0][0] = "Estado";
        array[0][1] = "a";
        array[0][2] = "d";
        array[0][3] = "i";
        array[0][4] = "o";
        array[0][5] = "s";
        array[0][6] = "!";

        array[1][0] = "A";
        array[2][0] = "B";
        array[3][0] = "C";
        array[4][0] = "D";
        array[5][0] = "E";
        array[6][0] = "F";
        
        estado = 'A';
        for (int i = 0; i < letras.length; i++) {
            switch (estado) {
                case 'A':
                    switch (letras[i]) {
                        case 'a':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        default:
                            estado = 'G';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'B':
                    switch (letras[i]) {
                        case 'd':
                            estado = 'C';
                            array[2][2] += " " + letras[i];
                            break;
                        default:
                            estado = 'G';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'C':
                    switch (letras[i]) {
                        case 'i':
                            estado = 'D';
                            array[3][3] += " " + letras[i];
                            break;
                        default:
                            estado = 'G';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                    }
                    break;
                case 'D':
                    switch (letras[i]) {
                        case 'o':
                            estado = 'E';
                            array[4][4] += " " + letras[i];
                            break;
                        default:
                            estado = 'D';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                    }
                    break;
                case 'E':
                    switch (letras[i]) {
                        case 's':
                            estado = 'F';
                            array[5][5] += " " + letras[i];
                            break;
                        default:
                            estado = 'D';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'F':
                    switch (letras[i]) {
                        case '!':
                            estado = 'F';
                            array[6][6] += " " + letras[i];
                            break;
                        default:
                            estado = 'D';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                    }
                    break;
                case 'G':
                    estado = 'D';
                    denegada += " " + letras[i];
                    condicion = false;
                    break;
            }
        }
        return array;
    }
}
