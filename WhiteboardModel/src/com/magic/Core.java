package com.magic;

public enum Core {
  UNICORN_HAIR("Unicorn Hair"),
  DRAGON_HEARTSTRING("Dragon Heartstring"),
  PHOENIX_FEATHER("Phoenix Feather");

  private final String display;

  Core(String display) {
    this.display = display;
  }

  public String getDisplay() {
    return display;
  }

  @Override
  public String toString() {
    return getDisplay();
  }
}
