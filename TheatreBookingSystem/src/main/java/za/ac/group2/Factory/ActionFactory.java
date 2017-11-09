package za.ac.group2.Factory;

import za.ac.group2.Domain.Action;


import java.util.Map;

/**
 * Created by Asavela on 10/31/2017.
 */
public class ActionFactory {

    public static Action getAction(Map<String, Object> values){
        Action factoryAction = new Action.Builder()
                .imagePath((String)values.get("imagePath"))
                .id((String) values.get("movie_id"))
                .duration((Integer)values.get("duration"))
                .title((String)values.get("title"))
                .build();
        return factoryAction;
    }
}
