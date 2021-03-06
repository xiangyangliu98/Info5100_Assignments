package Question4;

import java.util.*;

public class Movie {
    private String title;
    private Date releaseDate;
    private String director;
    private List<String> actors;

    public Movie(String title, Date releaseDate, String director){
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        actors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public void addActors(String actor){
        actors.add(actor);
    }
}

