package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Product prod1 = new Product("ciasto", "czekaładowe", 5.4);
        prod1.category = new Category("słodycze", "coś słodkiego dla każdego");

        Product prod2 = new Product("czekołada", "gorzka", 4.5);
        prod2.category = prod1.category;

        Product prod3 = new Product("kiełbasa", "biała", 7.7);
        prod3.category = new Category("mięso", "coś mięsnego dla każdego");

        Product prod4 = new Product("banan", "zielony", 3.5);

        SpecialOffer off1 = new SpecialOffer("Promocja 20% na banany", "13.01.2022", "18.01.2022", 0.2);
        off1.product = prod4;
        prod4.price *= (1 - off1.discount); // czy warto deklarować w taki sposób?

        prod1.printInfo();
        prod2.printInfo();
        prod3.printInfo();
        prod4.printInfo();
    }
}
