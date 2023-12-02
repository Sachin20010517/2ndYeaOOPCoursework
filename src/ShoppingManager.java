import java.util.ArrayList;

public interface ShoppingManager {
    void addProduct(Product _product);
    void deleteProduct(Product _product);
    void printProduct(ArrayList<Product> _product);
    void saveProduct();
}
