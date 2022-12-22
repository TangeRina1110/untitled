package Homework6;

public interface Printable {
    void print();
}
class Books implements Printable{
    String name;
    String author;
    public Books( String name, String author){
        this.name= name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println(this.name+ "was written by "+this.author);
    }


}
class Shop implements Printable{
    String address;
    String name;
    public Shop(String address, String name){
        this.address = address;
        this.name=name;
    }

    @Override
    public void print() {
        System.out.println(this.name+ "is the shop on "+this.address);
    }
}