import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalMenu {

    public static void main(String[] args) throws IOException {

        Scanner lectura = new Scanner(System.in);
        ConsultaDeMonedas consulta = new ConsultaDeMonedas();

        int opciones = 0;
        while (opciones != 11){
            System.out.println("Bienvenidos al conversor de monedas\n" +

                    "\n**************** Elija la opcion deseada ************\n" +
                    "1.-Dolar =>>> Peso Agentino\n" +
                    "2.-Peso Argentino =>>> Dolar\n" +
                    "3.-Dolar =>>> Real Brasileño\n" +
                    "4.-Real Brasileño =>>> Dolar\n" +
                    "5.-Dolar =>>> Peso Colombiano\n" +
                    "6.-Peso colombiano =>>> Dolar\n" +
                    "7.-Dolar =>>> Peso Chileno\n" +
                    "8.-Peso Chileno =>>> Dolar\n" +
                    "9.-Dolar =>>> Peso Boliviano\n" +
                    "10.-Peso Boliviano =>>> Dolar\n" +
                    "11.-Salir\n" +
                    "********************************************************");

            opciones = lectura.nextInt();
            lectura.nextLine();

            switch (opciones) {
                case 1:
                    ConversorMonedas.convertir("USD", "ARS", lectura, consulta);
                    break;

                case 2:
                    ConversorMonedas.convertir("ARS", "USD", lectura, consulta);
                    break;

                case 3:
                    ConversorMonedas.convertir("USD", "BRL", lectura, consulta);
                    break;

                case 4:
                    ConversorMonedas.convertir("BRL", "USD", lectura, consulta);
                    break;

                case 5:
                    ConversorMonedas.convertir("USD", "COP", lectura, consulta);
                    break;

                case 6:
                    ConversorMonedas.convertir("COP", "USD", lectura, consulta);
                    break;

                case 7:
                    ConversorMonedas.convertir("USD", "CLP", lectura, consulta);
                    break;

                case 8:
                    ConversorMonedas.convertir("CLP", "USD", lectura, consulta);
                    break;

                case 9:
                    ConversorMonedas.convertir("USD", "BOB", lectura, consulta);
                    break;

                case 10:
                    ConversorMonedas.convertir("BOB", "USD", lectura, consulta);
                    break;

                case 11:
                    System.out.println("Gracias por utilizar nuestra plataforma");
                    break;

                default:
                    System.out.println("No se pudo convertir, opcion no valida");
                    break;
            }
        }

    }
}
