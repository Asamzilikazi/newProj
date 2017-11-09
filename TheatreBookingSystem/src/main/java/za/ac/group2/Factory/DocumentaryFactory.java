package za.ac.group2.Factory;

import TheatreTicketBookingSystem.domain.Documentary;

import java.util.Map;

/**
 * Created by Hasan on 10/31/2017.
 */
public class DocumentaryFactory {
    public static Documentary getDocumentary(Map<String, Object> values){
        Documentary factoryDocumentary = new Documentary.Builder()
                .imagePath((String)values.get("imagePath"))
                .movie_id((Long)values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .build();
        return factoryDocumentary;
    }
}
