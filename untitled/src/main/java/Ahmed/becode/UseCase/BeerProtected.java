package Ahmed.becode.UseCase;

public class BeerProtected extends Beverage {
    protected String name;
    protected double alcoholPercentage;

    public BeerProtected(String name, double alcoholPercentage) {

        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
    }

    private String beerInfo() {
        return "Hi, I'm " + name + " and have an alcohol percentage of " + alcoholPercentage + " and I have a light color.";
    }

    public static void main(String[] args) {
        BeerProtected duvel = new BeerProtected("Duvel", 8.5);
        duvel.setColor("light");
        duvel.setPrice(3.5);


        System.out.println(duvel.getInfo());


        System.out.println("Alcohol Percentage: " + duvel.alcoholPercentage);
        System.out.println("Color: " + duvel.getColor());


        System.out.println(duvel.beerInfo());
    }
}
