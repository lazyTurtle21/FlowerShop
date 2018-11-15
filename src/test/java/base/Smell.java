package base;

public enum Smell {
    ROSY("rosy"),
    FLORAL("floral"),
    FRESH("fresh");
    private String name;

    Smell(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Smell{" +
                "name='" + name + '\'' +
                '}';
    }
}
