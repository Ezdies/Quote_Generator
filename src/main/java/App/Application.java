package App;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args){

        get("/quote", (request, response) -> {
            URL url = new URL("https://api.quotable.io/random");
            InputStreamReader reader = new InputStreamReader(url.openStream());
            Deserializer object = new Gson().fromJson(reader, Deserializer.class);
            Deserializer.printObjectInfo(object);
            return Deserializer.stringify(object);
        });
    }
}
