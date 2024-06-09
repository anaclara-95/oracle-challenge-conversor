import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();


        int opcion = 0;
        while (opcion!=12){
            System.out.println("**************************************************************");
            System.out.println("Bienvenido al conversor de moneda.");
            System.out.println("Elige una opción de conversión");
            System.out.println
                    ("1) Dólar (USD) a Peso Argentino (ARS)\n" +
                     "2) Peso argentino (ARS) a Dólar (USD)\n" +
                     "3) Dólar (USD) a Boliviano Boliviano (BOB)\n" +
                     "4) Boliviano boliviano (BOB) a Dólar (USD)\n" +
                     "5) Dólar (USD) a Real Brasileño (BRL)\n"+
                     "6) Real brasileño (BRL) a Dólar (USD)\n" +
                     "7) Peso chileno (CLP) a Dólar (USD)\n" +
                     "8) Dólar (USD) a Peso chileno (CLP)\n" +
                     "9) Dólar (USD) a Peso colombiano (COL)\n" +
                     "10)Peso colombiano (COL) a Dólar estadounidense (USD)\n" +
                     "11)Convertir otra moneda\n" +
                     "12)Salir");

            opcion = lectura.nextInt();
            lectura.nextLine();


            switch(opcion) {
                case 1:
                    ConvierteMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvierteMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvierteMoneda.convertir("USD", "BOB", consulta, lectura);
                    break;
                case 4:
                    ConvierteMoneda.convertir("BOB", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvierteMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 6:
                    ConvierteMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvierteMoneda.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 8:
                    ConvierteMoneda.convertir("USD", "CLP", consulta, lectura);
                    break;
                case 9:
                    ConvierteMoneda.convertir("USD", "COL", consulta, lectura);
                    break;
                case 10:
                    ConvierteMoneda.convertir("COL", "USD", consulta, lectura);
                    break;
                case 11:
                    ConvierteMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 12:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            }


            System.out.println("Gracias por utilizar el conversor de monedas.");


        }

    }
}
