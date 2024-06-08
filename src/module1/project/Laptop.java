package module1.project;

public class Laptop implements Device{
    private String model;
    private int price;

    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void discount(int percent) {
        int newPrice=(100-percent)*price/100;
        this.price=newPrice;
        System.out.println("New price for mobile :"+newPrice);
    }
}
