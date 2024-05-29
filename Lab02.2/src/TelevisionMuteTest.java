class TelevisionMuteTest {

  public static void main(String[] args) {
    Television tv = new Television("Samsung", 32);
    System.out.println(tv);

    // Mute
    System.out.println("\nSHOULD MUTE");
    tv.mute();
    System.out.println(tv);

    // Unmute
    System.out.println("\nSHOULD UNMUTE");
    tv.mute();
    System.out.println(tv);

    // Mute again
    System.out.println("\nSHOULD MUTE");
    tv.mute();
    System.out.println(tv);

    // Set volume to 50 and unmute
    System.out.println("\nSHOULD UNMUTE WITH VOLUME 50");
    tv.setVolume(50);
    System.out.println(tv);
  }
}
