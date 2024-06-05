package com.magic;

/*
 * Application class to model the workings of a wand.
 * NO main() method here.
 */

/**
 * JR: Very good result overall, demonstrates solid understanding of program concepts.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been excellent, keep it up.
 *
 * Class names, package names, and overall structure are correct.
 */
public class Wand {
    // CLASS ("STATIC") VARIABLES/METHODS
    public static final int MIN_FLEXIBILITY = 1;
    public static final int MAX_FLEXIBILITY = 13;


    // FIELDS OR INSTANCE VARIABLES
    private String owner;
    private Core core;                // enum
    private String wood;
    private Integer flexibility;      // constraint: [1 - 13]
    private Double length;            // inches
    private boolean isBroken;

    // CONSTRUCTORS

    // ctor 1
    public Wand() {

    }

    // ctor 2
    public Wand(Core core) {
        this();
        setCore(core);
    }

    // ctor 3
    public Wand(Core core, String wood, Double length) {
        this(core);
        setWood(wood);
        setLength(length);
    }

    // JR: generally should be consistent in the order of your parameters across ctors
    // ctor 4: core, wood, length, flexibility, owner
    // ctor 5: core, wood, length, flexibility, owner, isBroken

    // ctor 4
    public Wand(String owner, Core core, String wood, Integer flexibility, Double length) {
        this(core, wood, length);
        setOwner(owner);
        setFlexibility(flexibility);
    }

    // ctor 5
    public Wand(String owner, Core core, String wood, Integer flexibility, Double length,
                boolean isBroken) {
        this(owner, core, wood, flexibility, length);
        setIsBroken(isBroken);
    }

    // BUSINESS METHODS
    public void swish() {
        if (!IsBroken()) {
            System.out.printf("\nSwishing a %s core wand", getCore());
        }
        else {
            System.out.println("\nUh oh! Something is wrong with this wand...");
        }

    }

    // JR: call the getter instead of direct field access, i.e., if (isBroken())
    public void mend() {
        if (isBroken) {
            System.out.printf("\nMending a %s inch wand using Spellotape", getLength());
            setIsBroken(false);  // JR: cool, it's fixed now
        }
        else {
            System.out.println("\nNo need to mend! This wand is not broken.");
        }
    }

    public void flick() {
        if (!IsBroken()) {
            System.out.printf("\nFlicking %s's wand", getOwner());
        }
        else {
            System.out.println("\nUh oh! Something is wrong with this wand...");
        }

    }

    public void polish() {
        System.out.printf("\nPolishing a %s wand", getWood());
    }



    // ACCESSOR METHODS
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Core getCore() {
        return core;
    }

    public void setCore(Core core) {
        this.core = core;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String getWood) {
        this.wood = getWood;
    }

    public Integer getFlexibility() {
        return flexibility;
    }

    public void setFlexibility(Integer flexibility) {
        if (flexibility >= MIN_FLEXIBILITY && flexibility <= MAX_FLEXIBILITY) {
            this.flexibility = flexibility;
        }
        else {
            System.out.printf("\nInvalid flexibility value: %s\nMust be between %s and %s (inclusive).",
                                flexibility, MIN_FLEXIBILITY, MAX_FLEXIBILITY);
        }
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    // JR: naming -> method names in Java never begin with a capital letter
    public boolean IsBroken() {
        return isBroken;
    }

    // JR: boolean accessor methods like this are better named as follows:
    //  isBroken()
    //  setBroken()
    // If the IJ-generated ones don't conform, then refactor -> rename them
    public void setIsBroken(boolean broken) {
        isBroken = broken;
    }

    // JR: generally keep this string to one long line, with no line breaks
    // Think entry in log file, each entry (line) in the log file is for one thing
    public String toString() {
        return String.format("\nWand Details" +
                             "\n------------" +
                        "\nowner: %s\ncore: %s\nwood: %s\nflexibility: %s\nlength: %s inches\nisBroken: %s",
                        getOwner(), getCore(), getWood(), getFlexibility(), getLength(), IsBroken());
    }

    // JR: delete extraneous blank lines like this
}