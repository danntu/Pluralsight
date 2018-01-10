package collection.sets;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Product {
    public static final Comparator<Product> BY_NAME = comparing(Product::getName);

    private final String name;
    private final  int weight;

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{name='"+name+"', weight='"+weight+"'}";
    }

    public boolean equals(final Object o){
        if (!(o instanceof Product)) return false;
        final Product product = (Product) o;
        return Objects.equals(weight,product.getWeight()) && Objects.equals(name,product.getName());
    }

    public int hashCode(){
        return Objects.hash(name,weight);
    }
}
