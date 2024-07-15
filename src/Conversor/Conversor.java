package Conversor;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class Conversor {
    private static final String API_KEY = "0602602e8a11828d50024339";

    protected static double converteMoedas(String from, String to, double valor) {

        try {
            String url_str = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + from;
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            double taxaCambio = jsonobj.getAsJsonObject("conversion_rates").get(to).getAsDouble();

            return valor * taxaCambio;

        } catch (Exception e) {
            System.out.println("Falha ao obter taxa de câmbio: " + e.getMessage());
            return 0;
        }
    }
}