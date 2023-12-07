package validaciones;


public class ExpresionesMatematicas {
    public char estado = 'A';
    public String denegada = "";
    public boolean condicion = true;
//    a+b
    public String[][] validarExpresion(String entrada) {
        char[] letras = entrada.toCharArray();
        String[][] array = new String[4][4];

        // Agregar valores vacíos al array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = "";
            }
        }

        array[0][0] = "Estado";
        array[0][1] = "a";
        array[0][2] = "+";
        array[0][3] = "b";

        array[1][0] = "A";
        array[2][0] = "B";
        array[3][0] = "C";

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
                            estado = 'C';
                            denegada += " " + letras[i];
                            break;
                    }
                    break;
                case 'B':
                    switch (letras[i]) {
                        case '+':
                            array[0][2] = "+";
                            estado = 'C';
                            array[2][2] += " " + letras[i];
                            break;
                        case '-':
                            array[0][2] = "-";
                            estado = 'C';
                            array[2][2] += " " + letras[i];
                            break;
                        case '*':
                            array[0][2] = "*";
                            estado = 'C';
                            array[2][2] += " " + letras[i];
                            break;
                        case '/':
                            array[0][2] = "/";
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
                        case 'b':
                            estado = 'C';
                            array[3][3] += " " + letras[i];
                            break;
                        case '+':
                        case '-':
                        case '*':
                        case '/':
                        	estado = 'D';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                        case ' ':
                        	estado = 'D';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                        default:
                            estado = 'D';
                            denegada += " " + letras[i];
                            condicion = false;
                            break;
                    }
                    break;
                case 'D':
                    estado = 'D';
                    denegada += " " + letras[i];
                    condicion = false;
                    break;
            }
        }
        return array;
    }
}


//public String[][] validarExpresion2(String entrada) {
//    char[] letras = entrada.toCharArray();
//    String[][] array = new String[5][4];
//
//    // Agregar valores vacíos al array
//    for (int i = 0; i < 5; i++) {
//        for (int j = 0; j < 4; j++) {
//            array[i][j] = "";
//        }
//    }
//
//    array[0][0] = "Estado";
//    array[0][1] = "a";
//    array[0][2] = "+";
//    array[0][3] = "b";
//
//    array[1][0] = "A";
//    array[2][0] = "B";
//    array[3][0] = "C";
//    array[4][0] = "D";
//
//    estado = 'A';
//    for (int i = 0; i < letras.length; i++) {
//        switch (estado) {
//            case 'A':
//                switch (letras[i]) {
//                    case 'a':
//                        estado = 'B';
//                        array[1][1] += " " + letras[i];
//                        break;
//                    default:
//                        estado = 'C';
//                        denegada += " " + letras[i];
//                        break;
//                }
//                break;
//            case 'B':
//                switch (letras[i]) {
//                    case '+':
//                        estado = 'C';
//                        array[2][2] += " " + letras[i];
//                        break;
//                    case '-':
//                        estado = 'C';
//                        array[2][2] += " " + letras[i];
//                        break;
//                    case '*':
//                        estado = 'C';
//                        array[2][2] += " " + letras[i];
//                        break;
//                    case '/':
//                        estado = 'C';
//                        array[2][2] += " " + letras[i];
//                        break;
//                    default:
//                        estado = 'D';
//                        denegada += " " + letras[i];
//                        break;
//                }
//                break;
//            case 'C':
//                switch (letras[i]) {
//                    case 'b':
//                        estado = 'C';
//                        array[3][3] += " " + letras[i];
//                        break;
//                    default:
//                        estado = 'D';
//                        denegada += " " + letras[i];
//                        break;
//                }
//                break;
//            case 'D':
//                estado = 'D';
//                denegada += " " + letras[i];
//                condicion = false;
//                break;
//        }
//    }
//    return array;
//}
//}