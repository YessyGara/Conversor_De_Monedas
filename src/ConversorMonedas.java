import java.io.IOException;
import java.util.Scanner;

public class ConversorMonedas {

    public static void convertir(String base_code, String target_code, Scanner lectura, ConsultaDeMonedas consulta) throws IOException {

        double cantidad;
        double conversion_rate = 0;


        Monedas monedas = consulta.busqueda(base_code, target_code, conversion_rate);
        System.out.println("Ingrese la cantidad de " + base_code);
        cantidad = Double.parseDouble(lectura.nextLine());
        double cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("**************************************************************\n");
        System.out.println("La cantidad de " + cantidad + " " + base_code + " " + "Corresponde a: " + cantidadConvertida + " " + monedas.target_code());
        System.out.println("\n*************************************************************\n");


    }
}
