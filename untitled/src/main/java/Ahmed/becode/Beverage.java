package Ahmed.becode;

public class Beverage {
    private String color;
    private double price;
    private String temperature;

    public Beverage() {
        this.temperature = "cold";
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getInfo() {
        return "This beverage is " + temperature + " and " + color + ".";
    }

    public static void main(String[] args) {
        Beverage cola = new Beverage();

        cola.setColor("Black");
        cola.setPrice(2.0);



        System.out.println(cola.getInfo());
    }
}
