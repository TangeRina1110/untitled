package Task7;
public class Books {
    private int years;
    private String name;
    private String author;
    public Books( String name, String author, int years){
        this.years = years;
        this.name = name;
        this.author = author;
    }
    public int getOld(){
        return years;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public void setYears(int years){
        this.years = years;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void infoBooks(){
        System.out.println("Name of the book - "+ name);
        System.out.print("The book was wrote by " + author + " in " + years);
    }
    @Override
    public String toString() {
        return "'"+name +"'"+ " wrote by " + author  + " in " + years;
    }
}