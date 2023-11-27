package validaciones;

public class ValidarExpresion4 {
    public char estado = 'A';
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
			case 'a':
			case '+':
			case 'b':
				condicion = true;
				break;
				default:
					condicion = false;
			}
		}
        

        array[0][0] = "Estado";
        array[0][1] = "a";
        array[0][2] = "+";
        array[0][3] = "b";

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
                        case 'a':
                            estado = 'B';
                            array[1][1] += " " + letras[i];
                            break;
                        case '+':
                            estado = 'E';
                            array[1][2] += " " + letras[i];
                            break;
                        case 'b':
                            estado = 'B';
                            array[1][3] += " " + letras[i];
                            break;
                        default:
                            estado = 'E';
                            denegada += ", " + letras[i];
                            break;
                    }
                    break;
                case 'B':
                    switch (letras[i]) {
                        case 'a':
                            estado = 'E';
                            array[2][1] += " " + letras[i];
                            break;
                        case '+':
                            estado = 'A';
                            array[2][2] += " " + letras[i];
                            break;
                        case 'b':
                            estado = 'E';
                            array[2][3] += " " + letras[i];
                            break;
                        default:
                            estado = 'E';
                            denegada += ", " + letras[i];
                            break;
                    }
                    break;
                case 'C':
                    switch (letras[i]) {
                        case 'a':
                            estado = 'B';
                            array[3][1] += " " + letras[i];
                            break;
                        case '+':
                            estado = 'E';
                            array[3][2] += " " + letras[i];
                            break;
                        case 'b':
                            estado = 'B';
                            array[3][3] += " " + letras[i];
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
		return array;
    }
}
