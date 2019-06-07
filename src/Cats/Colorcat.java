package Cats;

public enum Colorcat {
    BLACK,
    WHITE,
    GREEN,
    ORANGE,
    BRAUN;

    public static Colorcat getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
