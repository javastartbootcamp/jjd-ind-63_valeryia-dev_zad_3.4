package pl.javastart.task;

public class SpecialOffer {
    String description;
    String startDate;
    String endDate;
    double discount;
    Product product;

    SpecialOffer(String description, String startDate, String endDate, double discount) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
    }
}
