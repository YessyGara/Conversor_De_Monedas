import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaDeMonedas {
    public Monedas busqueda(String base_code, String target_code, double conversion_rate) throws IOException {




            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/cf9b68aea2c548afee7245bb/pair/" + base_code + "/" + target_code);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Monedas.class);
            } catch (Exception e) {
                throw new RuntimeException("No se pudo hacer la conversion");
            }
    }



}
