package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment  implements Iterable<Product>{
    private static final int LIGHT_VAN_MAX_WEIGHT =20;
    private static final int PRODUCT_NOT_PRESENT = -1;
    private final List<Product> products = new ArrayList<>();

    private List<Product> lightVanProducts;
    private List<Product>  heavyVanProducts;

    public void add(Product product){
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct){
        final  int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENT){
            products.set(index,newProduct);
        }
    }

    public void prepare(){
        products.sort(Product.BY_WEIGHT);

        int splitPoint = findSplitPoint();

        lightVanProducts = products.subList(0,splitPoint);
        heavyVanProducts = products.subList(splitPoint,products.size());
    }

    public int findSplitPoint(){
        for (int i = 0; i <products.size() ; i++) {
            final Product product = products.get(i);
            if (product.getWeight()>LIGHT_VAN_MAX_WEIGHT){
                return i;
            }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public static void main(String[] args) {
        Shipment shipment =  new Shipment();
        Product door = new Product("Wooden Door",35);
        Product floorPanel = new Product("Floor Panel",25);
        Product window = new Product("Glass Window",15);

        shipment.add(door);
        shipment.add(floorPanel);
        shipment.add(window);

        shipment.prepare();
        System.out.println("Heavy Van");
        for (Product s:
                shipment.getHeavyVanProducts()) {
            System.out.println(s);
        }
        System.out.println("Light Van");
        for (Product s:
                shipment.getLightVanProducts()) {
            System.out.println(s);
        }


    }
}
