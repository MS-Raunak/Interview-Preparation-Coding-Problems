package pkg4_comparable_comparator_sorting.comparator;

//Sort set of object based on multiple attribute
public class Mobile {

    String brand;
    double price;
    int ram;

    public Mobile(String brand, double price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}
