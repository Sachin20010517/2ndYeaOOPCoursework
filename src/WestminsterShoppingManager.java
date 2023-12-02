import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterShoppingManager implements ShoppingManager{

    private ArrayList<Product>  product_arrayList;
    private static final int maximumProduct=50;

    public WestminsterShoppingManager(){
        product_arrayList=new ArrayList<Product>();
    }



    @Override
    public void addProduct(Product _product) {
        if (product_arrayList.size()<maximumProduct){
            product_arrayList.add(_product);
            System.out.println("Successfully added to the store.");
        }
        else {
            System.out.println("--The maximum product limit has been reached. Unable to add additional products--.\n    Try Again Later!");
        }

    }

    @Override
    public void deleteProduct(Product _product) {
        product_arrayList.remove(_product);
    }


    public void printProduct(ArrayList<Product> _product) {
        System.out.println("          List of Products:");
//        for (Product product : product_arrayList) {
//            System.out.println(product);
//        }
        System.out.println(_product);

    }

//    private void displayProductInfo(Product product) {
//        if (product instanceof Electronics) {
//            System.out.println("Electronics - " + product.getProductName() + " (ID: " + product.getProductId() + ")");
//            System.out.println("Brand: " + ((Electronics) product).getBrand());
//            System.out.println("Warranty Period: " + ((Electronics) product).getWarrantyPeriod());
//        } else if (product instanceof Clothing) {
//            System.out.println("Clothing - " + product.getProductName() + " (ID: " + product.getProductId() + ")");
//            System.out.println("Size: " + ((Clothing) product).getSize());
//            System.out.println("Color: " + ((Clothing) product).getColor());
//        }
//
//        System.out.println("Available Items: " + product.getAvailableItems());
//        System.out.println("Price: " + product.getPrice());
//        System.out.println("---------------------");
//    }

    @Override
    public void saveProduct() {

    }




}
