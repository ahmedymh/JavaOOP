package Ahmed.becode.UseCase;

public class BeerPrivate extends Beverage {
    private String name;
    private double alcoholPercentage;

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String beerInfo() {
        return "Hi, I'm " + name + " and have an alcohol percentage of " + alcoholPercentage + " and I have a light color.";
    }

    public BeerPrivate(String name, double alcoholPercentage) {
        super();
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
    }

    public static void main(String[] args) {
        BeerPrivate duvel = new BeerPrivate("Duvel", 8.5);
        duvel.setColor("light");
        duvel.setPrice(3.5);
        System.out.println(duvel.getInfo());
        System.out.println(duvel.getAlcoholPercentage());
        System.out.println(duvel.getColor());
        System.out.println(duvel.beerInfo());
    }
}
