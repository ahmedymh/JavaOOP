package Ahmed.becode.UseCase;

public class Beer extends Beverage {
    private String Name;
    private double AlcoholPercentage;

    public double getAlcoholPercentage() {
        return AlcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        AlcoholPercentage = alcoholPercentage;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public Beer(String name, double alcoholPercentage) {
        super();
        this.AlcoholPercentage = alcoholPercentage;
    }

    public static void main(String[] args) {
        Beer Duvel = new Beer("Duvel",(8.5));
        Duvel.setColor("blond");
        Duvel.setPrice(3.5);
        System.out.println(Duvel.getInfo());
        System.out.println(Duvel.getAlcoholPercentage());
        System.out.println(Duvel.getColor());
    }
}
