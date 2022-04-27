package bean;

public class Item implements java.io.Serializable{

    private Product product;
    private int count;
    private int price;

    public Product getProduct(){
        return product;
    }
    public int getCount(){
        return count;
    }
    public int getPrice(){
        return price;
    }
    public void setProduct(Product product){
        this.product = product;
    }
    public void setCount(int count){
        this.count = count;
    }
    public void setPrice(int price){
        this.price = price;
    }
}