package za.ac.group2.Factory;

import TheatreTicketBookingSystem.domain.SciFi;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class SciFiFactory {
    public static SciFi getSciFi(Map<String, Object> values){
        SciFi factorySciFi = new SciFi.Builder()
                .imagePath((String)values.get("imagePath"))
                .movie_id((Long)values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .build();
        return factorySciFi;
    }
}
