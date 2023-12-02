import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> shoppingCartList;

    public ShoppingCart(){
        this.shoppingCartList=new ArrayList<Product>();
    }

    public void addProduct(Product _product){
        this.shoppingCartList.add(_product);
    }

    public void removeProduct(Product _product){
        this.shoppingCartList.remove(_product);
    }

    public String calculateTotalCost(){
        double totalCost  =0;

        for (Product _product: shoppingCartList){
            totalCost+=_product.getPrice();
        }
        return "Total Cost is "+totalCost;
    }
}
