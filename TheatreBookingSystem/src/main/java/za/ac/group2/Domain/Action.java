package za.ac.group2.Domain;

import za.ac.group2.Domain.Intefaces.Movie;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Asavela on 10/31/2017.
 */
@Entity
public class Action implements Movie
{
    @Id
    @GeneratedValue
    private String id;
    private String movieDate;
    private String movieTime;
    private String title;
    private String imagePath;

    public String getImagePath() { return imagePath; }
    public String getId()
    {
        return id;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getTitle() {
        return title;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public Action() { }

    public Action(Builder builder){
        this.id = builder.id;
        this.movieDate = builder.movieDate;
        this.movieTime = builder.movieTime;
        this.title = builder.title;
        this.imagePath = builder.imagePath;
    }

    public static class Builder{

        private String id;
        private String title;
        private int movieTime;
        private int movieDate;
        private String imagePath;

        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Builder id(String movie_id) {
            this.id = movie_id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder movieDate(String movieDate) {
            this.movieDate = movieDate;
            return this;
        }
        public Builder movieTime(String movieDate) {
            this.movieTime = movieDate;
            return this;
        }

        public Action build(){
            return  new Action(this);
        }
    }
}
