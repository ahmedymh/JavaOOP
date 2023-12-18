package Ahmed.becode;

public class BeerProtected extends Beverage {
    protected String name;
    protected double alcoholPercentage;

    // Constructor without calling super()
    public BeerProtected(String name, double alcoholPercentage) {
        // No call to super() as it's not necessary in this case
        this.name = name;
        this.alcoholPercentage = alcoholPercentage;
    }

    private String beerInfo() {
        return "Hi, I'm " + name + " and have an alcohol percentage of " + alcoholPercentage + " and I have a light color.";
    }

    public static void main(String[] args) {
        BeerProtected duvel = new BeerProtected("Duvel", 8.5);
        duvel.setColor("light");  // Accessing protected property
        duvel.setPrice(3.5);     // Accessing protected property

        // Print information about Duvel
        System.out.println(duvel.getInfo());

        // Access protected properties directly
        System.out.println("Alcohol Percentage: " + duvel.alcoholPercentage);
        System.out.println("Color: " + duvel.getColor());

        // Call the beerInfo method
        System.out.println(duvel.beerInfo());
    }
}
