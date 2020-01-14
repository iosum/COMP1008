package week2;

import java.util.Arrays;
import java.util.List;

public class VideoGame {
    private String title;
    private String genra;
    private String rating;
    private String systemSupported;
    private double cost;

    public VideoGame(String title, String genra, String rating, String systemSupported, double cost) {
        setTitle(title);
        setGenra(genra);
        setRating(rating);
        setSystemSupported(systemSupported);
        setCost(cost);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("please enter a title");
        }
    }

    public String getGenra() {
        return genra;
    }

    public void setGenra(String genra) {
        this.genra = genra;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        List<String> ratings = Arrays.asList("M", "E", "T");
        if (ratings.contains(rating)) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("rating must be M, E or T");
        }
    }

    public String getSystemSupported() {
        return systemSupported;
    }

    public void setSystemSupported(String systemSupported) {
        List<String> systems = Arrays.asList("PS4", "XBox", "Nintendo Switch", "PC", "ALL");
        if (systems.contains(systemSupported)) {
            this.systemSupported = systemSupported;
        } else {
            throw new IllegalArgumentException("System must be \"PS4\",\"XBox\",\"Nintendo Switch\",\"PC\"");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0.0) {
            this.cost = cost;
        } else {
            throw new IllegalArgumentException("cost must be greater than 0");
        }

    }

    public String toString() {
        return String.format("%s, rated %s has a cost of $%.2f", getTitle(),getRating(), getCost());
    }
}
