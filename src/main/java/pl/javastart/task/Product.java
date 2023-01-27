package pl.javastart.task;

public class Product {
    String name;
    String description;
    double price;
    Category category;

    Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    void printInfo() {
        if (category == null) {
            System.out.printf("Product: %s, opis: %s, cena: %.2fzł, brak kategorii.\n", name, description, price);
        } else {
            System.out.printf("Product: %s, opis: %s, cena: %.2fzł, kategoria: %s.\n", name, description, price, category.name);
        }
    }
}
