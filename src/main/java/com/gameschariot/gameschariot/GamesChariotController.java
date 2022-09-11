package com.gameschariot.gameschariot;

import java.io.IOException;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GamesChariotController {
    @GetMapping("/")
    public JsonObject hello()  {
        String defaultMessage = "{ \"message\": \"Welcome\" }";
        JsonObject json = new Gson().fromJson(defaultMessage, JsonObject.class);
        return json;
    }

    @GetMapping("/games")
    public GamesChariot gamesList() throws IOException {
        // scraper
        Document doc = Jsoup.connect("https://help.netflix.com/en/node/121442").get();
        Elements listOfGames = doc.select(".tab-content:eq(1) .c-table a");
        ArrayList<String> gameTitles = new ArrayList<>();
        ArrayList<String> gameLinks = new ArrayList<>();

        for(Element game : listOfGames) {
            if(!game.text().equals("")) {
                gameTitles.add(game.text());
                gameLinks.add(game.attr("abs:href"));
            }
        }

        JsonObject jsonObject = new JsonObject();
        for(int i = 0; i < gameTitles.size(); i++) {
            jsonObject.addProperty(gameTitles.get(i), gameLinks.get(i));
        }

        return new GamesChariot(jsonObject);
    }
}
