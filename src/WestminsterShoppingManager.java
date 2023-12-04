import java.util.ArrayList;


public class WestminsterShoppingManager implements ShoppingManager{

    private static ArrayList<Product>  product_arrayList;
    private static final int maximumProduct=50;

    public WestminsterShoppingManager(){
        product_arrayList=new ArrayList<Product>();
    }



    @Override
    public void addProduct(Product _product) {
        if (product_arrayList.size()<maximumProduct){
            product_arrayList.add(_product);
            System.out.println("The item has been successfully added to the store.\n");
        }
        else {
            System.out.println("--The maximum product limit has been reached. Unable to add additional products--.\n    Try Again Later!\n");
        }

    }

    @Override
    public void deleteProduct(String _productId) {
        Product foundProduct = null;
        for (Product product : product_arrayList) {
            if (product.getProductId().equals(_productId)) {
                foundProduct = product;
                break; // Exit the loop once the product is found
            }
        }

        if (foundProduct != null) {
            product_arrayList.remove(foundProduct);
            System.out.println("Product was successfully deleted!\n     Removed Product Details:");
            displayProductInfo(foundProduct);
            System.out.println("Total number of products left: " + product_arrayList.size());
        } else {
            System.out.println("Product with ID " + _productId + " not found.");
        }
//        for (Product product : product_arrayList) {
//            if (product.getProductId().equals(_product)){
//                product_arrayList.remove(product);
//            }
//        }
//        System.out.println("Successfully deleted "+_product+" product");
    }


    public void printProduct() {
        if (product_arrayList.isEmpty()){
            System.out.println("\nThe store is completely empty.");
        }
        else{
            System.out.println("          List of Products:\n");
            for (Product product : product_arrayList) {
                displayProductInfo(product);
            }

        }


    }

    private void displayProductInfo(Product product) {   //This method is used for printProduct() and deleteProduct() both
        if (product.getProductType().equals("Electronic")){
            System.out.println("Product Type: "+product.getProductType());
            System.out.println("Product Id  : "+product.getProductId());
            System.out.println("Product Name: "+product.getProductName());
            System.out.println("Brand       : " + ((Electronics) product).getBrand());
            System.out.println("Warranty Period(Years): " + ((Electronics) product).getWarrentyPeriod());

        }

        else if (product.getProductType().equals("Clothing")) {
            System.out.println("Product Type: "+product.getProductType());
            System.out.println("Product Id  : "+product.getProductId());
            System.out.println("Product Name: "+product.getProductName());
            System.out.println("Size: " + ((Clothing) product).getSize());
            System.out.println("Color: " + ((Clothing) product).getColor());
        }


        System.out.println("Available Items       : " + product.getNumberOfAvailableItem());
        System.out.println("Price       : " + product.getPrice());
        System.out.println("    ******************\n");

//        if(product.getProductType().equals("Electronic")){
//            System.out.println("I got this.");
//        }

        /*if (product instanceof Electronics) {
            System.out.println("Electronics - " + product.getProductName() + " (ID: " + product.getProductId() + ")");
            System.out.println("Brand: " + ((Electronics) product).getBrand());
            System.out.println("Warranty Period: " + ((Electronics) product).getWarrentyPeriod());
        } else if (product instanceof Clothing) {
            System.out.println("Clothing - " + product.getProductName() + " (ID: " + product.getProductId() + ")");
            System.out.println("Size: " + ((Clothing) product).getSize());
            System.out.println("Color: " + ((Clothing) product).getColor());
        }
        */
    }



    @Override
    public void saveProduct() {

    }




}
