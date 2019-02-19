package attraction;

public abstract class Attraction {

    private String name;
    private int price;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
