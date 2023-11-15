package validaciones;

public class ValidarExpresion2 {
    public char estado = 'B';
    public String denegada = "";
    public boolean condicion = true;
    
    public String[][] validarExpresion(String entrada) {
        char[] letras = entrada.toCharArray();
        String[][] array = new String[7][7];
        
        //Agregar valores vacios al array
        for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = "";
			}
		}
        
        for (int i = 0; i < letras.length; i++) {
			switch(letras[i]) {
			case 'B':
			case 'C':
			case 'D':
			case 'H':
			case 'A':
			case 'E':
				condicion = true;
				break;
				default:
					condicion = false;
			}
		}
        

        array[0][0] = "Estado";
        array[0][1] = "B";
        array[0][2] = "C";
        array[0][3] = "D";
        array[0][4] = "H";
        array[0][5] = "A";
        array[0][6] = "E";

        array[1][0] = "A";
        array[2][0] = "B";
        array[3][0] = "C";
        array[4][0] = "D";
        array[5][0] = "E";
        array[6][0] = "F";
        
        estado = 'A';
        for (int i = 0; i<letras.length; i++) {
            switch (estado) {
                case 'A':
                    switch (letras[i]) {
                        case 'b':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case 'c':
                            estado = 'E';
                            array[1][2] += " " + letras[i];
                            break;
                        case 'd':
                            estado = 'E';
                            array[1][3] += " " + letras[i];
                            break;
                        case 'h':
                            estado = 'E';
                            array[1][4] += " " + letras[i];
                            break;
                        case 'a':
                            estado = 'E';
                            array[1][5] += " " + letras[i];
                            break;
                        case 'e':
                            estado = 'E';
                            array[1][5] += " " + letras[i];
                            break;
                        default:
                            estado = 'E';
                            denegada += ", " + letras[i];
                            break;
                    }
                    break;
                case 'B':
                    switch (letras[i]) {
                        case 'b':
                            estado = 'E';
                            array[2][1] += " " + letras[i];
                            break;
                        case 'c':
                            estado = 'B';
                            array[2][2] += " " + letras[i];
                            break;
                        case 'd':
                            estado = 'C';
                            array[2][3] += " " + letras[i];
                            break;
                        case 'h':
                            estado = 'C';
                            array[2][4] += " " + letras[i];
                            break;
                        case 'a':
                            estado = 'C';
                            array[2][5] += " " + letras[i];
                            break;
                        case 'e':
                            estado = 'C';
                            array[1][5] += " " + letras[i];
                            break;
                        default:
                            estado = 'E';
                            denegada += ", " + letras[i];
                            break;
                    }
                    break;
                case 'C':
                    switch (letras[i]) {
                        case 'b':
                            estado = 'E';
                            array[3][1] += " " + letras[i];
                            break;
                        case 'c':
                            estado = 'E';
                            array[3][2] += " " + letras[i];
                            break;
                        case 'd':
                            estado = 'E';
                            array[3][3] += " " + letras[i];
                            break;
                        case 'h':
                            estado = 'E';
                            array[3][4] += " " + letras[i];
                            break;
                        case 'a':
                            estado = 'E';
                            array[3][5] += " " + letras[i];
                            break;
                        case 'e':
                            estado = 'E';
                            array[1][5] += " " + letras[i];
                            break;
                        default:
                            estado = 'E';
                            denegada += ", " + letras[i];
                            break;
                    }
                    break;
                case 'D':
                    switch (letras[i]) {
                        case '6':
                            estado = 'E';
                            array[4][1] += " " + letras[i];
                            break;
                        case '7':
                            estado = 'E';
                            array[4][2] += " " + letras[i];
                            break;
                        case 'b':
                            estado = 'E';
                            array[4][3] += " " + letras[i];
                            break;
                        case 'c':
                            estado = 'E';
                            array[4][4] += " " + letras[i];
                            break;
                        case 'a':
                            estado = 'E';
                            array[4][5] += " " + letras[i];
                            break;
                        default:
                            estado = 'E';
                            denegada += ", " + letras[i];
                            break;
                    }
                    break;
                case 'F':
                    switch (letras[i]) {
                        case 'b':
                            estado = 'E';
                            array[6][1] += " " + letras[i];
                            break;
                        case 'c':
                            estado = 'E';
                            array[6][2] += " " + letras[i];
                            break;
                        case 'd':
                            estado = 'E';
                            array[6][3] += " " + letras[i];
                            break;
                        case 'h':
                            estado = 'E';
                            array[6][4] += " " + letras[i];
                            break;
                        case 'a':
                            estado = 'E';
                            array[6][5] += " " + letras[i];
                            break;
                        case 'e':
                            estado = 'E';
                            array[1][5] += " " + letras[i];
                            break;
                        default:
                            estado = 'E';
                            denegada += ", " + letras[i];
                            break;
                    }
                    break;
                case 'E':
                    estado = 'E';
                    denegada += " " + letras[i];
                    break;
            }
        }

        if (estado == 'C') {
//        	System.out.println("Cadena aceptada");
        } else {
//        	System.out.println("Cadena no aceptada");
        }

		return array;
    }
}
