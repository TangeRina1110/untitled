package Task7;

import java.util.Arrays;
import java.util.Comparator;

public class BookShelf {
    int n = 0;

    public BookShelf(int n, Books[] books) {
        this.n = n;
        this.books = books;
    }

    Books[] books;

    public BookShelf(int n) {
        this.n = n;
        books = new Books[n];
    }
    public Books last(){
        Books max = books[0];
        for (Books book : books){
            if(book.getOld()>max.getOld()){
                max = book;
            }
        }
        return max;
    }
    public Books first(){
        Books min = books[0];
        for (Books book : books){
            if(book.getOld()<min.getOld()){
                min = book;
            }
        }
        return min;
    }

    public static Comparator<Books> nameComparator = new Comparator<Books>() {
        @Override
        public int compare(Books o1, Books o2) {
            return (int) (o1.getOld() - o2.getOld());
        }
    };

    public void sort(){
        Arrays.sort(books, BookShelf.nameComparator);
    }
    public void print(){
        for(int i=0; i<n; i++){
            System.out.println(books[i].toString());
        }
    }
}