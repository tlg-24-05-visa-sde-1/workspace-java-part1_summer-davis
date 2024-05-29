package net.flix;

public class Movie {
  // instance variables or fields
  private String title;
  private Integer releaseYear;
  private Double revenue;
  private Rating rating;
  private Genre genre;

  // constructors - these get called when clients say "new"
  public Movie(String title) {
    setTitle(title);
  }

  public Movie(String title, Genre genre) {
    this(title); // delegate to ctor above for title
    setGenre(genre);
  }

  public Movie(String title, Integer releaseYear, Double revenue) {
    // delegate to the setters for any data validation/conversion they might be doing
    this(title); // delegate to ctor above which handles title
    setReleaseYear(releaseYear); // delegate to setters for any validation/conversion
    setRevenue(revenue);
  }

  public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
    this(title, releaseYear, revenue); // delegate to 3-arg ctor above for these 3
    setRating(rating);
    setGenre(genre);
  }

  // "action" methods - play(), pause(), stop(), rewind(), fastForward()

  // "accessor" methods, aka get/set methods, aka getters-and-setters
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
  }

  public Double getRevenue() {
    return revenue;
  }

  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public String toString() {
    if (revenue == null) {
      return String.format(
          "\nMovie Details"
              + "\n--------------"
              + "\ntitle: %s\nreleaseYear: %s\nrevenue: %s\nrating: %s\ngenre: %s",
          getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    } else {
      return String.format(
          "\nMovie Details"
              + "\n--------------"
              + "\ntitle: %s\nreleaseYear: %s\nrevenue: %,.2f\nrating: %s\ngenre: %s",
          getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    }

    //        return "\nMovie Details" +
    //                "\n------------" +
    //                "\ntitle: " + getTitle() +
    //                "\nreleaseYear: " + getReleaseYear() +
    //                "\nrevenue: " + getRevenue() +
    //                "\nrating: " + getRating() +
    //                "\ngenre: " + getGenre();
  }
}
