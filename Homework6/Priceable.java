package Homework6;

public interface Priceable{
    void getPrice();
}
class Book implements Priceable{
    int price;
    public Book (int price){
        this.price=price;
    }

    @Override
    public void getPrice() {
        System.out.println("Book's price: " + this.price);
    }
}