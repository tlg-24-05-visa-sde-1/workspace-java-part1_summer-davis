package net.flix;

public enum Genre {
  ROMANCE("Romance"),
  COMEDY("Comedy"),
  HORROR("Horror"),
  ACTION("Action"),
  SCI_FI("Sci-Fi"),
  DRAMA("Drama"),
  SPORTS("Sports"),
  WESTERN("Western");

  private final String display;

  Genre(String display) {
    this.display = display;
  }

  public String getDisplay() {
    return display;
  }

  public String toString() {
    return display;
  }
}
