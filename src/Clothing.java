public class Clothing extends Product {
    private String color;
    private int size;

    public Clothing(){

    }

    public Clothing(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Clothing(String productId,String prouctName, int availableItems,double price,String color, int size) {
        super(productId,prouctName,availableItems,price);
        this.color = color;
        this.size = size;
    }



    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getProductType(){
        return "Product Type : Clothing";
    }
}
