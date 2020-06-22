package me.ywoo.domain;

public class CarName {
    public static final int MAX_NAME_LENGTH = 5;
    private static String name;

    public CarName(final String name) {
        validate(name);
        this.name = name;
    }

    private void validate(final String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 다섯글자 이내입니다.");
        }
    }

    public static String getName() {
        return name;
    }
}
