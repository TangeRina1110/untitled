package Task7;
import java.util.Scanner;
public class BooksTest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String author = sc.nextLine();
        int years = sc.nextInt();
        Books boo = new Books(name,author, years);
        boo.infoBooks();
        Books[] book = new Books[3];
        for(int i=0; i<3; i++){
            book[i] = new Books(sc.next(), sc.next(),sc.nextInt() );
        }
        BookShelf bs = new BookShelf(3, book);
        System.out.println("first: " + bs.first());
        System.out.println("last: " + bs.last());
        bs.sort();
        bs.print();
    }
}
