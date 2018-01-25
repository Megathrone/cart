package bean;

public class OrderItem {

    private int id;
    private Product product;
    private int num;

    public void setId(int id) {
        this.id = id;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public int getNum() {
        return num;
    }

    public Product getProduct() {
        return product;
    }
}
