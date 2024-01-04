package Ahmed.becode.UseCase2;

import java.util.List;
import java.util.ArrayList;

public class BasketWithDiscount {
    public static void main(String[] args) {
        // Items in the basket
        List<BasketItem> basket = new ArrayList<>();
        basket.add(new BasketItem("Banana", 6, 1));
        basket.add(new BasketItem("Apple", 3, 1.5));
        basket.add(new BasketItem("Bottle of wine", 2, 10));

        // Apply 50% discount to every fruit
        double discountRate = 0.5;
        basket.stream()
                .filter(item -> !item.getName().toLowerCase().contains("wine"))
                .forEach(item -> item.applyDiscount(discountRate));

        // Calculate total price
        double totalPriceWithDiscount = basket.stream()
                .mapToDouble(BasketItem::getTotal)
                .sum();

        // Calculate total tax
        double totalTaxWithDiscount = basket.stream()
                .mapToDouble(BasketItem::getTax)
                .sum();

        // Output results
        System.out.println("Total Price (with discount): " + String.format("%.2f", totalPriceWithDiscount));
        System.out.println("Total Tax (with discount): " + String.format("%.2f", totalTaxWithDiscount));
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

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }

        public double getTotal() {
            return quantity * price;
        }

        public double getTax() {
            double taxRate = name.toLowerCase().contains("wine") ? 0.21 : 0.06;
            return getTotal() * taxRate;
        }

        public void applyDiscount(double discountRate) {
            if (!name.toLowerCase().contains("wine")) {
                price *= (1 - discountRate);
            }
        }
    }
}
