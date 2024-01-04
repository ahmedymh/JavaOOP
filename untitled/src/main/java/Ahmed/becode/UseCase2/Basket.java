import java.util.List;
import java.util.ArrayList;

public class Basket {
    public static void main(String[] args) {
        // Items in the basket
        List<BasketItem> basket = new ArrayList<>();
        basket.add(new BasketItem("Banana", 6, 1));
        basket.add(new BasketItem("Apple", 3, 1.5));
        basket.add(new BasketItem("Bottle of wine", 2, 10));

        // Calculate total price
        double totalPriceWithClasses = basket.stream()
                .mapToDouble(BasketItem::getTotal)
                .sum();

        // Calculate total tax
        double totalTaxWithClasses = basket.stream()
                .mapToDouble(BasketItem::getTax)
                .sum();

        // Output results
        System.out.println("Total Price (with classes): " + String.format("%.2f", totalPriceWithClasses));
        System.out.println("Total Tax (with classes): " + String.format("%.2f", totalTaxWithClasses));
    }

    static class BasketItem {
        private String name;
        private int quantity;
        private double price;

        public BasketItem(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public double getTotal() {
            return quantity * price;
        }

        public double getTax() {
            double taxRate = name.toLowerCase().contains("wine") ? 0.21 : 0.06;
            return getTotal() * taxRate;
        }
    }
}
