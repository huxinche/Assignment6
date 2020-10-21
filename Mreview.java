import java.util.ArrayList;
import java.util.Objects;

public class Mreview implements Comparable<Mreview> {
    // instance variables
    private String title;   // title of the movie
    private ArrayList<Integer> ratings; // list of ratings stored in a Store object

    public Mreview() {
        ratings = new ArrayList<>();
    }

    public Mreview(String ttl) {
        this.title = ttl;
        ratings = new ArrayList<>();
    }

    public Mreview(String ttl, int firstRating) {
        this.title = ttl;
        ratings = new ArrayList<>();
        ratings.add(firstRating);
    }


    // methods

    public void addRating(int r) {
        this.ratings.add(r);
    }

    public double aveRating() {
        double totalRating = 0;
        for (Integer rating : this.ratings) {
            totalRating += rating;
        }

        return totalRating / ratings.size();
    }


    @Override
    public int compareTo(Mreview obj) {

        return this.title.compareTo(obj.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mreview mreview = (Mreview) o;
        return Objects.equals(title, mreview.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    public String getTitle() {
        return title;
    }

    public int numRatings() {
        return ratings.size();
    }

    @Override
    public String toString() {
        return String.format("%s, average %s out of %s ratings", this.title, this.aveRating(), this.numRatings());
    }


    public static void main(String[] args) {
        Mreview mreview = new Mreview("Bubble", 4);
        mreview.addRating(5);
        mreview.addRating(6);
        System.out.println(mreview.toString());
        System.out.println("This average rating of the Mreview " + mreview.aveRating());
    }
}
