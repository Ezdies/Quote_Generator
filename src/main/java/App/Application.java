package App;

import com.google.gson.Gson;
import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) {

        get("/thymeleaf", (request, response) -> {
            URL url = new URL("https://api.quotable.io/random");
            InputStreamReader reader = new InputStreamReader(url.openStream());
            Deserializer quote = new Gson().fromJson(reader, Deserializer.class);
            Deserializer.printObjectInfo(quote);
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("quote", quote);
            return new ThymeleafTemplateEngine().render(new ModelAndView(attributes, "thymeleaf"));
        });
    }
}
