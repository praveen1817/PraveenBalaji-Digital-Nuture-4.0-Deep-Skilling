import java.util.Comparator;
import java.util.Arrays;
public class Product {
    String productName;
    int productId;
    String category;

    public Product(String productName, int productId, String category) {
        this.productName = productName;
        this.productId = productId;
        this.category = category;

    }
    @Override
    public String toString() {
        return productId + " - " + productName + " [" + category + "]";
    }


    public static Product linearSearch(Product[] products, String searchProduct) {
        for (Product p : products) {
            if (p.productName == searchProduct) {
                return p;
            }
        }
        return null;
    }



    public static Product binearySearch(Product[] products, String searchProduct) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName));
        int left = 0;
        int right = products.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            int value = products[mid].productName.compareToIgnoreCase(searchProduct);
            if (value == 0) return products[mid];
            else if (value < 0) left = mid + 1;
            else right = mid - 1;

        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("Mouse",101 , "Accessories"),
                new Product("Laptop", 102, "Electronics"),
                new Product("Keyboard",103 , "Accessories"),
                new Product("Monitor",104 , "Electronics")
        };
        Product linearSearch= linearSearch(products,"Mouse");
        System.out.println("Linear Search Result:   "+linearSearch);
        Product bineartsearch=binearySearch(products,"keyboard");
        System.out.println("Linear Search Result:   "+bineartsearch);





    }
}

