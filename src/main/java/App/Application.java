package App;

import com.google.gson.Gson;
import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) {

        get("/quote", (request, response) -> {
            final URL url = new URL("https://api.quotable.io/random");
            InputStreamReader reader = new InputStreamReader(url.openStream());
            QuoteDecrypter quote = new Gson().fromJson(reader, QuoteDecrypter.class);
            reader.close();
            QuoteDecrypter.printObjectInfo(quote);
            var attributes = Map.of("quote", quote);
            return new ThymeleafTemplateEngine().render(new ModelAndView(attributes, "thymeleaf"));
        });
    }
}
