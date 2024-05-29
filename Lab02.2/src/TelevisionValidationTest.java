class TelevisionValidationTest {

  public static void main(String[] args) {

    Television tv = new Television();

    // VOLUME TESTING
    System.out.println("\nVOLUME TESTING");
    // check valid volume
    System.out.println("\nSHOULD BE VALID - VOLUME 0");
    tv.setVolume(0);
    System.out.println(tv);

    // check invalid volumes
    System.out.println("\nSHOULD BE INVALID - VOLUME 0");
    // check below min (-1)
    tv.setVolume(-1);
    System.out.println(tv);

    // check above max (101)
    System.out.println("\nSHOULD BE INVALID - VOLUME 0");
    tv.setVolume(101);
    System.out.println(tv);

    // verify that constructors reject invalid values
    System.out.println("\nSHOULD BE INVALID - VOLUME 0");
    Television tv2 = new Television("Sony", -8);
    System.out.println(tv2);

    // BRAND TESTING
    System.out.println("\nBRAND TESTING");

    // check valid brands
    System.out.println("\nSHOULD BE VALID - BRAND 'SAMSUNG'");
    tv.setBrand("Samsung");
    System.out.println(tv);

    System.out.println("\nSHOULD BE VALID - BRAND 'LG'");
    tv.setBrand("LG");
    System.out.println(tv);

    System.out.println("\nSHOULD BE VALID - BRAND 'SONY'");
    tv.setBrand("Sony");
    System.out.println(tv);

    System.out.println("\nSHOULD BE VALID - BRAND 'TOSHIBA'");
    tv.setBrand("Toshiba");
    System.out.println(tv);

    // check invalid brand
    System.out.println("\nSHOULD BE INVALID - BRAND 'TOSHIBA'");
    tv.setBrand("Apple");
    System.out.println(tv);
  }
}
